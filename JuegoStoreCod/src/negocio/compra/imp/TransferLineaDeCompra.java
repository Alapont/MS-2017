package negocio.compra.imp;

public class TransferLineaDeCompra {
	private int idCompra;
	private int idArticulo;
	private int cantidad;
	private int cantidadNueva;
	private boolean activo;
	
	//Constructor (se usa al crear una linea de compra)
	public TransferLineaDeCompra(int idCompra, int idArticulo, int cantidad){
		this.idCompra = idCompra;
		this.idArticulo = idArticulo;
		this.cantidad = cantidad;
		activo = true;
	}
	
	//Constructor con todos los parametros
	public TransferLineaDeCompra(int idCompra, int idArticulo, int cantidad, boolean activo){
		this.idCompra = idCompra;
		this.idArticulo = idArticulo;
		this.cantidad = cantidad;
		this.activo = activo;
	}
	
	//Getters y Setters
	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public int getCantidadNueva() {
		return cantidadNueva;
	}

	public void setCantidadNueva(int cantidadNueva) {
		this.cantidadNueva = cantidadNueva;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setCantidad(int cantidadDevolucion) {
		this.cantidad = cantidadDevolucion;
		
	}

	public void setActivo(boolean b) {
		this.activo = b;
		
	}

}
