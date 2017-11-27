package presentacion.controlador;

import presentacion.comandos.Comando;
import presentacion.comandos.FactoriaDeComandos;
import presentacion.dispatcher.Dispatcher;

public class ControladorImp extends Controlador {
	@Override
	public void accion(int event, Object datos){
		FactoriaDeComandos factoriaComandos = FactoriaDeComandos.getInstance();
		Comando comando = factoriaComandos.getComando(event);
		Contexto contexto = comando.execute(datos);
		Dispatcher dispatcher = Dispatcher.getInstance();
		dispatcher.accion(contexto);
	}
}