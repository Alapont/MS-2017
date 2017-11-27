package presentacion.vistas.vistaCompra.compra;

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

public class JFramePrincipalCompra extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton iniciarCompra;
	private JButton devolucionCompra;
	private JButton detalleCompra;
	private JButton listaCompra;
	private JButton salir;
	
	public JFramePrincipalCompra(){
		
		this.setTitle("Principal compra");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrarBotonera();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(5, 1));
		iniciarCompra = new JButton("Iniciar compra");
		devolucionCompra = new JButton("Devolver compra");
		detalleCompra = new JButton("Detalle compra");
		listaCompra = new JButton("Lista compra");
		salir = new JButton("Salir");
		
		iniciarCompra.setPreferredSize(new Dimension(320, 35));

		iniciarCompra.addActionListener(new ActionListenerBotoneraCompra(0));
		devolucionCompra.addActionListener(new ActionListenerBotoneraCompra(1));
		detalleCompra.addActionListener(new ActionListenerBotoneraCompra(2));
		listaCompra.addActionListener(new ActionListenerBotoneraCompra(3));
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				cerrarBotonera();
			}
		});
		
		buttonPanel.add(iniciarCompra);
		buttonPanel.add(devolucionCompra);
		buttonPanel.add(detalleCompra);
		buttonPanel.add(listaCompra);
		buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	
	public class ActionListenerBotoneraCompra implements ActionListener{
		private int event;
		
		public ActionListenerBotoneraCompra(int event){
			this.event = event;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0){
			int comando = 0;
			
			switch(event){
				case 0:
					comando = ListaComandos.VENTANA_INICIAR_COMPRA;
					break;
				case 1:
					comando = ListaComandos.VENTANA_DEVOLUCION_COMPRA;
					break;
				case 2:
					comando = ListaComandos.VENTANA_DETALLE_COMPRA;
					break;
				case 3:
					comando = ListaComandos.VENTANA_LISTA_COMPRA;
					break;
			}
			
			cerrarParaVistaPropia();
			Controlador.getInstance().accion(comando, null);
		}
	}
	
	public void cerrarParaVistaPropia(){
		this.setVisible(false);
	}
	
	public void cerrarBotonera(){
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL, null);
	}
}