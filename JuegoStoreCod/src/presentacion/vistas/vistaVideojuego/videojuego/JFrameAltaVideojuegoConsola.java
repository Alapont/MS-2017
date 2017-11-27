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

public class JFrameAltaVideojuegoConsola extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField nombre;
	private JTextField desarrollador;
	private JTextField precio;
	private JTextField MarcaConsola;
	private JButton enviar;
	private JButton salir;
	
	public JFrameAltaVideojuegoConsola(){
		this.setTitle("Alta videojuego consola");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrar();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(6, 1));

		nombre = new JTextField("Nombre videojuego");
		desarrollador = new JTextField("Desarrollador");
		precio = new JTextField("Precio videojuego");
		MarcaConsola = new JTextField("Marca videojuego");
		enviar = new JButton("Enviar");
		salir = new JButton("Salir");
		
		nombre.setPreferredSize(new Dimension(320, 35));

		enviar.addActionListener(new ActionListenerAltaVideojuegoPC());
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				cerrar();
			}
		});
		
		buttonPanel.add(nombre);
		buttonPanel.add(desarrollador);
		buttonPanel.add(precio);
		buttonPanel.add(MarcaConsola);
        buttonPanel.add(enviar);
        buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	public class ActionListenerAltaVideojuegoPC implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			try{
				Controlador.getInstance().accion(ListaComandos.NEGOCIO_ALTA_VIDEOJUEGO, new TransferVideojuegoConsola(nombre.getText(), desarrollador.getText(), Double.parseDouble(precio.getText()), MarcaConsola.getText(), true));
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato bicicleta no correcto", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void cerrar()
	{
		nombre.setText("Nombre videojuego");
		desarrollador.setText("Desarrollador");
		precio.setText("Precio videojuego");
		MarcaConsola.setText("Marca bicicleta");
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO, null);
	}
}