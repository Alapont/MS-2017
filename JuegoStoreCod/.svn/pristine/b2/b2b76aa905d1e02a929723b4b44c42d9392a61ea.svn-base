package presentacion.comandos.imp;

import java.util.ArrayList;

import negocio.cliente.imp.TransferCliente;
import negocio.factoriaSA.FactoriaServicioAplicacion;

import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioListaClienteComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		ArrayList<TransferCliente> lista = FactoriaServicioAplicacion.getInstance().createSACliente().listaCliente();
		return new Contexto (ListaComandos.NEGOCIO_LISTA_CLIENTE, lista);
	}

}
