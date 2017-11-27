package negocio.compra.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import presentacion.controlador.Contexto;
import integracion.factoriaDao.FactoriaDAO;
import integracion.transactionManager.TransactionManager;
import negocio.videojuego.imp.TransferVideojuego;
import negocio.cliente.imp.TransferCliente;
import negocio.compra.ServicioAplicacionCompra;

public class ServicioAplicacionCompraImp implements ServicioAplicacionCompra {

	public TransferCompra iniciarCompra(int id){
		
		//Creamos una nueva transacción y la iniciamos.
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		//Montamos los Transfer
		TransferCompra tCompra = null;
		TransferCliente tCliente = FactoriaDAO.getInstance().createDAOCliente().searchId(id);
		
		//Si existe el cliente y esta activo
		if(tCliente != null && tCliente.getActivo())
			tCompra = new TransferCompra((int)tCliente.getId(), 0, true);
		
		//Finalmente cerramos la transación
		TransactionManager.getInstance().eliminaTransaccion();
		
		return tCompra;
	}
	
	public Contexto agregarArticulo(Contexto articulo){
		
		//Creamos una nueva transacción y la iniciamos.
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		//Montamos el Transfer
		TransferVideojuego tVideojuego = FactoriaDAO.getInstance().createDAOVideojuego().searchId(articulo.getEvento());
		
		//Si el juego no existe y no esta activo
		if(tVideojuego == null || !tVideojuego.isActivo())
			articulo = null;		
		
		//Finalmente cerramos la transaccion
		TransactionManager.getInstance().eliminaTransaccion();
		
		return articulo;
	}
	
	public int devolverArticulo(TransferLineaDeCompra tLineaCompra){
		int id;
		
		//Creamos la Transaccion
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		//Montamos el Transfer
		TransferLineaDeCompra lineaCompraAlmacenada = FactoriaDAO.getInstance().createDAOCompra().searchLineaCompra(tLineaCompra);
		
		//Si la Linea De Compra existe y esta activa
		if (lineaCompraAlmacenada != null && lineaCompraAlmacenada.isActivo()){
			
			//Montamos Transfer y los datos necesarios para las operaciones(la cantidad a devolver del articulo)
			TransferCompra tCompraId = FactoriaDAO.getInstance().createDAOCompra().searchId(tLineaCompra.getIdCompra());
			int cantidadDevolucion = lineaCompraAlmacenada.getCantidad() - tLineaCompra.getCantidad();
			
			//Operaciones y Comprobaciones  
			if(cantidadDevolucion <= 0){
				tCompraId.setCosteTotal(0);
				tLineaCompra.setCantidad(0);
				tLineaCompra.setActivo(false);
				id = -3;
			}
			else{
				tCompraId.setCosteTotal((cantidadDevolucion * tCompraId.getCosteTotal()) / lineaCompraAlmacenada.getCantidad());
				tLineaCompra.setCantidad(cantidadDevolucion);
				id = -2;
			}
			
			int auxResultado = FactoriaDAO.getInstance().createDAOCompra().devolucionArticulo(tCompraId, tLineaCompra);
			
			if (auxResultado == 0){
				TransactionManager.getInstance().getTransaccion().rollback();
				id = 0;
			}
			else
				TransactionManager.getInstance().getTransaccion().commit();
		}
		else 
			id = -1; // 
		
		//Finalmente Cerramos la Transaccion
		TransactionManager.getInstance().eliminaTransaccion();
		return id;
	}
	
	@Override
	public TransferCompra finalizarCompra(TransferCompra tCompra){
		
		//Creamos la Transaccion y los datos necesarios(lista de articulos a quitar y el iterador para recorrerla)
		ArrayList<Integer> articulosQuitar = new ArrayList<Integer>();
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		Iterator<Entry<Integer, Integer>> it = tCompra.getLineaCompra().entrySet().iterator();
		
		//Bucle mientras haya articulos
		while (it.hasNext()){
			Map.Entry<Integer, Integer> t = (Map.Entry<Integer, Integer>) it.next();
			TransferVideojuego tb = FactoriaDAO.getInstance().createDAOVideojuego().searchId(t.getKey());
			
			if(tb == null || !tb.isActivo()){
				tCompra.setLog("Articulo: " + t.getKey() + " no ha podido ser agregado");
				articulosQuitar.add(t.getKey());
			}
			else {
				tCompra.setLog("Articulo: " + t.getKey() + " ha podido ser agregado");
				tCompra.setCosteTotal(tCompra.getCosteTotal() + tb.getPrecio() * t.getValue());
			}
		}
		
		//Borramos los articulos
		for(int i = 0; i < articulosQuitar.size(); ++i)
			tCompra.removeLineaCompra(articulosQuitar.get(i));
		
		//Introducimos rl resultado 
		int resultado = FactoriaDAO.getInstance().createDAOCompra().add(tCompra);
		
		if(resultado == 0)
			tCompra = null;
		
		//Finalmente cerramos la Transaccion
		TransactionManager.getInstance().eliminaTransaccion();
		return tCompra;
	}

	@Override
	public TransferCompra detalleCompra(int id) {
		
		//Creamos la Transaccion
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		//Hacemos Commit 
		TransferCompra t = FactoriaDAO.getInstance().createDAOCompra().searchId(id);
		TransactionManager.getInstance().getTransaccion().commit();
		
		//Finalmente cerramos la Transaccion
		TransactionManager.getInstance().eliminaTransaccion();
		return t;
	}

	@Override
	public ArrayList<TransferCompra> listaCompra() {
		
		//Creamos la Transaccion
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		ArrayList<TransferCompra> lista = FactoriaDAO.getInstance().createDAOCompra().list();
		
		//Hacemos Commit
		TransactionManager.getInstance().getTransaccion().commit();
		
		//Finalmnete cerramos la Transaccion
		TransactionManager.getInstance().eliminaTransaccion();
		return lista;
	}
}
