package TFinalPatrones.Entities;

import java.util.Date;

public class Transaccion {

	public int TransaccionId;
	public Date FechaTransaccion;
	public String Descripcion;
	public Usuario Cliente;
	public int getTransaccionId() {
		return TransaccionId;
	}
	public void setTransaccionId(int transaccionId) {
		TransaccionId = transaccionId;
	}
	public Date getFechaTransaccion() {
		return FechaTransaccion;
	}
	public void setFechaTransaccion(Date fechaTransaccion) {
		FechaTransaccion = fechaTransaccion;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Usuario getCliente() {
		return Cliente;
	}
	public void setCliente(Usuario cliente) {
		Cliente = cliente;
	}
	
}
