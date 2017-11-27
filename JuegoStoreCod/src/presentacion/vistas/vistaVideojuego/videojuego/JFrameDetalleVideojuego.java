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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import negocio.videojuego.imp.TransferVideojuego;
import presentacion.ListaComandos;
import presentacion.controlador.Controlador;

public class JFrameDetalleVideojuego extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField id;
	private JTextArea mostrar;
	private JButton enviar;
	private JButton salir;
	
	public JFrameDetalleVideojuego() {
		this.setTitle("Detalle videojuego");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent evt) {cerrar();}}); 
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
		
		id = new JTextField("Id videojuego");
		mostrar = new JTextArea("Detalle videojuego");
		enviar = new JButton("Enviar");
		salir = new JButton("Salir");
	
		mostrar.setWrapStyleWord(true);
		mostrar.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(mostrar);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		id.setPreferredSize(new Dimension(800, 35));
		
		enviar.addActionListener(new ActionListenerDetalleVideojuego());	
		
		salir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				cerrar();
			}
		});
		
		buttonPanel.add(scrollPane);
		buttonPanel.add(id);
		buttonPanel.add(enviar);
		buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}
	
	public class ActionListenerDetalleVideojuego implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0){			
			try{
				Controlador.getInstance().accion(ListaComandos.NEGOCIO_DETALLE_VIDEOJUEGO, Integer.parseInt(id.getText()));
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato bicicleta no correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void setAreaDetalle(TransferVideojuego videojuego){
		mostrar.setText(videojuego.toString());
	}
	
	public void cerrar(){		
		id.setText("Id videojuego");
		mostrar.setText("Detalle videojuego");
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANA_PRINCIPAL_VIDEOJUEGO, null);
	}	
}