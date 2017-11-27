package presentacion.vistas.vistaPrincipal.principal;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import presentacion.ListaComandos;
import presentacion.controlador.Controlador;

/**
 * Clase que permite la vista de la ventana principal de la aplicación. Hereda de JFrame.
 */
public class JFramePrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton cliente;
	private JButton compra;
	private JButton videojuego;
	private JButton salir;
	
	/**
	 * Contructor de la clase. Inicia la ventana principal
	 */
	public JFramePrincipal(){
		this.setTitle("JuegoStore");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {ocultarVentana();}});
		
		//Creamos nuestro panel de botones, que contendra los botones que nos permitiran abrir el resto de apartados de la aplicacion
		JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
		
		//Inicializamos los botones
		cliente = new JButton("Modulo Cliente");
		compra = new JButton("Modulo Compra");
		videojuego = new JButton("Modulo Videojuego");
		salir = new JButton("Salir");
		
		//Añadimos los actionListeners a los botones, que ejecutaran los metodos del controlador en funcion del evento
		cliente.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				ocultarVentana();
				Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_CLIENTE, null);
			}
		});
		
		compra.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				ocultarVentana();
				Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_COMPRA, null);
			}
		});
		
		videojuego.setPreferredSize(new Dimension(300, 35));
		
		videojuego.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				ocultarVentana();
				Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO, null);
			}
		});
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				cerrarAplicacion();
			}
		});
		
		
		this.getContentPane().add(cliente);
		this.getContentPane().add(compra);
		this.getContentPane().add(videojuego);
		this.getContentPane().add(salir);
		
		//Añadimos a la ventana principal los botones
		buttonPanel.add(videojuego);
		buttonPanel.add(cliente);
		buttonPanel.add(compra);
		buttonPanel.add(salir);
		
		//Añadimos al Contentpane nuestro panel de botones
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	/**
	 * Funcion que oculta la ventana sin finalizar la ejecución del programa.
	 */
	public void ocultarVentana(){
		this.setVisible(false);
	}
	
	/**
	 * Funcion que cierra la aplicacion finalizando la ejecución del programa.
	 */
	public void cerrarAplicacion(){
		this.dispose();
		System.exit(0);
	}	
}