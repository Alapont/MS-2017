package presentacion.comandos.imp;

import negocio.cliente.imp.TransferCliente;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioDetalleClienteComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		TransferCliente id = FactoriaServicioAplicacion.getInstance().createSACliente().detalleCliente((int) datos);
		return new Contexto (ListaComandos.NEGOCIO_DETALLE_CLIENTE, id);
	}

}
