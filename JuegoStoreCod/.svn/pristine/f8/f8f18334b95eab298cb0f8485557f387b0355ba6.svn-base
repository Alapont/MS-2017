package presentacion.comandos.imp;

import java.util.ArrayList;

import negocio.factoriaSA.FactoriaServicioAplicacion;
import negocio.videojuego.imp.TransferVideojuego;

import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioListaVideojuegoComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		ArrayList<TransferVideojuego> lista = FactoriaServicioAplicacion.getInstance().createSAVideojuego().listaVideojuego();
		return new Contexto(ListaComandos.MOSTRAR_LISTA_VIDEOJUEGO, lista);
	}

}
