package com.uniajc.smartservices.modelo;

public class OrdenPedidoTO {
	
	private String documentoIdentidadPG;
	private String nombreCompletoPG;
	private String idOrdenPedido;
	private String numeroOrdenPedido;
	private String cantidad;
	private String valorTotalOrdenPedido;
	private String fechaOrdenPedido;
	private String estadoOrdenPedido;
	private String nombreProductoServicio;
	
	public OrdenPedidoTO() {
		
	}
	
	public OrdenPedidoTO(String documentoIdentidadPG,String nombreCompletoPG,
			String idOrdenPedido,String numeroOrdenPedido,String cantidad,
			String valorTotalOrdenPedido,String fechaOrdenPedido,String estadoOrdenPedido,
			String nombreProductoServicio) {
		this.setDocumentoIdentidadPG(documentoIdentidadPG);
		this.setNombreCompletoPG(nombreCompletoPG);
		this.setNumeroOrdenPedido(numeroOrdenPedido);
		this.setIdOrdenPedido(idOrdenPedido);
		this.setNumeroOrdenPedido(numeroOrdenPedido);
		this.setCantidad(cantidad);
		this.setValorTotalOrdenPedido(valorTotalOrdenPedido);
		this.setFechaOrdenPedido(fechaOrdenPedido);
		this.setEstadoOrdenPedido(estadoOrdenPedido);
		this.setNombreProductoServicio(nombreProductoServicio);
	}
	
	@Override
    public String toString() {
        return "DocumentoIdentidadPG=" + documentoIdentidadPG + ", NombreCompletoPG=" + nombreCompletoPG + ", IdOrdenPedido="
                + idOrdenPedido + ", NumeroOrdenPedido=" + numeroOrdenPedido+", Cantidad=" + cantidad+
                ", ValorTotalOrdenPedido=" + valorTotalOrdenPedido+", FechaOrdenPedido=" + fechaOrdenPedido+
                ", EstadoOrdenPedido=" + estadoOrdenPedido+", NombreProductoServicio=" + nombreProductoServicio;
    }
	
	public String toJson() {
		
		StringBuilder obStringBuilder = new StringBuilder();
		obStringBuilder.append("{");
		obStringBuilder.append("\"");
		obStringBuilder.append("DocumentoIdentidadPG");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(documentoIdentidadPG);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("NombreCompletoPG");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(nombreCompletoPG);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("IdOrdenPedido");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(idOrdenPedido);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("NumeroOrdenPedido");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(numeroOrdenPedido);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("Cantidad");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(cantidad);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("ValorTotalOrdenPedido");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(valorTotalOrdenPedido);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("FechaOrdenPedido");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(fechaOrdenPedido);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("EstadoOrdenPedido");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(estadoOrdenPedido);
		obStringBuilder.append("\"");
		obStringBuilder.append(",");
		
		obStringBuilder.append("\"");
		obStringBuilder.append("NombreProductoServicio");
		obStringBuilder.append("\"");
		obStringBuilder.append(":");
		obStringBuilder.append("\"");
		obStringBuilder.append(nombreProductoServicio);
		obStringBuilder.append("\"");
		obStringBuilder.append("}");
        return obStringBuilder.toString();
    }
	
	public String getDocumentoIdentidadPG() {
		return documentoIdentidadPG;
	}
	public void setDocumentoIdentidadPG(String documentoIdentidadPG) {
		this.documentoIdentidadPG = documentoIdentidadPG;
	}
	public String getNombreCompletoPG() {
		return nombreCompletoPG;
	}
	public void setNombreCompletoPG(String nombreCompletoPG) {
		this.nombreCompletoPG = nombreCompletoPG;
	}
	public String getIdOrdenPedido() {
		return idOrdenPedido;
	}
	public void setIdOrdenPedido(String idOrdenPedido) {
		this.idOrdenPedido = idOrdenPedido;
	}
	public String getNumeroOrdenPedido() {
		return numeroOrdenPedido;
	}
	public void setNumeroOrdenPedido(String numeroOrdenPedido) {
		this.numeroOrdenPedido = numeroOrdenPedido;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getValorTotalOrdenPedido() {
		return valorTotalOrdenPedido;
	}
	public void setValorTotalOrdenPedido(String valorTotalOrdenPedido) {
		this.valorTotalOrdenPedido = valorTotalOrdenPedido;
	}
	public String getFechaOrdenPedido() {
		return fechaOrdenPedido;
	}
	public void setFechaOrdenPedido(String fechaOrdenPedido) {
		this.fechaOrdenPedido = fechaOrdenPedido;
	}
	public String getEstadoOrdenPedido() {
		return estadoOrdenPedido;
	}
	public void setEstadoOrdenPedido(String estadoOrdenPedido) {
		this.estadoOrdenPedido = estadoOrdenPedido;
	}
	public String getNombreProductoServicio() {
		return nombreProductoServicio;
	}
	public void setNombreProductoServicio(String nombreProductoServicio) {
		this.nombreProductoServicio = nombreProductoServicio;
	}
	
}
