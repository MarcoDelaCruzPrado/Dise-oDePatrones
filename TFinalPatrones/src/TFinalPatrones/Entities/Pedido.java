package TFinalPatrones.Entities;

import java.util.Date;
import java.util.List;

public class Pedido {

	public int PedidoId;
	public Date FechaCreacion;
	public String Estado;
	
	public Usuario Cliente;
	public List<DetallePedido> ListDetallePedido;
	public int getPedidoId() {
		return PedidoId;
	}
	public void setPedidoId(int pedidoId) {
		PedidoId = pedidoId;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Usuario getCliente() {
		return Cliente;
	}
	public void setCliente(Usuario cliente) {
		Cliente = cliente;
	}
	public List<DetallePedido> getListDetallePedido() {
		return ListDetallePedido;
	}
	public void setListDetallePedido(List<DetallePedido> listDetallePedido) {
		ListDetallePedido = listDetallePedido;
	}
	
	
}
