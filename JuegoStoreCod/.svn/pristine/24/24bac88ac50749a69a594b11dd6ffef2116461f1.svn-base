package presentacion.vistas.vistaVideojuego.videojuego;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import presentacion.ListaComandos;
import presentacion.controlador.Controlador;
import presentacion.controlador.PareadoQuery;

public class JFrameCantidadVideojuegos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField idCliente;
	private JTextField idVideojuego;
	private JButton enviar;
	private JButton salir;
	
	public JFrameCantidadVideojuegos(){
		this.setTitle("Cantidad de videojuegos");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrar();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 1));

		idCliente = new JTextField("Id cliente");
		idVideojuego = new JTextField("Id videojuego");
		enviar = new JButton("Enviar");
		salir = new JButton("Salir");
		
		idCliente.setPreferredSize(new Dimension(320, 35));
		
		enviar.addActionListener(new ActionListenerCantidadVideojuegosCompra());
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				cerrar();
			}
		});
		
		buttonPanel.add(idCliente);
		buttonPanel.add(idVideojuego);
        buttonPanel.add(enviar);
        buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	public class ActionListenerCantidadVideojuegosCompra implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			try{
				Controlador.getInstance().accion(ListaComandos.NEGOCIO_CANTIDAD_VIDEOJUEGOS_QUERY, new PareadoQuery(Integer.parseInt(idCliente.getText()), Integer.parseInt(idVideojuego.getText())));
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void cerrar(){
		idCliente.setText("Id cliente");
		idVideojuego.setText("Id videojuego");
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO, null);
	}	
}