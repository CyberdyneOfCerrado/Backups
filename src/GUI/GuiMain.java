/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author erick7
 */
public class GuiMain  {
    JPanel fundo;
    JFrame j=new JFrame();
    int screenX,screenY;
    int x,y,tempx,tempy;
    GuiMain()
    {
        j.setUndecorated(true);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800,500);
        j.setBackground(new Color(0, 0, 0, 0));
        j.setLocationRelativeTo(null);
        Gmain();
        j.setVisible(true);        
    }
//Elementos do JFrame que sustentam a janela
    public void Gmain ()
    {
        ImageIcon icf = new ImageIcon(getClass().getResource("/GUI/Imagens/Jfundo.png"));
        Image imf = icf.getImage();
        JPanel fundo=new FundoJpane(imf,0,0,0,0);
        fundo.setLayout(null);
        fundo.setBounds(0,0,800,500);
        fundo.addMouseListener(new ClickMove());
        fundo.addMouseMotionListener(new Mover());
        j.add(fundo);
        //Botao fecha e minimiza
        JButton fechar = new TJbutton("X",0,0,0,0);
        fechar.setBounds(767,6,16,25);
        fechar.addActionListener(new Close());
        fechar.setContentAreaFilled(false);
        fechar.setOpaque(false);
        fechar.setForeground(Color.BLACK);
        fechar.setFont(new Font("Consolas",Font.BOLD,18));
        fechar.setBorderPainted(false);
        fundo.add(fechar);
        JButton min = new TJbutton("-",0,0,0,0);
        min.setBounds(748,2,16,25);
        min.addActionListener(new Min());
        min.setContentAreaFilled(false);
        min.setOpaque(false);
        min.setForeground(Color.BLACK);
        min.setFont(new Font("Consolas",Font.BOLD,32));
        min.setBorderPainted(false);
        fundo.add(min);
        //pagina inicial
        new Inicio(fundo).show();
    }
//listeners arrastar a tela
    class ClickMove implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mousePressed(MouseEvent e) {
              tempx = e.getX();
              tempy = e.getY();
              System.out.printf("%d %d\n", screenX,screenY);
        }
        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
       
    }
    
    class Mover implements MouseMotionListener{
		@Override
                public void mouseDragged(MouseEvent e) {	
              int screenX = e.getXOnScreen();
              int screenY = e.getYOnScreen();
              j.setLocation(screenX-tempx, screenY-tempy);			
        }
        @Override
        public void mouseMoved(MouseEvent e) { 
    }
    }
 //listeners Botoes Close E MIN
        class Close implements ActionListener{    

        @Override
        public void actionPerformed(ActionEvent e) {
                System.exit(1);
        }
    }
        class Min implements ActionListener{    

        @Override
        public void actionPerformed(ActionEvent e) {
                j.setState(Frame.ICONIFIED);
        }
    }
//fim da classe
}