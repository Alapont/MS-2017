package presentacion.comandos.imp;

import negocio.factoriaSA.FactoriaServicioAplicacion;
import negocio.videojuego.imp.TransferVideojuego;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioAltaVideojuegoComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		int id = FactoriaServicioAplicacion.getInstance().createSAVideojuego().altaVideojuego((TransferVideojuego)datos);
		return new Contexto(ListaComandos.MOSTRAR_ALTA_VIDEOJUEGO, id);
	}

}
