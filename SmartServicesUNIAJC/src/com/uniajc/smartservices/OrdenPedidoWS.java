package com.uniajc.smartservices;

import com.uniajc.smartservices.logicanegocio.OrdenPedidoBL;
import com.uniajc.smartservices.utilidades.ExceptionUtil;

public class OrdenPedidoWS {

	public String getOrdenPedido(String documentoIdentidadPG) {
		String jsonResult = null;
		try {
			OrdenPedidoBL obOrdenPedidoBL = new OrdenPedidoBL();
			
			jsonResult = obOrdenPedidoBL.getOrdenPedido(documentoIdentidadPG);
		}catch(ExceptionUtil ex) {
			jsonResult = "";
		}
		
		return jsonResult;
	}
}
