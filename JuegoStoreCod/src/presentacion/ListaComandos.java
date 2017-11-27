package presentacion;

/**
 * Esta clase permite la agrupacion de los enumerados que permiten gestionar los eventos de la capa presentacion, dandoles un nombre descriptivo.
 */
public class ListaComandos {
	// Vista Principal
	
    public static final int VENTANA_PRINCIPAL		 				= 101;
    
    // Vista Videojuego
    
    public static final int VENTANA_ALTA_VIDEOJUEGO_PC 				= 201;
    public static final int VENTANA_ALTA_VIDEOJUEGO_CONSOLA 		= 202;
    public static final int VENTANA_BAJA_VIDEOJUEGO					= 203;
    public static final int VENTANA_PRINCIPAL_VIDEOJUEGO 			= 204;
    public static final int VENTANA_DETALLE_VIDEOJUEGO				= 205;
    public static final int VENTANA_LISTA_VIDEOJUEGO 				= 206;
    public static final int VENTANA_MODIFICAR_VIDEOJUEGO_PC 		= 207;
    public static final int VENTANA_MODIFICAR_VIDEOJUEGO_CONSOLA	= 208;
    
    // Vista Cliente
    
    public static final int VENTANA_ALTA_CLIENTE		 			= 301;
    public static final int VENTANA_BAJA_CLIENTE					= 302;
    public static final int VENTANA_PRINCIPAL_CLIENTE	 			= 303;
    public static final int VENTANA_DETALLE_CLIENTE 				= 304;
    public static final int VENTANA_LISTA_CLIENTE	 				= 305;
    public static final int VENTANA_MODIFICAR_CLIENTE				= 306;
    
    // Vista Compra
    
    public static final int VENTANA_AGREGAR_ARTICULO_COMPRA 		= 401;
    public static final int VENTANA_PRINCIPAL_COMPRA				= 402;
    public static final int VENTANA_DETALLE_COMPRA 					= 403;
    public static final int VENTANA_DEVOLUCION_COMPRA 				= 404;
    public static final int VENTANA_ELIMINAR_ARTICULO_COMPRA		= 405;
    public static final int VENTANA_GESTION_CARRITO_COMPRA			= 406;
    public static final int VENTANA_INICIAR_COMPRA 					= 407;
    public static final int VENTANA_LISTA_COMPRA 					= 408;

    // Negocio Videojuego
    
    public static final int NEGOCIO_ALTA_VIDEOJUEGO	 				= 211;
    public static final int NEGOCIO_BAJA_VIDEOJUEGO					= 212;
    public static final int NEGOCIO_DETALLE_VIDEOJUEGO 				= 213;
    public static final int NEGOCIO_LISTA_VIDEOJUEGO 				= 214;
    public static final int NEGOCIO_MODIFICAR_VIDEOJUEGO			= 215;
   
    // Negocio Cliente
    
    public static final int NEGOCIO_ALTA_CLIENTE 					= 311;
    public static final int NEGOCIO_BAJA_CLIENTE 					= 312;
    public static final int NEGOCIO_DETALLE_CLIENTE					= 313;
    public static final int NEGOCIO_LISTA_CLIENTE 					= 314;
    public static final int NEGOCIO_MODIFICAR_CLIENTE				= 315;
   
    // Negocio Compra
    
    public static final int NEGOCIO_AGREGAR_ARTICULO_COMPRA 		= 411;
    public static final int NEGOCIO_DETALLE_COMPRA 					= 412;
    public static final int NEGOCIO_DEVOLUCION_COMPRA 				= 413;
    public static final int NEGOCIO_ELIMINAR_ARTICULO_COMPRA		= 414;
    public static final int NEGOCIO_GESTION_CARRITO_COMPRA			= 415;
    public static final int NEGOCIO_LISTA_COMPRA 					= 416;
    public static final int NEGOCIO_FINALIZAR_COMPRA				= 417;

    // Mostrar Videojuego
    
    public static final int MOSTRAR_ALTA_VIDEOJUEGO		 			= 221;
    public static final int MOSTRAR_BAJA_VIDEOJUEGO					= 222;
    public static final int MOSTRAR_DETALLE_VIDEOJUEGO				= 223;
    public static final int MOSTRAR_LISTA_VIDEOJUEGO 				= 224;
    public static final int MOSTRAR_MODIFICAR_VIDEOJUEGO	 		= 225;
    
    // Mostrar Cliente
    
    public static final int MOSTRAR_ALTA_CLIENTE		 			= 321;
    public static final int MOSTRAR_BAJA_CLIENTE					= 322;
    public static final int MOSTRAR_DETALLE_CLIENTE 				= 323;
    public static final int MOSTRAR_LISTA_CLIENTE 					= 324;
    public static final int MOSTRAR_MODIFICAR_CLIENTE				= 325;
    
    // Mostrar Compra
    public static final int MOSTRAR_GESTION_CARRITO_COMPRA			= 431;
    public static final int MOSTRAR_AGREGAR_ARTICULO_COMPRA			= 432;
    public static final int MOSTRAR_ELIMINAR_ARTICULO_COMPRA		= 433;
    public static final int MOSTRAR_DEVOLUCION_ARTICULO_COMPRA		= 434;
    public static final int MOSTRAR_BAJA_COMPRA						= 435;
    public static final int MOSTRAR_DETALLE_COMPRA					= 436;
    public static final int MOSTRAR_LISTA_COMPRA 					= 437;
    public static final int MOSTRAR_FINALIZAR_COMPRA				= 438;
    
    
    // Vista Query
    
    public static final int VENTANA_NUMERO_CLIENTES_QUERY			= 501;
    public static final int VENTANA_CANTIDAD_VIDEOJUEGOS_QUERY		= 502;
    
    // Negocio query
    
    public static final int NEGOCIO_NUMERO_CLIENTES_QUERY			= 511;
    public static final int NEGOCIO_CANTIDAD_VIDEOJUEGOS_QUERY		= 512;
    
    // Mostrar Query
    
    public static final int MOSTRAR_NUMERO_CLIENTES_QUERY			= 531;
    public static final int MOSTRAR_CANTIDAD_VIDEOJUEGOS_QUERY		= 532;
}
