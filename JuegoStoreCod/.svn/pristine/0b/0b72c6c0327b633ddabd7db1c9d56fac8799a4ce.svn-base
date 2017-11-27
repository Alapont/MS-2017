package presentacion.comandos.imp;

import negocio.compra.imp.TransferCompra;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioDetalleCompraComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		TransferCompra id = FactoriaServicioAplicacion.getInstance().createSACompra().detalleCompra((int) datos);
		return new Contexto (ListaComandos.NEGOCIO_DETALLE_COMPRA, id);
	}

}
