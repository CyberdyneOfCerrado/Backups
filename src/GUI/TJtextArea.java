package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextArea;

public class TJtextArea extends JTextArea { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int r,g1,b,alp;
	public TJtextArea(int r , int g1, int b,int alp) { 
		this.r=r;
		this.b=b;
		this.g1=g1;
		this.alp=alp;
		setOpaque(false);
	}
@Override protected void paintComponent(Graphics g) {
	g.setColor(new Color(r, g1, b, alp));
	Insets insets = getInsets(); 
	int x = insets.left; 
	int y = insets.top; 
	int width = getWidth() - (insets.left + insets.right); 
	int height = getHeight() - (insets.top + insets.bottom); 
	g.fillRect(x, y, width, height); super.paintComponent(g); 
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