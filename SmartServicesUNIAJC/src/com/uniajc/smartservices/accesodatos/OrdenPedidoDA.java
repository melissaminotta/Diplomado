package com.uniajc.smartservices.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import com.uniajc.smartservices.modelo.OrdenPedidoTO;
import com.uniajc.smartservices.utilidades.Constantes;
import com.uniajc.smartservices.utilidades.ExceptionUtil;

public class OrdenPedidoDA {

	
	public ArrayList<OrdenPedidoTO> getOrdenPedido(String documentoIdentidadPG) throws ExceptionUtil {
		ArrayList<OrdenPedidoTO> arrListOrdenesPedido = new ArrayList<OrdenPedidoTO>();

		try {
			String sqlSentence = "SELECT " + "    PEGE.PEGE_DOCUMENTOIDENTIDAD, "
					+ "    PNGE.PENG_PRIMERAPELLIDO ||' ' || PNGE.PENG_SEGUNDOAPELLIDO ||' ' || PNGE.PENG_PRIMERNOMBRE ||' ' || PNGE.PENG_SEGUNDONOMBRE AS NOMBRE_COMPLETO, "
					+ "    ORPE.ORPE_ID," + "    ORPE.ORPE_NUMERO," + "    OPPS_CANTIDAD," + "    ORPE.ORPE_VALORTOTAL,"
					+ "    ORPE.ORPE_FECHA," + "    ORPE_ESTADO," + "    SERV.PRSE_NOMBRE " + "FROM "
					+ "    FACTURACIONV3.ORDENPEDIDO ORPE, " + "    FACTURACIONV3.ORDENPEDIDOPRODUCTOSEV PSERV, "
					+ "    FACTURACIONV3.PRODUCTOSERVICIO SERV, " + "    GENERAL.PERSONAGENERAL PEGE, "
					+ "    GENERAL.PERSONANATURALGENERAL PNGE " + "WHERE " + "PEGE.PEGE_ID=PNGE.PEGE_ID AND "
					+ "ORPE.PEGE_ID=PEGE.PEGE_ID AND " + "ORPE.ORPE_ID=PSERV.ORPE_ID AND "
					+ "PSERV.PRSE_ID=SERV.PRSE_ID AND	" + "PEGE.PEGE_DOCUMENTOIDENTIDAD = ?";

			Connection connection = DbConnPoolManager.getConnection(Constantes.DATA_SOURCE);
			PreparedStatement obPreparedStatement = connection.prepareStatement(sqlSentence);
			obPreparedStatement.setString(1, documentoIdentidadPG);
			ResultSet obResultSet = obPreparedStatement.executeQuery();
			while (obResultSet.next()) {

				OrdenPedidoTO obOrdenPedidoTO = new OrdenPedidoTO();

				obOrdenPedidoTO.setDocumentoIdentidadPG(obResultSet.getString("PEGE_DOCUMENTOIDENTIDAD"));
				obOrdenPedidoTO.setNombreCompletoPG(obResultSet.getString("NOMBRE_COMPLETO"));
				obOrdenPedidoTO.setIdOrdenPedido("" + obResultSet.getInt("ORPE_ID"));
				obOrdenPedidoTO.setNumeroOrdenPedido("" + obResultSet.getInt("ORPE_NUMERO"));
				obOrdenPedidoTO.setCantidad("" + obResultSet.getInt("OPPS_CANTIDAD"));
				obOrdenPedidoTO.setValorTotalOrdenPedido("" + obResultSet.getInt("ORPE_VALORTOTAL"));

				java.sql.Date sqlDateFechaOP = obResultSet.getDate("ORPE_FECHA");
				Calendar obCalendar = Calendar.getInstance();
				obCalendar.setTimeInMillis(sqlDateFechaOP.getTime());
				StringBuilder sbFechaOP = new StringBuilder();
				sbFechaOP.append(obCalendar.get(Calendar.YEAR));
				sbFechaOP.append("-");
				sbFechaOP.append(obCalendar.get(Calendar.MONTH));
				sbFechaOP.append("-");
				sbFechaOP.append(obCalendar.get(Calendar.DAY_OF_MONTH));
				obOrdenPedidoTO.setFechaOrdenPedido(sbFechaOP.toString());

				obOrdenPedidoTO.setEstadoOrdenPedido(obResultSet.getString("ORPE_ESTADO"));
				obOrdenPedidoTO.setNombreProductoServicio(obResultSet.getString("PRSE_NOMBRE"));

				arrListOrdenesPedido.add(obOrdenPedidoTO);
			}

		} catch (SQLException sqlEx) {
			throw new ExceptionUtil("Ocurrió un error en la sentencia sql, excepción: " + sqlEx.getMessage());
		}

		return arrListOrdenesPedido;
	}

	public ArrayList<OrdenPedidoTO> getOrdenPedidoPrueba(String documentoIdentidadPG) throws ExceptionUtil {

		ArrayList<OrdenPedidoTO> arrListOrdenesPedido = new ArrayList<OrdenPedidoTO>();

		if (documentoIdentidadPG.equals("987654321")) {
			OrdenPedidoTO obOrdenPedidoTO = new OrdenPedidoTO();
			obOrdenPedidoTO.setDocumentoIdentidadPG("4134134");
			obOrdenPedidoTO.setNombreCompletoPG("Cindy Carvajal");
			obOrdenPedidoTO.setIdOrdenPedido("11");
			obOrdenPedidoTO.setNumeroOrdenPedido("1234567");
			obOrdenPedidoTO.setCantidad("1");
			obOrdenPedidoTO.setValorTotalOrdenPedido("5000000");
			obOrdenPedidoTO.setFechaOrdenPedido("2017-07-23");
			obOrdenPedidoTO.setEstadoOrdenPedido("ACTIVA");
			obOrdenPedidoTO.setNombreProductoServicio("SERVICIO 1");

			arrListOrdenesPedido.add(obOrdenPedidoTO);
		} else if (documentoIdentidadPG.equals("98765432")) {
			OrdenPedidoTO obOrdenPedidoTO = new OrdenPedidoTO();

			obOrdenPedidoTO.setDocumentoIdentidadPG("4134134");
			obOrdenPedidoTO.setNombreCompletoPG("Cindy Carvajal");
			obOrdenPedidoTO.setIdOrdenPedido("11");
			obOrdenPedidoTO.setNumeroOrdenPedido("1234567");
			obOrdenPedidoTO.setCantidad("1");
			obOrdenPedidoTO.setValorTotalOrdenPedido("5000000");
			obOrdenPedidoTO.setFechaOrdenPedido("2017-07-23");
			obOrdenPedidoTO.setEstadoOrdenPedido("ACTIVA");
			obOrdenPedidoTO.setNombreProductoServicio("SERVICIO 1");

			OrdenPedidoTO obOrdenPedidoTO2 = new OrdenPedidoTO();
			obOrdenPedidoTO2.setDocumentoIdentidadPG("1111111");
			obOrdenPedidoTO2.setNombreCompletoPG("Mauricio Vergoglio");
			obOrdenPedidoTO2.setIdOrdenPedido("22");
			obOrdenPedidoTO2.setNumeroOrdenPedido("232323232");
			obOrdenPedidoTO2.setCantidad("1");
			obOrdenPedidoTO2.setValorTotalOrdenPedido("200000");
			obOrdenPedidoTO2.setFechaOrdenPedido("2017-07-23");
			obOrdenPedidoTO2.setEstadoOrdenPedido("ACTIVA");
			obOrdenPedidoTO2.setNombreProductoServicio("SERVICIO 2");

			arrListOrdenesPedido.add(obOrdenPedidoTO);
			arrListOrdenesPedido.add(obOrdenPedidoTO2);
		} else {
			throw new ExceptionUtil("Ocurrió un error en la sentencia sql, excepción: se reventó esta guevonada");
		}

		return arrListOrdenesPedido;
	}
}
