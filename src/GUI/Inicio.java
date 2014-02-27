
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author ErIcK
 */
public class Inicio {
        private JPanel fundo;
        private JLabel t1;
        private JLabel textoTile1;
        private JLabel textoTile2;
        private JLabel textoTile3;
        private JLabel textoTile4;
        private JLabel tile1;
        private JLabel tile2;
        private JLabel tile3;
        private JLabel tile4;
        private boolean ex=false;
        Inicio(JPanel fundo){
            this.fundo=fundo;
        }
        
//Elementos de incio com movimentos
        public void show()
        {         
            t1=new TJlabel("Início",0,0,0,0);
            t1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            t1.setForeground(Color.BLACK);
            textoTile1=new TJlabel("Novo backup",0,0,0,0);
            textoTile1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile1.setForeground(Color.BLACK);
            ImageIcon tl1 = new ImageIcon(getClass().getResource("/GUI/Imagens/NovoBackup.png"));
            tile1=new JLabel(tl1);    
            tile1.addMouseListener(new Novo());
            ImageIcon tl2 = new ImageIcon(getClass().getResource("/GUI/Imagens/rodarBk.png"));
            tile2=new JLabel(tl2);
            textoTile2=new TJlabel("Listar backups",0,0,0,0);
            textoTile2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile2.setForeground(Color.BLACK);
            ImageIcon tl3 = new ImageIcon(getClass().getResource("/GUI/Imagens/rodaRegra.png"));
            tile3=new JLabel(tl3);
            tile2=new JLabel(tl2);
            textoTile3=new TJlabel("Rodar regra de backup",0,0,0,0);
            textoTile3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile3.setForeground(Color.BLACK);            
            ImageIcon tl4 = new ImageIcon(getClass().getResource("/GUI/Imagens/duplicata.png"));
            tile4=new JLabel(tl4);
            textoTile4=new TJlabel("Buscar arquivos duplicados",0,0,0,0);
            textoTile4.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile4.setForeground(Color.BLACK);            
            Runnable text = new Movimento(39,25,799,114,t1,fundo);
            new Thread(text).start();
            Runnable rt1 = new Movimento(118,148,80,80,tile1,fundo);
            new Thread(rt1).start();
            Runnable rtt1 = new Movimento(203,171,799,41,textoTile1,fundo);
            new Thread(rtt1).start();            
            Runnable rt2 = new Movimento(118,233,80,80,tile2,fundo);
            new Thread(rt2).start();
            Runnable rtt2 = new Movimento(203,256,799,41,textoTile2,fundo);
            new Thread(rtt2).start();
            Runnable rt3 = new Movimento(118,318,80,80,tile3,fundo);
            new Thread(rt3).start();
            Runnable rtt3 = new Movimento(203,341,799,41,textoTile3,fundo);
            new Thread(rtt3).start();
            Runnable rt4 = new Movimento(118,403,80,80,tile4,fundo);
            new Thread(rt4).start();
            Runnable rtt4 = new Movimento(203,426,799,41,textoTile4,fundo);
            new Thread(rtt4).start();         
            ex=true;
        }
        public void hide(boolean e)
        {
            if(e==true)
            {
                    Runnable text = new Recolher(39,25,799,114,t1,fundo);
                    new Thread(text).start();
                    Runnable rt1 = new Recolher(118,148,80,80,tile1,fundo);
                    new Thread(rt1).start();
                    Runnable rtt1 = new Recolher(203,171,799,41,textoTile1,fundo);
                    new Thread(rtt1).start();                      
                    Runnable rt2 = new Recolher(118,233,80,80,tile2,fundo);
                    new Thread(rt2).start();
                    Runnable rtt2 = new Recolher(203,256,799,41,textoTile2,fundo);
                    new Thread(rtt2).start();
                    Runnable rt3 = new Recolher(118,318,80,80,tile3,fundo);
                    new Thread(rt3).start();
                    Runnable rtt3 = new Recolher(203,341,799,41,textoTile3,fundo);
                    new Thread(rtt3).start();                    
                    Runnable rt4 = new Recolher(118,403,80,80,tile4,fundo);
                    new Thread(rt4).start();
                    Runnable rtt4 = new Recolher(203,426,799,41,textoTile4,fundo);
                    new Thread(rtt4).start();                   
                    e=false;
            }
        }
//listeners da tela de inicio
        class Novo implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            hide(ex);
            Cadastro();
        }
        @Override
        public void mousePressed(MouseEvent e){}
        @Override
        public void mouseReleased(MouseEvent e){}
        @Override
        public void mouseEntered(MouseEvent e){}
        @Override
        public void mouseExited(MouseEvent e){}           
        }
// tela de cadastro
        public void Cadastro()
        {
            t1=new TJlabel("Novo backup",0,0,0,0);
            t1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            t1.setForeground(Color.BLACK);
            Runnable text = new Movimento(39,25,799,114,t1,fundo);
            new Thread(text).start();
        }
        public void escondeCadastro()
        {
                    Runnable text = new Recolher(39,25,799,114,t1,fundo);
                    new Thread(text).start();
        }
//tela de listar backups
//Minhas classes de movimento
        class Movimento implements Runnable{
            int x,y,alt,larg;
            JButton b=null;
            JLabel l=null;
            JPanel j;
            JPanel p=null;
           public Movimento(int x,int y,int larg,int alt,JLabel l,JPanel j){
                this.x=x;
                this.y=y;
                this.l=l;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public Movimento(int x,int y,int larg,int alt,JButton b,JPanel j){
                this.x=x;
                this.y=y;
                this.b=b;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public Movimento(int x,int y,int larg,int alt,JPanel p,JPanel j){
                this.x=x;
                this.y=y;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
                this.p=p;
            }
            @Override
            public void run() {
                int temp=800;
                while(temp>x)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Movimento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(temp);
                    if(b!=null)
                    {
                        b.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(b);
                    }
                    if(l!=null)
                    {
                        l.setBounds(temp, y, larg, alt);          
                        temp-=50;
                        j.add(l);
                    }
                     if(p!=null)
                    {
                        p.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(p);
                    }
                }
                j.repaint();
                Thread.interrupted();
            }
        }
        
        class Recolher implements Runnable{
            int x,y,alt,larg;
            JButton b=null;
            JLabel l=null;
            JPanel j;
            JPanel p=null;
           public Recolher(int x,int y,int larg,int alt,JLabel l,JPanel j){
                this.x=x;
                this.y=y;
                this.l=l;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public Recolher(int x,int y,int larg,int alt,JButton b,JPanel j){
                this.x=x;
                this.y=y;
                this.b=b;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public Recolher(int x,int y,int larg,int alt,JPanel p,JPanel j){
                this.x=x;
                this.y=y;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
                this.p=p;
            }
            @Override
            public void run() {
                int temp=x;
                while(temp>-768)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Recolher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(temp);
                    if(b!=null)
                    {
                        b.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(b);
                    }
                    if(l!=null)
                    {
                        l.setBounds(temp, y, larg, alt);          
                        temp-=50;
                        j.add(l);
                    }
                     if(p!=null)
                    {
                        p.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(p);
                    }
                }
                j.repaint();
                Thread.interrupted();
            }
        }
}
