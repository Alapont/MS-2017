package presentacion.comandos;

import presentacion.comandos.Comando;
import presentacion.comandos.FactoriaDeComandos;
import presentacion.comandos.FactoriaDeComandosImp;

public abstract class FactoriaDeComandos {
	
	private static FactoriaDeComandos instancia;

	public static FactoriaDeComandos getInstance() 
	{
		if(instancia == null)
			instancia = new FactoriaDeComandosImp();
		return instancia;
	}

	public abstract Comando getComando(int event);

}
