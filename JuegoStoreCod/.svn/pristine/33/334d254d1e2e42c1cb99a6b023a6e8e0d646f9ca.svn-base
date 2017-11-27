package presentacion.dispatcher;

import presentacion.ListaComandos;
import presentacion.controlador.Contexto;
import presentacion.vistas.vistaVideojuego.VistaVideojuego;
import presentacion.vistas.vistaCliente.VistaCliente;
import presentacion.vistas.vistaCompra.VistaCompra;
import presentacion.vistas.vistaPrincipal.VistaPrincipal;

public class DispatcherImp extends Dispatcher{
	
	@Override
	public void accion(Contexto contexto){
		switch(contexto.getEvento()){
			/*
			 * Hemos hecho el dispatcher de esta forma, usandolo como intermediario entre el controlador
			 * y las vistas, ya que usamos un concentrador (singleton) para actualizar las vistas.
			 */
		
			// Vista Principal
		
			case ListaComandos.VENTANA_PRINCIPAL:
				VistaPrincipal.getInstance().update(contexto);
				break;

			// Vista Cliente
			
			case ListaComandos.VENTANA_ALTA_CLIENTE:
			case ListaComandos.VENTANA_BAJA_CLIENTE:
			case ListaComandos.VENTANA_PRINCIPAL_CLIENTE:
			case ListaComandos.VENTANA_DETALLE_CLIENTE:
			case ListaComandos.VENTANA_LISTA_CLIENTE:
			case ListaComandos.VENTANA_MODIFICAR_CLIENTE:
			case ListaComandos.VENTANA_NUMERO_CLIENTES_QUERY:
			case ListaComandos.MOSTRAR_ALTA_CLIENTE:	
			case ListaComandos.MOSTRAR_BAJA_CLIENTE:	
			case ListaComandos.MOSTRAR_DETALLE_CLIENTE:	
			case ListaComandos.MOSTRAR_LISTA_CLIENTE:	
			case ListaComandos.MOSTRAR_MODIFICAR_CLIENTE:	
			case ListaComandos.MOSTRAR_NUMERO_CLIENTES_QUERY:
				VistaCliente.getInstance().update(contexto);
				break;
				
			// Vista Compra
			
			case ListaComandos.VENTANA_AGREGAR_ARTICULO_COMPRA:
			case ListaComandos.VENTANA_PRINCIPAL_COMPRA:
			case ListaComandos.VENTANA_DETALLE_COMPRA:
			case ListaComandos.VENTANA_DEVOLUCION_COMPRA:
			case ListaComandos.VENTANA_ELIMINAR_ARTICULO_COMPRA:
			case ListaComandos.VENTANA_GESTION_CARRITO_COMPRA:
			case ListaComandos.VENTANA_INICIAR_COMPRA:
			case ListaComandos.VENTANA_LISTA_COMPRA:	
			case ListaComandos.MOSTRAR_GESTION_CARRITO_COMPRA:
			case ListaComandos.MOSTRAR_AGREGAR_ARTICULO_COMPRA:
			case ListaComandos.MOSTRAR_ELIMINAR_ARTICULO_COMPRA:
			case ListaComandos.MOSTRAR_DEVOLUCION_ARTICULO_COMPRA:
			case ListaComandos.MOSTRAR_DETALLE_COMPRA:
			case ListaComandos.MOSTRAR_LISTA_COMPRA:
			case ListaComandos.MOSTRAR_FINALIZAR_COMPRA:
				VistaCompra.getInstance().update(contexto);
				break;				
		
			// Vista Videojuego
		
			case ListaComandos.VENTANA_ALTA_VIDEOJUEGO_PC:
			case ListaComandos.VENTANA_ALTA_VIDEOJUEGO_CONSOLA:
			case ListaComandos.VENTANA_BAJA_VIDEOJUEGO:
			case ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO:
			case ListaComandos.VENTANA_DETALLE_VIDEOJUEGO:
			case ListaComandos.VENTANA_LISTA_VIDEOJUEGO:
			case ListaComandos.VENTANA_MODIFICAR_VIDEOJUEGO_PC:
			case ListaComandos.VENTANA_MODIFICAR_VIDEOJUEGO_CONSOLA:
			case ListaComandos.VENTANA_CANTIDAD_VIDEOJUEGOS_QUERY:
			case ListaComandos.MOSTRAR_ALTA_VIDEOJUEGO:	
			case ListaComandos.MOSTRAR_BAJA_VIDEOJUEGO:	
			case ListaComandos.MOSTRAR_DETALLE_VIDEOJUEGO:	
			case ListaComandos.MOSTRAR_LISTA_VIDEOJUEGO:	
			case ListaComandos.MOSTRAR_MODIFICAR_VIDEOJUEGO:	
			case ListaComandos.MOSTRAR_CANTIDAD_VIDEOJUEGOS_QUERY:
				VistaVideojuego.getInstance().update(contexto);
				break;
		}
	}
}