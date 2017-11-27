package presentacion.comandos.imp;

import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioEliminarArticuloCompraComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		return new Contexto (ListaComandos.NEGOCIO_ELIMINAR_ARTICULO_COMPRA, datos);
	}
	

}
