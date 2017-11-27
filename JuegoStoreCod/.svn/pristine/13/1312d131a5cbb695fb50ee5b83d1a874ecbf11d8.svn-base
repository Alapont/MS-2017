package presentacion.comandos.imp;

import negocio.compra.imp.TransferCompra;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioGestionCarritoCompraComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		TransferCompra t = FactoriaServicioAplicacion.getInstance().createSACompra().iniciarCompra((int)datos);
		return new Contexto (ListaComandos.NEGOCIO_GESTION_CARRITO_COMPRA, t);
	}
		

}
