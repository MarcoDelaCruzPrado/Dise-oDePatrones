package TFinalPatrones.Entities;

public class Producto {

	public int ProductoId;
	public String Nombre;
	public String Descripcion;
	public double PrecioVenta;
	public Marca Merca;
	public int getProductoId() {
		return ProductoId;
	}
	public void setProductoId(int productoId) {
		ProductoId = productoId;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecioVenta() {
		return PrecioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		PrecioVenta = precioVenta;
	}
	public Marca getMerca() {
		return Merca;
	}
	public void setMerca(Marca merca) {
		Merca = merca;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public TipoProducto getTipoProducto() {
		return TipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		TipoProducto = tipoProducto;
	}
	public int Stock;
	public TipoProducto TipoProducto;
}
