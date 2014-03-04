/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TJbutton extends JButton
{
	int r,g1,b,alp;
	private static final long serialVersionUID = 1L;
	public TJbutton(String title,int r,int g1, int b,int alp) {
		super(title);
		this.r=r;
		this.b=b;
		this.g1=g1;
		this.alp=alp;
		setOpaque(false); 
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), 
		new LineBorder(Color.LIGHT_GRAY))); 
                setOpaque(false);
                setContentAreaFilled(false);
                setBorderPainted(true);
                setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
                setForeground(Color.WHITE);
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
