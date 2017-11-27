package presentacion.comandos.imp;

import negocio.factoriaSA.FactoriaServicioAplicacion;
import negocio.videojuego.imp.TransferVideojuego;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioModificarVideojuegoComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		int id = FactoriaServicioAplicacion.getInstance().createSAVideojuego().modificarVideojuego((TransferVideojuego)datos);
		return new Contexto(ListaComandos.MOSTRAR_MODIFICAR_VIDEOJUEGO, id);
	}

}
