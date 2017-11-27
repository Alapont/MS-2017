package presentacion.vistas.vistaVideojuego.videojuego;

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

public class JFramePrincipalVideojuego extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton altaVideojuegoPC;
	private JButton altaVideojuegoConsola;
	private JButton bajaVideojuego;
	private JButton detalleVideojuego;
	private JButton listaVideojuego;
	private JButton modificarVideojuegoPC;
	private JButton modificarVideojuegoConsola;
	private JButton cantidadVideojuegos;
	private JButton salir;
	
	public JFramePrincipalVideojuego(){
		this.setTitle("Principal videojuego");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrarPrincipal();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(9, 1));
		
		altaVideojuegoPC = new JButton("Crear videojuego PC");
		altaVideojuegoConsola = new JButton("Crear videojuego consola");
		bajaVideojuego = new JButton("Eliminar videojuego");
		detalleVideojuego = new JButton("Detalle videojuego");
		listaVideojuego = new JButton("Lista videojuegos");
		modificarVideojuegoPC = new JButton("Modificar videojuego PC");
		modificarVideojuegoConsola = new JButton("Modificar videojuego consola");
		cantidadVideojuegos =new JButton("Cantidad de videojuegos");
		salir = new JButton("Salir");
		
		altaVideojuegoPC.setPreferredSize(new Dimension(320, 35));
		
		altaVideojuegoPC.addActionListener(new ActionListenerPrincipalVideojuego(0));
		altaVideojuegoConsola.addActionListener(new ActionListenerPrincipalVideojuego(1));
		bajaVideojuego.addActionListener(new ActionListenerPrincipalVideojuego(2));
		detalleVideojuego.addActionListener(new ActionListenerPrincipalVideojuego(3));
		listaVideojuego.addActionListener(new ActionListenerPrincipalVideojuego(4));
		modificarVideojuegoPC.addActionListener(new ActionListenerPrincipalVideojuego(5));
		modificarVideojuegoConsola.addActionListener(new ActionListenerPrincipalVideojuego(6));
		cantidadVideojuegos.addActionListener(new ActionListenerPrincipalVideojuego(7));
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				cerrarPrincipal();
			}
		});
		
		buttonPanel.add(altaVideojuegoPC);
		buttonPanel.add(altaVideojuegoConsola);
		buttonPanel.add(bajaVideojuego);
		buttonPanel.add(detalleVideojuego);
		buttonPanel.add(listaVideojuego);
		buttonPanel.add(modificarVideojuegoPC);
		buttonPanel.add(modificarVideojuegoConsola);
		buttonPanel.add(cantidadVideojuegos);
		buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	public class ActionListenerPrincipalVideojuego implements ActionListener {
		private int event;
		
		public ActionListenerPrincipalVideojuego(int event){
			this.event = event;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0){
			int comando = 0;
			
			switch(event){
				case 0:
					comando = ListaComandos.VENTANA_ALTA_VIDEOJUEGO_PC;
					break;
				case 1:
					comando = ListaComandos.VENTANA_ALTA_VIDEOJUEGO_CONSOLA;
					break;
				case 2:
					comando = ListaComandos.VENTANA_BAJA_VIDEOJUEGO;
					break;
				case 3:
					comando = ListaComandos.VENTANA_DETALLE_VIDEOJUEGO;
					break;
				case 4:
					comando = ListaComandos.VENTANA_LISTA_VIDEOJUEGO;
					break;
				case 5:
					comando = ListaComandos.VENTANA_MODIFICAR_VIDEOJUEGO_PC;
					break;
				case 6:
					comando = ListaComandos.VENTANA_MODIFICAR_VIDEOJUEGO_CONSOLA;
					break;
				case 7:
					comando = ListaComandos.VENTANA_CANTIDAD_VIDEOJUEGOS_QUERY;
					break;
			}
			
			cerrarParaVistaPropia();
			Controlador.getInstance().accion(comando, null);
		}
	}
	
	public void cerrarParaVistaPropia(){
		this.setVisible(false);
	}
	
	public void cerrarPrincipal(){
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL, null);
	}
}