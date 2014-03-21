package sistema;

import java.io.File;

import javax.swing.JFileChooser;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFileChooser jfcarquivo = new JFileChooser();
		String origem = "";
		int retorno;
		do
		{
	        jfcarquivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        jfcarquivo.setMultiSelectionEnabled(true);
	        retorno = jfcarquivo.showOpenDialog(null);
	        if ( retorno != JFileChooser.APPROVE_OPTION && origem.length() == 0 )
	        {
	           return;
	        }
	        else
	        {
	        	if ( retorno == JFileChooser.CANCEL_OPTION )
	        	{
	        		break;
	        	}
	        }
	        
	        for(File fr : jfcarquivo.getSelectedFiles())
	        {
	        	System.out.println(fr.getAbsolutePath());
	        	origem += fr.getAbsolutePath() + "|";
	        }
		} while ( retorno != JFileChooser.CANCEL_OPTION );
//		String origem = jfcarquivo.getSelectedFile().getAbsolutePath(),
        String destino = "D:\\P1\\Debug trab";
		CopiarArtefatos ca = new CopiarArtefatos(origem, destino, true);
		ca.setZip("ArquivoTeste");
		ca.start();
		while ( ca.isRodando() )
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(ca.getResultado().name());
		System.out.println("Cabô!");
	}

}
