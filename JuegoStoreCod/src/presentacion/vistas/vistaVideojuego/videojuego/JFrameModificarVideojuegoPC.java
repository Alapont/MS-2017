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
import negocio.videojuego.imp.TransferVideojuegoConsola;
import presentacion.ListaComandos;
import presentacion.controlador.Controlador;

public class JFrameModificarVideojuegoPC extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField id;
	private JTextField nombre;
	private JTextField desarrollador;
	private JTextField precio;
	private JTextField sistema;
	private JButton enviar;
	private JButton salir;
	
	public JFrameModificarVideojuegoPC(){
		this.setTitle("Modificar videojuego PC");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrar();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(7, 1));
		
		id = new JTextField("Id videojuego");
		nombre = new JTextField("Nombre videojuego");
		desarrollador = new JTextField("Desarrollador");
		precio = new JTextField("Precio videojuego");
		sistema = new JTextField("Sistema");
		enviar = new JButton("Enviar");
		salir = new JButton("Salir");
		
		id.setPreferredSize(new Dimension(320, 35));
		
		enviar.addActionListener(new ActionListenerModificarBicicletaMontana());	
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				cerrar();
			}
		});	

		buttonPanel.add(id);
		buttonPanel.add(nombre);
		buttonPanel.add(desarrollador);
		buttonPanel.add(precio);
		buttonPanel.add(sistema);
        buttonPanel.add(enviar);
        buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	public class ActionListenerModificarBicicletaMontana implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			try	{
				Controlador.getInstance().accion(ListaComandos.NEGOCIO_MODIFICAR_VIDEOJUEGO, new TransferVideojuegoConsola(Integer.parseInt(id.getText()), nombre.getText(), desarrollador.getText(), Double.parseDouble(precio.getText()), sistema.getText(), true));
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato videojuego no correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void cerrar(){
		id.setText("Id videojuego");
		nombre.setText("Nombre videojuego");
		desarrollador.setText("Desarrollador");
		precio.setText("Precio videojuego");
		sistema.setText("Sistema");
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO, null);
	}
}