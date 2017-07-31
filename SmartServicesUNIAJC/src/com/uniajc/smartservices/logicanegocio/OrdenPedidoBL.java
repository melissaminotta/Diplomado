package com.uniajc.smartservices.logicanegocio;

import java.util.ArrayList;

import com.uniajc.smartservices.accesodatos.OrdenPedidoDA;
import com.uniajc.smartservices.modelo.OrdenPedidoTO;
import com.uniajc.smartservices.utilidades.ExceptionUtil;

public class OrdenPedidoBL {

	public String getOrdenPedido(String documentoIdentidadPG) throws ExceptionUtil{
		StringBuilder jsonResult = new StringBuilder();
		
		OrdenPedidoDA obOrdenPedidoDA = new OrdenPedidoDA();
		ArrayList<OrdenPedidoTO> arrListOrdenesPedido = obOrdenPedidoDA.getOrdenPedidoPrueba(documentoIdentidadPG);
		//ArrayList<OrdenPedidoTO> arrListOrdenesPedido = obOrdenPedidoDA.getOrdenPedido(documentoIdentidadPG);
		if(arrListOrdenesPedido.size()>0) {
			jsonResult.append("{");
			jsonResult.append("\"ordenespedido\":");
			jsonResult.append("[");
			
			
			for(OrdenPedidoTO obOrdenPedidoTO : arrListOrdenesPedido) {
				jsonResult.append(obOrdenPedidoTO.toJson());
				jsonResult.append(",");
			}
			
			jsonResult.replace(jsonResult.length()-1, jsonResult.length(), "");
			
			jsonResult.append("]");
			jsonResult.append("}");
		}
				
		return jsonResult.toString();
	}
}
