package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JPanel;


public class FundoJpane extends JPanel {    
    /**
	 * 
	 */
    
	private static final long serialVersionUID = 1L;
	private Image img = null;
    private int x = 0;    
    private int y = 0;
    int r,g1,b,alp;
    public FundoJpane(Image img,int r,int g1, int b,int alp)
    {
    	this.img=img;
        this.r=r;
	this.b=b;
	this.g1=g1;
	this.alp=alp;
	setOpaque(false); 
    }
    Graphics g;

    public FundoJpane(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void paintComponent(Graphics g) {    
        super.paintComponent(g);          
        Graphics gr = (Graphics2D)g.create();    
        gr.drawImage(img, x, y,this.getWidth(),this.getHeight(),this);    
        gr.dispose();
        g.setColor(new Color(r,g1,b, alp));
	this.g=g;
	Insets insets = getInsets(); 
	int x = insets.left; 
	int y = insets.top; 
	int width = getWidth() - (insets.left + insets.right); 
	int height = getHeight() - (insets.top + insets.bottom); 
	g.fillRect(x, y, width, height); super.paintComponent(g);
    }
    public void alterarImagem(Image novaimagem){
        this.img = novaimagem;
        this.revalidate();
        this.repaint();
      }
	public void atualizar(int r , int g1, int b,int alp)
	{
	this.r=r;
	this.b=b;
	this.g1=g1;
	this.alp=alp;
	this.revalidate();
	this.repaint();
	}
}