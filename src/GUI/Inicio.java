
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


/**
 *
 * @author ErIcK
 */
public class Inicio {
        private JPanel fundo;
        private JTextArea cdic;
        private JLabel t1;
        private JLabel textoTile1;
        private JLabel textoTile2;
        private JLabel textoTile3;
        private JLabel textoTile4;
        private JLabel tile1;
        private JLabel tile2;
        private JLabel tile3;
        private JLabel tile4;
        private TJtextField cnome;
        private JScrollPane scroll;
        private TJtextField cbac;
    	private boolean novo=true;
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
            Runnable text = new Movimento(50,25,799,114,t1,fundo);
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
        }
        public void hideInicio()
        {
                    Runnable text = new Recolher(50,25,799,114,t1,fundo);
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
        }
        //listeners da tela de inicio
        class Novo implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        	hideInicio();
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
        	ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tile1=new JLabel(v1);
            tile1.addMouseListener(new BackInicio());
            Runnable voltar= new Movimento(50,6,22,22,tile1,fundo);
            new Thread(voltar).start();
        	t1=new TJlabel("Novo backup",0,0,0,0);
            t1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            t1.setForeground(Color.BLACK);
            textoTile1=new TJlabel("Nome",0,0,0,0);
            textoTile1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile1.setForeground(Color.BLACK);
            Runnable nome = new Movimento(50,140,100,38,textoTile1,fundo);
            new Thread(nome).start();
            cnome = new TJtextField(0,0,0,0);
            cnome.setEditable(true);
            cnome.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cnome.setForeground(Color.BLACK);
            Runnable anome = new Movimento(50,179,620,38,cnome,fundo);
            new Thread(anome).start();
            textoTile2=new TJlabel("Diretorio do Arquivo",0,0,0,0);
            textoTile2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile2.setForeground(Color.BLACK);
            Runnable dic = new Movimento(50,217,700,38,textoTile2,fundo);
            new Thread(dic).start();
            cdic = new TJtextArea(0,0,0,0);
            cdic.setLineWrap(true);//QUEBRA DE LINHA
            cdic.setWrapStyleWord(true);//desliza a palavra para baixo caso haja quebra
            cdic.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cdic.setForeground(Color.BLACK);
            scroll = new JScrollPane(cdic);
            scroll.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0),new LineBorder(Color.BLACK))); 
            scroll.getVerticalScrollBar().addAdjustmentListener(new Tscroll(novo));
            scroll.setOpaque(false);//
            scroll.getViewport().setOpaque(false);//             
            Runnable adic = new Movimento(50,256,620,76,scroll,fundo);
            new Thread(adic).start();
            textoTile3=new TJlabel("Diretorio do backup",0,0,0,0);
            textoTile3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile3.setForeground(Color.BLACK);
            Runnable bac = new Movimento(50,333,700,38,textoTile3,fundo);
            new Thread(bac).start();
            cbac = new TJtextField(0,0,0,0);
            cbac.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cbac.setForeground(Color.BLACK);
            cbac.setEditable(true);
            Runnable abac = new Movimento(50,372,620,38,cbac,fundo);
            new Thread(abac).start();             
          //setBounds (horizontal,vertical,largura,altura);
            Runnable text = new Movimento(50,25,799,114,t1,fundo);
            new Thread(text).start();
        }
        public void hideCadastro(){
            Runnable voltar= new Recolher(50,6,22,22,tile1,fundo);
            new Thread(voltar).start();
            Runnable text = new Recolher(50,25,799,114,t1,fundo);
            new Thread(text).start();
            Runnable nome = new Recolher(50,140,100,38,textoTile1,fundo);
            new Thread(nome).start();
            Runnable anome = new Recolher(50,179,620,38,cnome,fundo);
            new Thread(anome).start();
            Runnable dic = new Recolher(50,217,700,38,textoTile2,fundo);
            new Thread(dic).start();
            Runnable adic = new Recolher(50,256,620,76,scroll,fundo);
            new Thread(adic).start();
            Runnable bac = new Recolher(50,333,700,38,textoTile3,fundo);
            new Thread(bac).start();
            Runnable abac = new Recolher(50,372,620,38,cbac,fundo);
            new Thread(abac).start(); 

        }
        //listeners Cadastro        
        class BackInicio implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				hideCadastro();
				show();	
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
        	
        }
//Minhas classes de movimento
        class Movimento implements Runnable{
            int x,y,alt,larg;
            JButton b=null;
            JLabel l=null;
            JPanel j;
            JPanel p=null;
            TJtextField t=null;
            TJtextArea a=null;
            JScrollPane r=null;
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
           public Movimento(int x,int y,int larg,int alt,TJtextField t,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.t=t;
           }
           public Movimento(int x,int y,int larg,int alt,TJtextArea a,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.a=a;
           }
           public Movimento(int x,int y,int larg,int alt,JScrollPane r,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.r=r;
           }            
            @Override
            public void run() {
                int temp=800;
                while(temp>=x)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Movimento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.err.println(temp);
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
                     if(t!=null)
                    {
                        t.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(t);
                    }
                     if(a!=null)
                    {
                        a.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(a);
                    }
                     if(r!=null)
                    {
                        r.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(r);
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
            TJtextField t=null;
            TJtextArea a=null;
            JScrollPane r=null;
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
           public Recolher(int x,int y,int larg,int alt,TJtextField t,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.t=t;
           }
           public Recolher(int x,int y,int larg,int alt,TJtextArea a,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.a=a;
           } 
           public Recolher(int x,int y,int larg,int alt,JScrollPane r,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.r=r;
           }             
            @Override
            public void run() {
                int temp=x;
                while(temp>=-768)
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
                     if(t!=null)
                    {
                        t.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(t);
                    }
                     if(a!=null)
                    {
                        a.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(a);
                    }
                     if(r!=null)
                    {
                        r.setBounds(temp, y, larg, alt);
                        temp-=50;
                        j.add(r);
                    }                       
                }
                j.repaint();
                Thread.interrupted();
            }
        }
}
