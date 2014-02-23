package iteradores;
import java.util.ArrayList;
import objetos.Backup;

public class IteradorBackups extends Iterador{

	public IteradorBackups(ArrayList<Object> colecao){
		super(colecao);
	};
	
	public Backup  next() {
		return ( Backup ) super.next();
	};
}
