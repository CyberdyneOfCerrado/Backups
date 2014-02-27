package sistema;

import java.io.IOException;

public class DesligarPC {
	public DesligarPC()
	{
		if ( System.getProperty("os.name").toLowerCase().startsWith("win"))
		{
			try {
				Runtime.getRuntime().exec("shutdown -s -t 0").waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
