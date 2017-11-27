package negocio.videojuego.imp;

import integracion.factoriaDao.FactoriaDAO;
import integracion.transactionManager.TransactionManager;

import java.util.ArrayList;

import presentacion.controlador.PareadoQuery;
import negocio.videojuego.ServicioAplicacionVideojuego;

public class ServicioAplicacionVideojuegoImp implements ServicioAplicacionVideojuego{

	@Override
	public int altaVideojuego(TransferVideojuego t) {
		int id;
		
		//Creamos una nueva transacción y la iniciamos.
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		TransferVideojuego tVideojuego = FactoriaDAO.getInstance().createDAOVideojuego().search(t);
		
		//Si no existe el videojuego
		if(tVideojuego == null){
			id = FactoriaDAO.getInstance().createDAOVideojuego().add(tVideojuego);
			if(id == 0){
				TransactionManager.getInstance().getTransaccion().rollback();
			}
			else{
				TransactionManager.getInstance().getTransaccion().commit();
			}
		}
		else{
			if(tVideojuego.isActivo() == false){
				tVideojuego.setActivo(true);
				
				id = FactoriaDAO.getInstance().createDAOVideojuego().update(tVideojuego);
				if(id == 0){
					TransactionManager.getInstance().getTransaccion().rollback();
				}
				else{
					TransactionManager.getInstance().getTransaccion().commit();
				}
			}
			else{
				id = -1; //Videojuego ya existe y esta activo
			}
		}
		
		//Finalmente cerramos la transación
		TransactionManager.getInstance().eliminaTransaccion();
		return id;
	}

	@Override
	public int bajaVideojuego(int idAux) {
		int id;
		
		//Creamos una nueva transacción y la iniciamos.
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();

		TransferVideojuego tb = FactoriaDAO.getInstance().createDAOVideojuego().searchId(idAux);
		
		if (tb != null){
		    if (tb.isActivo() == true) {
			    tb.setActivo(false);
			    id = FactoriaDAO.getInstance().createDAOVideojuego().update(tb);
				if (id == 0){
					TransactionManager.getInstance().getTransaccion().rollback();
				}
				else{
					TransactionManager.getInstance().getTransaccion().commit();
				}
			}
			else{
				id = -2; //Videojuego no activo
			}
		}
		else{
			id = -1; //Videojuego no existe
		}
		
		//Cerramos la transacción
		TransactionManager.getInstance().eliminaTransaccion();
		return id;
	}

	@Override
	public int modificarVideojuego(TransferVideojuego t) {
		int id;
		
		//Creamos e iniciamos la transacción
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		//Obtenemos el transfer del videojuego por el id
		TransferVideojuego tVideojuego = FactoriaDAO.getInstance().createDAOVideojuego().searchId(t.getId());
		
		if (tVideojuego != null) {
			if(tVideojuego.isActivo()) {
				
				//Buscamos ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿????????????????????????????????????????
				TransferVideojuego tExistMarca = FactoriaDAO.getInstance().createDAOVideojuego().search(t);
				
				//
			    if (tExistMarca == null || tExistMarca.getId() == tVideojuego.getId()) {
			    	
			    	//
			    	if((t instanceof TransferVideojuegoPC && tVideojuego instanceof TransferVideojuegoPC) || (t instanceof TransferVideojuegoConsola && tVideojuego instanceof TransferVideojuegoConsola)) {
				    	
			    		id = FactoriaDAO.getInstance().createDAOVideojuego().update(t);
						if (id == 0){
							TransactionManager.getInstance().getTransaccion().rollback();
						}
						else {
							TransactionManager.getInstance().getTransaccion().commit();
						}
						
			    	}
			    	else {
			    		id = -4;
			    	}
				}
				else{
					id = -3; //	
				}
			}
			else{
				id = -2; //Videojuego no activo
			}
		}
		else{
			id = -1; //Videojuego no existe
		}
		
		//Cerramos la transacción
		TransactionManager.getInstance().eliminaTransaccion();
		return id;
	}

	@Override
	public TransferVideojuego detalleVideojuego(int id) {
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		TransferVideojuego tVideojuego = FactoriaDAO.getInstance().createDAOVideojuego().searchId(id);
		TransactionManager.getInstance().getTransaccion().commit();
		
		TransactionManager.getInstance().eliminaTransaccion();
		return tVideojuego;
	}

	@Override
	public ArrayList<TransferVideojuego> listaVideojuego() {
		TransactionManager.getInstance().nuevaTransaccion();
		TransactionManager.getInstance().getTransaccion().start();
		
		ArrayList<TransferVideojuego> listaVideojuegos = FactoriaDAO.getInstance().createDAOVideojuego().list();	
		TransactionManager.getInstance().getTransaccion().commit();
		
		TransactionManager.getInstance().eliminaTransaccion();
		return listaVideojuegos;
	}

	@Override
	public int numeroVideojuegos(PareadoQuery pQuery) {
		return 0;
	}

}
