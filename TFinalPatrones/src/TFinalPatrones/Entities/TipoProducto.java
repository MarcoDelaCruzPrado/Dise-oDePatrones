package TFinalPatrones.Entities;

public class TipoProducto {

	public int ProductoId;
	public String Nombre;
	public String Descripcion;
	public String Estado;
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
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
