package TFinalPatrones.Entities;

public class DetallePedido {

	public int DetallePedidoId;
	public Producto Producto;
	public int Cantidad;
	public double PrecioUnitario;
	
	public int getDetallePedidoId() {
		return DetallePedidoId;
	}
	public void setDetallePedidoId(int detallePedidoId) {
		DetallePedidoId = detallePedidoId;
	}
	public Producto getProducto() {
		return Producto;
	}
	public void setProducto(Producto producto) {
		Producto = producto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	
	
}
