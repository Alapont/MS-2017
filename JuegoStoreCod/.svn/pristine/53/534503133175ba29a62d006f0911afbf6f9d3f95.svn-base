package presentacion.comandos.imp;

import negocio.cliente.imp.TransferCliente;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioAltaClienteComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		int id = FactoriaServicioAplicacion.getInstance().createSACliente().altaCliente((TransferCliente) datos);
		return new Contexto (ListaComandos.NEGOCIO_ALTA_CLIENTE, id);
	}

}
