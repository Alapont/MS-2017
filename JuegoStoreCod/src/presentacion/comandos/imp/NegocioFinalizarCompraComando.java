package presentacion.comandos.imp;

import negocio.compra.imp.TransferCompra;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioFinalizarCompraComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		TransferCompra resultado = FactoriaServicioAplicacion.getInstance().createSACompra().finalizarCompra((TransferCompra) datos);
		return new Contexto (ListaComandos.NEGOCIO_FINALIZAR_COMPRA, resultado);
	}

}
