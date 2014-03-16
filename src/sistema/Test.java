package sistema;

import javax.swing.JFileChooser;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFileChooser jfcarquivo = new JFileChooser();
        jfcarquivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfcarquivo.setMultiSelectionEnabled(true);
        if ( jfcarquivo.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
        {
           return;
        }
		String origem = jfcarquivo.getSelectedFile().getAbsolutePath(), destino = "D:\\P1\\LuizEduardo_Teste";
		CopiarArtefatos ca = new CopiarArtefatos(origem, destino, true);
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
		System.out.println("Cabô!");
	}

}
