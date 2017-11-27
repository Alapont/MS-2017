package negocio.videojuego.imp;

public class TransferVideojuegoConsola extends TransferVideojuego{
	
	protected String MarcaConsola;
	
	public TransferVideojuegoConsola(int id, String nombre, String desarrollador, double precio, String marca, boolean activo) {
		super(id, nombre, desarrollador, precio, activo);
		this.MarcaConsola = marca;
	}

	public TransferVideojuegoConsola(String nombre, String desarrollador, double precio, String marca, boolean activo) {
		super(nombre, desarrollador, precio, activo);
		this.MarcaConsola = marca;
	}

	public String getMarcaConsola() {
		return MarcaConsola;
	}

	public void setMarcaConsola(String marcaConsola) {
		MarcaConsola = marcaConsola;
	}
	
	public String toString (){
		return "Id: " + id + " Nombre: " + nombre + " Desarrollador: " + desarrollador + " Precio: " + precio + " MarcaConsola: " + MarcaConsola +  " Activo: " + activo;
	}
}
