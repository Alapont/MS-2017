package presentacion.comandos.imp;

import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;
import presentacion.controlador.PareadoQuery;

public class NegocioCantidadVideojuegosComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		int ejecucion = FactoriaServicioAplicacion.getInstance().createSAVideojuego().numeroVideojuegos((PareadoQuery)datos);
		return new Contexto(ListaComandos.MOSTRAR_CANTIDAD_VIDEOJUEGOS_QUERY, ejecucion);
	}

}
