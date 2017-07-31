package com.uniajc.smartservices.logicanegocio.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.uniajc.smartservices.logicanegocio.OrdenPedidoBL;
import com.uniajc.smartservices.utilidades.ExceptionUtil;

public class OrdenPedidoBLTest {

	private String ordenesPedidoJSonValido = "{\"ordenespedido\":[{\"DocumentoIdentidadPG\":\"4134134\",\"NombreCompletoPG\":\"Cindy Carvajal\",\"IdOrdenPedido\":\"11\",\"NumeroOrdenPedido\":\"1234567\",\"Cantidad\":\"1\",\"ValorTotalOrdenPedido\":\"5000000\",\"FechaOrdenPedido\":\"2017-07-23\",\"EstadoOrdenPedido\":\"ACTIVA\",\"NombreProductoServicio\":\"SERVICIO 1\"}]}";
	private String ordenesPedidoJSonInValido = "{[{\"DocumentoIdentidadPG\":\"4134134\",\"NombreCompletoPG\":\"Cindy Carvajal\",\"IdOrdenPedido\":\"11\",\"NumeroOrdenPedido\":\"1234567\",\"Cantidad\":\"1\",\"ValorTotalOrdenPedido\":\"5000000\",\"FechaOrdenPedido\":\"2017-07-23\",\"EstadoOrdenPedido\":\"ACTIVA\",\"NombreProductoServicio\":\"SERVICIO 1\"}]}";
	private String documentoIdentidadPG = "987654321";
	
	@Test
	public void getOrdenPedidoValido() {
		boolean resultadoPrueba = false;
		OrdenPedidoBL obOrdenPedidoBL = new OrdenPedidoBL();
		try {
			String ordenesPedidoJson = obOrdenPedidoBL.getOrdenPedido(documentoIdentidadPG);
			if(ordenesPedidoJson != null && ordenesPedidoJson.equalsIgnoreCase(ordenesPedidoJSonValido)) {
				resultadoPrueba = true;
			}
		} catch (ExceptionUtil e) {
			resultadoPrueba = false;
		}
		
		assertTrue(resultadoPrueba);
	}
	
	@Test
	public void getOrdenPedidoInValido() {
		boolean resultadoPrueba = true;
		OrdenPedidoBL obOrdenPedidoBL = new OrdenPedidoBL();
		try {
			String ordenesPedidoJson = obOrdenPedidoBL.getOrdenPedido(documentoIdentidadPG);
			if(ordenesPedidoJson != null && !ordenesPedidoJson.equalsIgnoreCase(ordenesPedidoJSonInValido)) {
				resultadoPrueba = false;
			}
		} catch (ExceptionUtil e) {
			resultadoPrueba = false;
		}
		
		assertFalse(resultadoPrueba);
	}

}
