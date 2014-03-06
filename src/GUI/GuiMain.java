/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Erick Batista do Nascimento
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
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author erick7
 */
public class GuiMain extends JFrame {
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JPanel fundo;
        int screenX,screenY;
        int x,y,tempx,tempy;
        private TJtextArea cdic;
        private JLabel t1;
        private JLabel textoTile1;
        private JLabel textoTile3;
        private JLabel textoTile4;
        private JButton tile1;
        private JButton tile3;
        private JButton tile4;
        private TJtextField cnome;
        static private JScrollPane scr;
        private TJtextField cbac;
    	private boolean flag=false;
        private JLabel tlv;
        private TJlabel tp1;
        private TJlabel tl1,tl2,tl3;
        private JButton Search;
        private JButton Searchs;
        private JButton conf;
        private JButton age;
        private JLabel tla;
        private TJlabel tpa;
        private JPanel dia;
        private JButton seg;
        private JButton ter;
        private JButton quar;
        private JButton quin;
        private JButton sex;
        private JButton sab;
        private JButton dom;
        private FundoJpane horas;
        private TJbutton h0;
        private TJbutton h1;
        private TJbutton h2;
        private TJbutton h3;
        private TJbutton h4;
        private TJbutton h5;
        private TJbutton h6;
        private TJbutton h7;
        private TJbutton h8;
        private TJbutton h9;
        private TJbutton h10;
        private TJbutton h11;
        private TJbutton h12;
        private TJbutton h13;
        private TJbutton h14;
        private TJbutton h15;
        private TJbutton h16;
        private TJbutton h17;
        private TJbutton h18;
        private TJbutton h19;
        private TJbutton h20;
        private TJbutton h21;
        private TJbutton h22;
        private TJbutton h23;
        private FundoJpane minutos;
        private TJbutton m0;
        private TJbutton m1;
        private TJbutton m3;
        private TJbutton m2;
        private TJbutton m4;
        private TJbutton m5;
        private TJbutton m6;
        private TJbutton m7;
        private TJbutton m8;
        private TJbutton m9;
        private TJbutton m10;
        private TJbutton m11;
        private TJbutton m12;
        private TJbutton m13;
        private TJbutton m14;
        private TJbutton m15;
        private TJbutton m16;
        private TJbutton m17;
        private TJbutton m18;
        private TJbutton m19;
        private TJbutton m20;
        private TJbutton m21;
        private TJbutton m22;
        private TJbutton m23;
        private TJbutton m24;
        private TJbutton m25;
        private TJbutton m26;
        private TJbutton m27;
        private TJbutton m28;
        private TJbutton m29;
        private TJbutton m31;
        private TJbutton m32;
        private TJbutton m33;
        private TJbutton m34;
        private TJbutton m35;
        private TJbutton m36;
        private TJbutton m30;
        private TJbutton m37;
        private TJbutton m38;
        private TJbutton m39;
        private TJbutton m40;
        private TJbutton m41;
        private TJbutton m42;
        private TJbutton m43;
        private TJbutton m44;
        private TJbutton m45;
        private TJbutton m46;
        private TJbutton m48;
        private TJbutton m47;
        private TJbutton m49;
        private TJbutton m50;
        private TJbutton m51;
        private TJbutton m52;
        private TJbutton m53;
        private TJbutton m54;
        private TJbutton m55;
        private TJbutton m56;
        private TJbutton m57;
        private TJbutton m58;
        private TJbutton m59;
        private JScrollPane scrolldia;
        private TJbutton diau;
        private TJbutton diad;
        private TJlabel lbdia;
        private TJlabel lbdh;
        private JScrollPane scrollHora;
        private TJbutton hu;
        private TJbutton hd;
        private TJbutton mu;
        private TJbutton md;
        private JScrollPane scrollMinutos;
        private TJlabel lbm;
        private TJbutton confa;
        private FundoJpane ld;
        private FundoJpane lh;
        private FundoJpane lm;
    
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
            ImageIcon tl1i = new ImageIcon(getClass().getResource("/GUI/Imagens/NovoBackup.png"));
            tile1=new TJbutton("",0,0,0,0);  
            tile1.setIcon(tl1i);
            tile1.addActionListener(new Novo());
            ImageIcon tl3i = new ImageIcon(getClass().getResource("/GUI/Imagens/rodaRegra.png"));
            tile3=new TJbutton("",0,0,0,0);  
            tile3.setIcon(tl3i);
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
            Runnable rt3 = new Movimento(118,233,80,80,tile3,fundo);
            new Thread(rt3).start();
            Runnable rtt3 = new Movimento(203,256,799,41,textoTile3,fundo);
            new Thread(rtt3).start();        
            Runnable rt4 = new Movimento(118,318,80,80,tile4,fundo);
            new Thread(rt4).start();
            Runnable rtt4 = new Movimento(203,341,799,41,textoTile4,fundo);
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
                    Runnable rt3 = new Recolher(118,233,80,80,tile3,fundo);
                    new Thread(rt3).start();
                    Runnable rtt3 = new Recolher(203,256,799,41,textoTile3,fundo);
                    new Thread(rtt3).start();        
                    Runnable rt4 = new Recolher(118,318,80,80,tile4,fundo);
                    new Thread(rt4).start();
                    Runnable rtt4 = new Recolher(203,341,799,41,textoTile4,fundo);
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
            tl3=new TJlabel("Diretório de destino do backup",0,0,0,0);
            tl3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl3.setForeground(Color.BLACK);
            Runnable bac = new Movimento(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            cbac = new TJtextField(0,0,0,0);
            cbac.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cbac.setForeground(Color.BLACK);
            cbac.setEditable(false);
            Runnable abac = new Movimento(50,372,650,38,cbac,fundo);
            new Thread(abac).start();
            //fim
            //diretorio arquivo
            tl2=new TJlabel("Diretórios e arquivos de origem",0,0,0,0);
            tl2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl2.setForeground(Color.BLACK);
            Runnable dic = new Movimento(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            cdic = new TJtextArea(0,0,0,0);
            cdic.setLineWrap(true);
            cdic.setWrapStyleWord(true);
            cdic.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cdic.setForeground(Color.black);
            cdic.setEditable(false);
            cdic.setBounds(0, 0, WIDTH,HEIGHT);
            scr = new JScrollPane(cdic);
            scr.getVerticalScrollBar().addAdjustmentListener(new Tscroll());
            scr.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0),new LineBorder(Color.BLACK)));
            scr.setOpaque(false);//
            scr.getViewport().setOpaque(false);//
            scr.setBounds(0,0,648,74);   
            Runnable adic = new Movimento(50,256,650,76,scr,fundo);
            new Thread(adic).start();
             //botao procura pasta para backup
            Search=new TJbutton("",0,0,0,0);
            ImageIcon i1 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Search.setIcon(i1);
            Search.addActionListener(new DBackup(this));//backup
            Runnable sea1=new Movimento(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            //botao procura arquivos
            Searchs=new TJbutton("",0,0,0,0);
            ImageIcon i2 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Searchs.setIcon(i2);
            Searchs.addActionListener(new Diretorio(this));//origem
            Runnable sea2=new Movimento(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start();
            //botao confirma
            conf=new TJbutton("Confirmar",0,0,0,255);            
            conf.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            conf.setForeground(Color.WHITE);
            Runnable cf=new Movimento(50,432,90,38,conf,fundo);
            new Thread(cf).start();
            //botão agenda
            age=new TJbutton("Agendamento",0,0,0,255);
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
        class Diretorio implements ActionListener{
        private JFileChooser chooser;
        private JFrame j;
        public Diretorio(JFrame j){
            this.j=j;
        }
        String caminho="";
        @Override
        public void actionPerformed(ActionEvent e) {
            chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);  
            chooser.setMultiSelectionEnabled(true);
            int r=chooser.showOpenDialog(j);
            if (r == JFileChooser.APPROVE_OPTION){
                File[] file=chooser.getSelectedFiles(); 
                try{
                    for(File temp:file)
                    {
                        caminho+=temp.getAbsolutePath()+"\n";
                        cdic.setText(caminho);
                    }
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
        class DBackup implements ActionListener{
        private JFrame j;
        private JFileChooser chooserb;
        public DBackup(JFrame j){
            this.j=j;
        }
        String caminho="";
        @Override
        public void actionPerformed(ActionEvent e) {
            chooserb = new JFileChooser();
            chooserb.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
            chooserb.setMultiSelectionEnabled(false);
            int r=chooserb.showOpenDialog(j);
            if (r == JFileChooser.APPROVE_OPTION){
                File file=chooserb.getSelectedFile(); 
                try{
                        cbac.setText(file.getAbsolutePath());
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
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
        //setBounds (horizontal,vertical,largura,altura);
        public void Agendamento(){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tla=new JLabel(v1);
            tla.addMouseListener(new BackCadas());
            Runnable voltar= new Movimento(50,6,22,22,tla,fundo);
            new Thread(voltar).start();
            tpa=new TJlabel("Agendar Backup",0,0,0,0);
            tpa.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tpa.setForeground(Color.BLACK);
            //escolha de dia
            dia = new JPanel();
            dia.setLayout(null);
            dia.setPreferredSize(new Dimension(100,477));
            dia.setOpaque(false);
            seg=new TJbutton("Segunda",0,0,0,255);
            seg.setBounds(1,53,99,50);
            dia.add(seg);
            ter=new TJbutton("Terça",0,0,0,255);
            ter.setBounds(1,106,99,50);
            dia.add(ter);
            quar=new TJbutton("Quarta",0,0,0,255);
            quar.setBounds(1,159,99,50);
            dia.add(quar);
            quin=new TJbutton("Quinta",0,0,0,255);
            quin.setBounds(1,212,99,50);
            dia.add(quin);
            sex=new TJbutton("Sexta",0,0,0,255);
            sex.setBounds(1,265,99,50);
            dia.add(sex);
            sab=new TJbutton("Sábado",0,0,0,255);
            sab.setBounds(1,318,99,50);
            dia.add(sab);
            dom=new TJbutton("Domingo",0,0,0,255);
            dom.setBounds(1,371,99,50);
            dia.add(dom);
            scrolldia = new JScrollPane(dia);
            scrolldia.setOpaque(false);
            scrolldia.getViewport().setOpaque(false);
            scrolldia.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrolldia.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrolldia.setBorder(null);
            diau = new TJbutton("",0,0,0,0);
            ImageIcon idiau = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            diau.setIcon(idiau);
            diau.addActionListener(new Up(scrolldia));
            diau.setBorder(null);
            diad = new TJbutton("",0,0,0,0);
            ImageIcon idiad = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            diad.setIcon(idiad);
            diad.addActionListener(new Dw(scrolldia));
            diad.setBorder(null);
            lbdia = new TJlabel(null,0,0,0,0);
            lbdia.setText("Dia");
            lbdia.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            //fim escolha de dia
            //escolha Horas
            horas=new FundoJpane(null,0,0,0,0);
            horas.setLayout(null);
            horas.setPreferredSize(new Dimension(52,1378));
            horas.setOpaque(false);
            h0=new TJbutton("00",0,0,0,255);
            h0.setBounds(1,53,50,50);
            horas.add(h0);
            h1=new TJbutton("01",0,0,0,255);
            h1.setBounds(1,106,50,50);
            horas.add(h1);
            h2=new TJbutton("02",0,0,0,255);
            h2.setBounds(1,159,50,50);
            horas.add(h2);            
            h3=new TJbutton("03",0,0,0,255);
            h3.setBounds(1,212,50,50);
            horas.add(h3);
            h4=new TJbutton("04",0,0,0,255);
            h4.setBounds(1,265,50,50);
            horas.add(h4);
            h5=new TJbutton("05",0,0,0,255);
            h5.setBounds(1,318,50,50);
            horas.add(h5);
            h6=new TJbutton("06",0,0,0,255);
            h6.setBounds(1,371,50,50);
            horas.add(h6);
            h7=new TJbutton("07",0,0,0,255);
            h7.setBounds(1,424,50,50);
            horas.add(h7);
            h8=new TJbutton("08",0,0,0,255);
            h8.setBounds(1,477,50,50);
            horas.add(h8);
            h9=new TJbutton("09",0,0,0,255);
            h9.setBounds(1,530,50,50);
            horas.add(h9);
            h10=new TJbutton("10",0,0,0,255);
            h10.setBounds(1,583,50,50);
            horas.add(h10);
            h11=new TJbutton("11",0,0,0,255);
            h11.setBounds(1,636,50,50);
            horas.add(h11);
            h12=new TJbutton("12",0,0,0,255);
            h12.setBounds(1,689,50,50);
            horas.add(h12);
            h13=new TJbutton("13",0,0,0,255);
            h13.setBounds(1,742,50,50);
            horas.add(h13);
            h14=new TJbutton("14",0,0,0,255);
            h14.setBounds(1,795,50,50);
            horas.add(h14);
            h15=new TJbutton("15",0,0,0,255);
            h15.setBounds(1,848,50,50);
            horas.add(h15);
            h16=new TJbutton("16",0,0,0,255);
            h16.setBounds(1,901,50,50);
            horas.add(h16);
            h17=new TJbutton("17",0,0,0,255);
            h17.setBounds(1,954,50,50);
            horas.add(h17);
            h18=new TJbutton("18",0,0,0,255);
            h18.setBounds(1,1007,50,50);
            horas.add(h18);
            h19=new TJbutton("19",0,0,0,255);
            h19.setBounds(1,1060,50,50);
            horas.add(h19);
            h20=new TJbutton("20",0,0,0,255);
            h20.setBounds(1,1113,50,50);
            horas.add(h20);
            h21=new TJbutton("21",0,0,0,255);
            h21.setBounds(1,1166,50,50);
            horas.add(h21);
            h22=new TJbutton("22",0,0,0,255);
            h22.setBounds(1,1219,50,50);
            horas.add(h22);
            h23=new TJbutton("23",0,0,0,255);
            h23.setBounds(1,1272,50,50);
            horas.add(h23);
            lbdh = new TJlabel(null,0,0,0,0);
            lbdh.setText("Hora");
            lbdh.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            scrollHora = new JScrollPane(horas);
            scrollHora.setOpaque(false);
            scrollHora.getViewport().setOpaque(false);
            scrollHora.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollHora.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollHora.setBorder(null);
            hu = new TJbutton("",0,0,0,0);
            ImageIcon ihu = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            hu.setIcon(ihu);
            hu.addActionListener(new Up(scrollHora));
            hu.setBorder(null);
            hd = new TJbutton("",0,0,0,0);
            ImageIcon ihd = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            hd.setIcon(ihd);
            hd.addActionListener(new Dw(scrollHora));
            hd.setBorder(null);
            //escolha minutos
            minutos=new FundoJpane(null,0,0,0,0);
            minutos.setLayout(null);
            minutos.setPreferredSize(new Dimension(52,3286));
            minutos.setOpaque(false);
            m0=new TJbutton("00",0,0,0,255);
            m0.setBounds(1,53,50,50);
            minutos.add(m0);
            m1=new TJbutton("01",0,0,0,255);
            m1.setBounds(1,106,50,50);
            minutos.add(m1);
            m2=new TJbutton("02",0,0,0,255);
            m2.setBounds(1,159,50,50);
            minutos.add(m2);
            m3=new TJbutton("03",0,0,0,255);
            m3.setBounds(1,212,50,50);
            minutos.add(m3);
            m4=new TJbutton("04",0,0,0,255);
            m4.setBounds(1,265,50,50);
            minutos.add(m4);
            m5=new TJbutton("05",0,0,0,255);
            m5.setBounds(1,318,50,50);
            minutos.add(m5);
            m6=new TJbutton("06",0,0,0,255);
            m6.setBounds(1,371,50,50);
            minutos.add(m6);
            m7=new TJbutton("07",0,0,0,255);
            m7.setBounds(1,424,50,50);
            minutos.add(m7);
            m8=new TJbutton("08",0,0,0,255);
            m8.setBounds(1,477,50,50);
            minutos.add(m8);
            m9=new TJbutton("09",0,0,0,255);
            m9.setBounds(1,530,50,50);
            minutos.add(m9);
            m10=new TJbutton("10",0,0,0,255);
            m10.setBounds(1,583,50,50);
            minutos.add(m10);
            m11=new TJbutton("11",0,0,0,255);
            m11.setBounds(1,636,50,50);
            minutos.add(m11);
            m12=new TJbutton("12",0,0,0,255);
            m12.setBounds(1,689,50,50);
            minutos.add(m12);
            m13=new TJbutton("13",0,0,0,255);
            m13.setBounds(1,742,50,50);
            minutos.add(m13);
            m14=new TJbutton("14",0,0,0,255);
            m14.setBounds(1,795,50,50);
            minutos.add(m14);
            m15=new TJbutton("15",0,0,0,255);
            m15.setBounds(1,848,50,50);
            minutos.add(m15);
            m16=new TJbutton("16",0,0,0,255);
            m16.setBounds(1,901,50,50);
            minutos.add(m16);
            m17=new TJbutton("17",0,0,0,255);
            m17.setBounds(1,954,50,50);
            minutos.add(m17);
            m18=new TJbutton("18",0,0,0,255);
            m18.setBounds(1,1007,50,50);
            minutos.add(m18);
            m19=new TJbutton("19",0,0,0,255);
            m19.setBounds(1,1060,50,50);
            minutos.add(m19);
            m20=new TJbutton("20",0,0,0,255);
            m20.setBounds(1,1113,50,50);
            minutos.add(m20);
            m21=new TJbutton("21",0,0,0,255);
            m21.setBounds(1,1166,50,50);
            minutos.add(m21);
            m22=new TJbutton("22",0,0,0,255);
            m22.setBounds(1,1219,50,50);
            minutos.add(m22);
            m23=new TJbutton("23",0,0,0,255);
            m23.setBounds(1,1272,50,50);
            minutos.add(m23);
            m24=new TJbutton("24",0,0,0,255);
            m24.setBounds(1,1325,50,50);
            minutos.add(m24);
            m25=new TJbutton("25",0,0,0,255);
            m25.setBounds(1,1378,50,50);
            minutos.add(m25);
            m26=new TJbutton("26",0,0,0,255);
            m26.setBounds(1,1431,50,50);
            minutos.add(m26);
            m27=new TJbutton("27",0,0,0,255);
            m27.setBounds(1,1484,50,50);
            minutos.add(m27);
            m28=new TJbutton("28",0,0,0,255);
            m28.setBounds(1,1537,50,50);
            minutos.add(m28);
            m29=new TJbutton("29",0,0,0,255);
            m29.setBounds(1,1590,50,50);
            minutos.add(m29);
            m30=new TJbutton("30",0,0,0,255);
            m30.setBounds(1,1643,50,50);
            minutos.add(m30);
            m31=new TJbutton("31",0,0,0,255);
            m31.setBounds(1,1696,50,50);
            minutos.add(m31);
            m32=new TJbutton("32",0,0,0,255);
            m32.setBounds(1,1749,50,50);
            minutos.add(m32);
            m33=new TJbutton("33",0,0,0,255);
            m33.setBounds(1,1802,50,50);
            minutos.add(m33);
            m34=new TJbutton("34",0,0,0,255);
            m34.setBounds(1,1855,50,50);
            minutos.add(m34);
            m35=new TJbutton("35",0,0,0,255);
            m35.setBounds(1,1908,50,50);
            minutos.add(m35);
            m36=new TJbutton("36",0,0,0,255);
            m36.setBounds(1,1961,50,50);
            minutos.add(m36);
            m37=new TJbutton("37",0,0,0,255);
            m37.setBounds(1,2014,50,50);
            minutos.add(m37);
            m38=new TJbutton("38",0,0,0,255);
            m38.setBounds(1,2067,50,50);
            minutos.add(m38);
            m39=new TJbutton("39",0,0,0,255);
            m39.setBounds(1,2120,50,50);
            minutos.add(m39);
            m40=new TJbutton("40",0,0,0,255);
            m40.setBounds(1,2173,50,50);
            minutos.add(m40);
            m41=new TJbutton("41",0,0,0,255);
            m41.setBounds(1,2226,50,50);
            minutos.add(m41);
            m42=new TJbutton("42",0,0,0,255);
            m42.setBounds(1,2279,50,50);
            minutos.add(m42);
            m43=new TJbutton("43",0,0,0,255);
            m43.setBounds(1,2332,50,50);
            minutos.add(m43);
            m44=new TJbutton("44",0,0,0,255);
            m44.setBounds(1,2385,50,50);
            minutos.add(m44);
            m45=new TJbutton("45",0,0,0,255);
            m45.setBounds(1,2438,50,50);
            minutos.add(m45);
            m46=new TJbutton("46",0,0,0,255);
            m46.setBounds(1,2491,50,50);
            minutos.add(m46);
            m47=new TJbutton("47",0,0,0,255);
            m47.setBounds(1,2544,50,50);
            minutos.add(m47);
            m48=new TJbutton("48",0,0,0,255);
            m48.setBounds(1,2597,50,50);
            minutos.add(m48);
            m49=new TJbutton("49",0,0,0,255);
            m49.setBounds(1,2650,50,50);
            minutos.add(m49);
            m50=new TJbutton("50",0,0,0,255);
            m50.setBounds(1,2703,50,50);
            minutos.add(m50);
            m51=new TJbutton("51",0,0,0,255);
            m51.setBounds(1,2756,50,50);
            minutos.add(m51);
            m52=new TJbutton("52",0,0,0,255);
            m52.setBounds(1,2809,50,50);
            minutos.add(m52);
            m53=new TJbutton("53",0,0,0,255);
            m53.setBounds(1,2862,50,50);
            minutos.add(m53);
            m54=new TJbutton("54",0,0,0,255);
            m54.setBounds(1,2915,50,50);
            minutos.add(m54);
            m55=new TJbutton("55",0,0,0,255);
            m55.setBounds(1,2968,50,50);
            minutos.add(m55);
            m56=new TJbutton("56",0,0,0,255);
            m56.setBounds(1,3021,50,50);
            minutos.add(m56);
            m57=new TJbutton("57",0,0,0,255);
            m57.setBounds(1,3074,50,50);
            minutos.add(m57);
            m58=new TJbutton("58",0,0,0,255);
            m58.setBounds(1,3127,50,50);
            minutos.add(m58);
            m59=new TJbutton("59",0,0,0,255);
            m59.setBounds(1,3180,50,50);
            minutos.add(m59);
            lbm = new TJlabel(null,0,0,0,0);
            lbm.setText("Minuto");
            lbm.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            lbm.setBounds(430,257,70,50);
            fundo.add(lbm);
            scrollMinutos = new JScrollPane(minutos);
            scrollMinutos.setOpaque(false);
            scrollMinutos.getViewport().setOpaque(false);
            scrollMinutos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollMinutos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollMinutos.setBorder(null);            
            mu = new TJbutton("",0,0,0,0);
            ImageIcon imu = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            mu.setIcon(imu);
            mu.addActionListener(new Up(scrollMinutos));
            mu.setBorder(null);
            md = new TJbutton("",0,0,0,0);
            ImageIcon imd = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            md.setIcon(imd);
            md.addActionListener(new Dw(scrollMinutos));
            md.setBorder(null);         
            //fim minutos
            confa=new TJbutton("Confirmar",0,0,0,255);            
            confa.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            confa.setForeground(Color.WHITE); 
            confa.setBounds(355,432,90,38);
            fundo.add(confa);
            ImageIcon icd = new ImageIcon(getClass().getResource("/GUI/Imagens/100.png"));
            Image id=icd.getImage();
            ld=new FundoJpane(id,0,0,0,0);
            ld.setBounds(100,208,99,156);
            lh=new FundoJpane(id,0,0,0,0);
            lh.setBounds(300,208,51,156);
            lm=new FundoJpane(id,0,0,0,0);
            lm.setBounds(500,208,51,156);
            //threads de movimento
            //setBounds (horizontal,vertical,largura,altura);
            Runnable min= new Movimento(500,208,51,156,scrollMinutos,fundo);
            new Thread(min).start();
            Runnable upm = new Movimento(550,260,17,27,mu,fundo);
            new Thread(upm).start();
            Runnable dwm = new Movimento(550,288,17,27,md,fundo);
            new Thread(dwm).start();            
            Runnable text = new Movimento(50,25,799,114,tpa,fundo);
            new Thread(text).start();
            Runnable day= new Movimento(100,208,99,156,scrolldia,fundo);
            new Thread(day).start();
            Runnable upd = new Movimento(200,260,17,27,diau,fundo);
            new Thread(upd).start();
            Runnable dwd = new Movimento(200,288,17,27,diad,fundo);
            new Thread(dwd).start();
            Runnable lbd = new Movimento(50,257,50,50,lbdia,fundo);
            new Thread(lbd).start();
            Runnable lbh = new Movimento(250,257,50,50,lbdh,fundo);
            new Thread(lbh).start();
            Runnable hor= new Movimento(300,208,51,156,scrollHora,fundo);
            new Thread(hor).start();
            Runnable uph = new Movimento(350,260,17,27,hu,fundo);
            new Thread(uph).start();
            Runnable dwh = new Movimento(350,288,17,27,hd,fundo);
            new Thread(dwh).start();
            fundo.add(ld);
            fundo.add(lh);
            fundo.add(lm);
        }
        
        //esconder agendamento
        public void hideAgen(){
            Runnable d= new Recolher(100,208,99,156,ld,fundo);
            new Thread(d).start();
            Runnable h= new Recolher(300,208,51,156,lh,fundo);
            new Thread(h).start();
            Runnable m= new Recolher(500,208,51,156,lm,fundo);
            new Thread(m).start();
            Runnable cf=new Recolher(355,432,90,38,confa,fundo);
            new Thread(cf).start();  
            Runnable voltar= new Recolher(50,6,22,22,tla,fundo);
            new Thread(voltar).start();
            Runnable text = new Recolher(50,25,799,114,tpa,fundo);
            new Thread(text).start();
            Runnable day= new Recolher(100,208,99,156,scrolldia,fundo);
            new Thread(day).start();
            Runnable upd = new Recolher(200,260,17,27,diau,fundo);
            new Thread(upd).start();
            Runnable dwd = new Recolher(200,288,17,27,diad,fundo);
            new Thread(dwd).start();
            Runnable lbd = new Recolher(50,257,50,50,lbdia,fundo);
            new Thread(lbd).start();
            Runnable lbh = new Recolher(250,257,50,50,lbdh,fundo);
            new Thread(lbh).start();
            Runnable hor= new Recolher(300,208,51,156,scrollHora,fundo);
            new Thread(hor).start();
            Runnable uph = new Recolher(350,260,17,27,hu,fundo);
            new Thread(uph).start();
            Runnable dwh = new Recolher(350,288,17,27,hd,fundo);
            new Thread(dwh).start();
            Runnable min= new Recolher(500,208,51,156,scrollMinutos,fundo);
            new Thread(min).start();
            Runnable upm = new Recolher(550,260,17,27,mu,fundo);
            new Thread(upm).start();
            Runnable dwm = new Recolher(550,288,17,27,md,fundo);
            new Thread(dwm).start();
            Runnable mlb = new Recolher(430,257,70,50,lbm,fundo);
            new Thread(mlb).start();
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
            Runnable dic = new Movimento(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            Runnable adic = new Movimento(50,256,650,76,scr,fundo);
            new Thread(adic).start();
            Runnable bac = new Movimento(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            Runnable ag=new Movimento(650,432,90,38,age,fundo);
            new Thread(ag).start();
            Runnable cf=new Movimento(50,432,90,38,conf,fundo);
            new Thread(cf).start(); 
            Runnable anome = new Movimento(50,179,650,38,cnome,fundo);
            new Thread(anome).start();
            Runnable abac = new Movimento(50,372,650,38,cbac,fundo);
            new Thread(abac).start();
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
    class Dw implements ActionListener{
        private JScrollPane scr;
        public Dw(JScrollPane scr)
        {
            this.scr=scr;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JScrollBar scroll = scr.getVerticalScrollBar();
            if(scroll.getValue()<=scroll.getMaximum()-53)scroll.setValue(scroll.getValue()+53);
        }
        
    }
    class Up implements ActionListener{

       private JScrollPane scr;
        public Up(JScrollPane scr)
        {
            this.scr=scr;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JScrollBar scroll = scr.getVerticalScrollBar();
            if(scroll.getValue()>0)scroll.setValue(scroll.getValue()-53);        
        }
        
    }
//Minhas classes de movimento
        class Movimento implements Runnable{
        private    int x,y,alt,larg;
        private   JButton b=null;
        private   JLabel l=null;
        private    JPanel j;
        private    TJtextField t=null;
        private    TJtextArea a=null;
        private    JScrollPane r=null;
        private    JPanel p=null;
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
           public Movimento(int x,int y,int larg,int alt,FundoJpane p,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.p=p;
           }
            @Override
            public void run() {
                int temp=800,pi=70;//numero de pixel por velocidade            
                while(temp>=x)
                {
                    try {
                        Thread.sleep(70);//velocidade
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Movimento.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    if(b!=null)
                    {
                        b.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(b);
                    }
                    if(l!=null)
                    {
                        l.setBounds(temp, y, larg, alt);          
                        temp-=pi;
                        j.add(l);
                    }
                     if(t!=null)
                    {
                        t.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(t);
                    }
                     if(a!=null)
                    {
                        a.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(a);
                    }
                     if(r!=null)
                    {
                        r.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(r);
                        j.revalidate();
                    }
                     if(p!=null)
                    {
                        p.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(p);
                    }                      
                }
                    //correção de posição  
                    if(b!=null)
                    {
                        b.setBounds(x, y, larg, alt);
                        j.add(b);
                    }
                    if(l!=null)
                    {
                        l.setBounds(x, y, larg, alt);          
                        j.add(l);
                    }
                     if(t!=null)
                    {
                        t.setBounds(x, y, larg, alt);
                        j.add(t);
                    }
                     if(a!=null)
                    {
                        a.setBounds(x, y, larg, alt);
                        j.add(a);
                    }
                     if(r!=null)
                    {
                        r.setBounds(x, y, larg, alt);
                        j.add(r);
                        j.revalidate();
                    }
                     if(p!=null)
                    {
                        p.setBounds(x, y, larg, alt);
                        j.add(p);
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
