package presentacion.comandos.imp;

import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class VistaModificarClienteComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		return new Contexto(ListaComandos.VENTANA_MODIFICAR_CLIENTE, datos);
	}

}
