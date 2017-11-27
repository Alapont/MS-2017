package presentacion.vistas.vistaVideojuego;

import presentacion.controlador.Contexto;

public abstract class VistaVideojuego 
{
	private static VistaVideojuego instance;

	public static VistaVideojuego getInstance() 
	{
		if(instance == null)
			instance = new VistaVideojuegoImp();
		return instance;
	}

	public abstract void update(Contexto contexto);
}