package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TJcheck extends JCheckBox
{
	int r,g1,b,alp;
	private static final long serialVersionUID = 1L;
	public TJcheck(String title,int r,int g1, int b,int alp) {
		super(title);
		this.r=r;
		this.b=b;
		this.g1=g1;
		this.alp=alp;
		setOpaque(false); 
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), 
		new LineBorder(Color.LIGHT_GRAY))); 
	}
	Graphics g;
@Override protected void paintComponent(Graphics g) {
	g.setColor(new Color(r,g1,b, alp));
	this.g=g;
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