/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TJtextField extends JTextField { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int r,g1,b,alp;
	public TJtextField(int r , int g1, int b,int alp) { 
		this.r=r;
		this.b=b;
		this.g1=g1;
		this.alp=alp;
		setOpaque(false); 
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), 
		new LineBorder(Color.BLACK))); 
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