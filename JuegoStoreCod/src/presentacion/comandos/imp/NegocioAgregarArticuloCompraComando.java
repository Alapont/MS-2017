package presentacion.comandos.imp;

import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioAgregarArticuloCompraComando implements Comando{

	@Override
	public Contexto execute(Object datos) {
		datos = FactoriaServicioAplicacion.getInstance().createSACompra().agregarArticulo((Contexto) datos);
		return new Contexto(ListaComandos.NEGOCIO_AGREGAR_ARTICULO_COMPRA, datos);
		}

}
