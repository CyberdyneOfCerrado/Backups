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
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author erick7
 */
public class GuiMain extends JFrame {
        private JPanel fundo;
        int screenX,screenY;
        int x,y,tempx,tempy;
        private TJtextArea cdic;
        private JLabel t1;
        private JLabel textoTile1;
        private JLabel textoTile2;
        private JLabel textoTile3;
        private JLabel textoTile4;
        private TJbutton tile1;
        private TJbutton tile2;
        private TJbutton tile3;
        private TJbutton tile4;
        private TJtextField cnome;
        static private JScrollPane scr;
        private TJtextField cbac;
    	private boolean flag=false;
        private JLabel tlv;
        private TJlabel tp1;
        private TJlabel tl1,tl2,tl3;
        private TJbutton Search;
        private TJbutton Searchs;
        private TJbutton conf;
        private TJbutton age;
        private JLabel tla;
        private TJlabel tpa;
    
    GuiMain()
    {
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        Gmain();
        setVisible(true);        
    }
//Elementos do JFrame que sustentam a janela
    private void Gmain ()
    {
//montando estrutura de fundo
        ImageIcon icf = new ImageIcon(getClass().getResource("/GUI/Imagens/Jfundo.png"));
        Image imf = icf.getImage();
        fundo=new FundoJpane(imf,0,0,0,0);
        fundo.setLayout(null);
        fundo.setBounds(0,0,800,500);
        fundo.addMouseListener(new ClickMove());
        fundo.addMouseMotionListener(new Mover());
        add(fundo);
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
//fim fundo
        inicio();
    }
    
//tela incial começa aqui
        public void inicio()
        {         
            t1=new TJlabel("Início",0,0,0,0);
            t1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            t1.setForeground(Color.BLACK);
            textoTile1=new TJlabel("Novo backup",0,0,0,0);
            textoTile1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile1.setForeground(Color.BLACK);
            ImageIcon tl1 = new ImageIcon(getClass().getResource("/GUI/Imagens/NovoBackup.png"));
            tile1=new TJbutton("",0,0,0,0);  
            tile1.setIcon(tl1);
            tile1.addActionListener(new Novo());
            ImageIcon tl2 = new ImageIcon(getClass().getResource("/GUI/Imagens/rodarBk.png"));
            tile2=new TJbutton("",0,0,0,0);  
            tile2.setIcon(tl2);
            textoTile2=new TJlabel("Listar backups",0,0,0,0);
            textoTile2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile2.setForeground(Color.BLACK);
            ImageIcon tl3 = new ImageIcon(getClass().getResource("/GUI/Imagens/rodaRegra.png"));
            tile3=new TJbutton("",0,0,0,0);  
            tile3.setIcon(tl3);
            textoTile3=new TJlabel("Rodar regra de backup",0,0,0,0);
            textoTile3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile3.setForeground(Color.BLACK);            
            ImageIcon tl4 = new ImageIcon(getClass().getResource("/GUI/Imagens/duplicata.png"));
            tile4=new TJbutton("",0,0,0,0);  
            tile4.setIcon(tl4);
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
        private void hideInicio()
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
        class Novo implements ActionListener{          

        @Override
        public void actionPerformed(ActionEvent e) {
            Cadastro();
            hideInicio();
        }
        }
// tela de cadastro
        public void Cadastro()
        {

            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlv=new JLabel(v1);
            tlv.addMouseListener(new BackInicio());
            Runnable voltar= new Movimento(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            tp1=new TJlabel("Novo backup",0,0,0,0);
            tp1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tp1.setForeground(Color.BLACK);
            Runnable text = new Movimento(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            //nome
            tl1=new TJlabel("Nome",0,0,0,0);
            tl1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl1.setForeground(Color.BLACK);
            Runnable nome = new Movimento(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            cnome = new TJtextField(0,0,0,0);
            cnome.setEditable(true);
            cnome.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cnome.setForeground(Color.BLACK);
            Runnable anome = new Movimento(50,179,650,38,cnome,fundo);
            new Thread(anome).start();
            //diretorio Backup
            tl3=new TJlabel("Diretorio do backup",0,0,0,0);
            tl3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl3.setForeground(Color.BLACK);
            Runnable bac = new Movimento(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            cbac = new TJtextField(0,0,0,0);
            cbac.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cbac.setForeground(Color.BLACK);
            cbac.setEditable(true);
            Runnable abac = new Movimento(50,372,650,38,cbac,fundo);
            new Thread(abac).start();
            //fim
            //diretorio arquivo
            tl2=new TJlabel("Diretorio do Arquivo",0,0,0,0);
            tl2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl2.setForeground(Color.BLACK);
            Runnable dic = new Movimento(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            cdic = new TJtextArea(0,0,0,0);
            cdic.setLineWrap(true);
            cdic.setWrapStyleWord(true);
            cdic.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cdic.setForeground(Color.black);
            cdic.setEditable(true);
            cdic.setBounds(0, 0, WIDTH,HEIGHT);
            scr = new JScrollPane(cdic);
            scr.getVerticalScrollBar().addAdjustmentListener(new Tscroll());
            scr.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0),new LineBorder(Color.BLACK)));
            scr.setOpaque(false);//
            scr.getViewport().setOpaque(false);//
            scr.setBounds(0,0,618,74);   
            Runnable adic = new Movimento(50,256,650,76,scr,fundo);
            new Thread(adic).start();
             //botao procura pasta para backup
            Search=new TJbutton("",0,0,0,0);
            ImageIcon i1 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Search.setIcon(i1);
            Search.addActionListener(null);
            Runnable sea1=new Movimento(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            //botao procura arquivos
            Searchs=new TJbutton("",0,0,0,0);
            ImageIcon i2 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Searchs.setIcon(i2);
            Searchs.addActionListener(null);
            Runnable sea2=new Movimento(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start();
            //botao confirma
            conf=new TJbutton(null,0,0,0,255);
            conf.setText("Confirmar");
            conf.setBackground(Color.black);
            conf.setForeground(Color.white);
            conf.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            Runnable cf=new Movimento(50,432,90,38,conf,fundo);
            new Thread(cf).start();
            //botão agenda
            age=new TJbutton(null,0,0,0,255);
            age.setText("Agendamento");
            age.setBackground(Color.black);
            age.setForeground(Color.white);
            age.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            age.addActionListener(new Agend());
            Runnable ag=new Movimento(650,432,90,38,age,fundo);
            new Thread(ag).start();
            
            //fim
            //setBounds (horizontal,vertical,largura,altura);
        }
        public void hideCadastro(){
            Runnable sea1=new Recolher(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            Runnable sea2=new Recolher(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start(); 
            Runnable voltar= new Recolher(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            Runnable text = new Recolher(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            Runnable nome = new Recolher(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            Runnable anome = new Recolher(50,179,620,38,cnome,fundo);
            new Thread(anome).start();
            Runnable dic = new Recolher(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            Runnable adic = new Recolher(50,256,620,76,scr,fundo);
            new Thread(adic).start();
            Runnable bac = new Recolher(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            Runnable abac = new Recolher(50,372,620,38,cbac,fundo);
            new Thread(abac).start();
            Runnable ag=new Recolher(650,432,90,38,age,fundo);
            new Thread(ag).start();
            Runnable cf=new Recolher(50,432,90,38,conf,fundo);
            new Thread(cf).start();

        }
        //listener Cadastro
        class BackInicio implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				hideCadastro();
				inicio();	
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
        class Agend implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                hideCadastro();
                Agendamento();
        }
            
        }
        class Tscroll implements AdjustmentListener{ //rolagem automatica

            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                  if(flag)
                  {  
                          e.getAdjustable().setValue(e.getAdjustable().getMaximum());
                  }
                  flag = false;
          } 
}
         //fim listener cadastro
        //tela de agendamento de dia
        public void Agendamento(){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tla=new JLabel(v1);
            tla.addMouseListener(new BackCadas());
            Runnable voltar= new Movimento(50,6,22,22,tla,fundo);
            new Thread(voltar).start();
            tpa=new TJlabel("Agendar Backup",0,0,0,0);
            tpa.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tpa.setForeground(Color.BLACK);
            Runnable text = new Movimento(50,25,799,114,tpa,fundo);
            new Thread(text).start();           
        }
        //esconder agendamento
        public void hideAgen(){
            Runnable voltar= new Recolher(50,6,22,22,tla,fundo);
            new Thread(voltar).start();
            Runnable text = new Recolher(50,25,799,114,tpa,fundo);
            new Thread(text).start(); 
        }
        //listener agendamento
        class BackCadas implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
           hideAgen();
            Runnable sea1=new Movimento(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            Runnable sea2=new Movimento(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start(); 
            Runnable voltar= new Movimento(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            Runnable text = new Movimento(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            Runnable nome = new Movimento(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            Runnable anome = new Movimento(50,179,620,38,cnome,fundo);
            new Thread(anome).start();
            Runnable dic = new Movimento(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            Runnable adic = new Movimento(50,256,620,76,scr,fundo);
            new Thread(adic).start();
            Runnable bac = new Movimento(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            Runnable abac = new Movimento(50,372,620,38,cbac,fundo);
            new Thread(abac).start();
            Runnable ag=new Movimento(650,432,90,38,age,fundo);
            new Thread(ag).start();
            Runnable cf=new Movimento(50,432,90,38,conf,fundo);
            new Thread(cf).start();           
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
        }
        
//Minhas classes de movimento
        class Movimento implements Runnable{
            int x,y,alt,larg;
            JButton b=null;
            JLabel l=null;
            JPanel j;
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
                while(temp<=800+768)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Recolher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(b!=null)
                    {
                        b.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(b);
                    }
                    if(l!=null)
                    {
                        l.setBounds(temp, y, larg, alt);          
                        temp+=50;
                        j.add(l);
                    }
                     if(p!=null)
                    {
                        p.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(p);
                    }
                     if(t!=null)
                    {
                        t.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(t);
                    }
                     if(a!=null)
                    {
                        a.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(a);
                    }
                     if(r!=null)
                    {
                        r.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(r);
                    }
                }
                j.repaint();
                Thread.interrupted();
            }
        }
//listeners arrastar a tela
    class ClickMove implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mousePressed(MouseEvent e) {
              tempx = e.getX();
              tempy = e.getY();
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
              setLocation(screenX-tempx, screenY-tempy);			
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
                setState(Frame.ICONIFIED);
        }
    }
//fim da classe
}