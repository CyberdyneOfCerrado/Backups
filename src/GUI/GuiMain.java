/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Erick Batista do Nascimento
 */

package GUI;
import iteradores.IteradorBackups;
import iteradores.IteradorVersoes;

import java.awt.Color;
import java.awt.FlowLayout;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
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

import enuns.DiasSemana;
import objetos.Artefato;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import objetos.Versao;
import sistema.BuscarClone;
import nucleo.Core;
import bancoDeDados.CarregaBanco;


/**
 *
 * @author erick7
 */
public class GuiMain extends JFrame {
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		FundoJpane imgc;
		public static boolean isCancelado=false;
		private boolean controle;
		private JPanel fundo;
		private int screenX,screenY;
		private int tempx,tempy;
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
        private Core core;
        private Backup B;
        private RegraBackup R;
        private Dias D;
		private TJcheck check;
		private JScrollPane scrollRegra;
		private TJbutton cancela;
		private TJbutton fechar;
		private FundoJpane imgci;
		private JScrollPane scrollVersao;
		private JLabel tlvRegra;
		private JLabel tp1Regra;
		private TJtextField dirp;
		private TJbutton SearchDic;
		private TJlabel procura;
		private TJbutton buscaDuplicado;
		private TJlabel procuraa;
		private TJtextField dirpa;
		private TJbutton SearchArc;
    
    GuiMain()
    {
        setUndecorated(true);
        setResizable(false);
        setSize(800,500);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        constroiFrame();
        core = new Core();
    }
//Elementos do JFrame que sustentam a janela
    private void constroiFrame ()
    {
//montando estrutura de fundo
        ImageIcon icf = new ImageIcon(getClass().getResource("/GUI/Imagens/load.gif"));
        Image imf = icf.getImage();
        fundo=new FundoJpane(imf,0,0,0,0);
        fundo.setLayout(null);
        fundo.setBounds(0,0,800,500);
        fundo.addMouseListener(new AcaoCoordenadasFrameMovimentacao());
        fundo.addMouseMotionListener(new AcaoCoordenadasTelaMovimentacao());
        add(fundo);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage(null);
        setVisible(true);
        controleTelaLoading();
//fim fundo
    }
    private void constroiFundoFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icf = new ImageIcon(getClass().getResource("/GUI/Imagens/Jfundo.png"));
        Image imf = icf.getImage();
        ((FundoJpane) fundo).alterarImagem(imf);
        fechar = new TJbutton("X",0,0,0,0);
        fechar.setBounds(767,6,16,25);
        fechar.addActionListener(new AcaoFechar());
        fechar.setContentAreaFilled(false);
        fechar.setOpaque(false);
        fechar.setForeground(Color.BLACK);
        fechar.setFont(new Font("Consolas",Font.BOLD,18));
        fechar.setBorderPainted(false);
        fundo.add(fechar);
        JButton min = new TJbutton("-",0,0,0,0);
        min.setBounds(748,2,16,25);
        min.addActionListener(new AcaoMinimizar());
        min.setContentAreaFilled(false);
        min.setOpaque(false);
        min.setForeground(Color.BLACK);
        min.setFont(new Font("Consolas",Font.BOLD,32));
        min.setBorderPainted(false);
        fundo.add(min);
        //tela inicio
        telaInicio();
    }
    private void controleTelaLoading(){
    	CarregaBanco b = new CarregaBanco();
        if(b.inciaBanco())constroiFundoFrame();
    }

//tela incial começa aqui
    
    private void telaInicio()
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
            tile1.addActionListener(new AcaoNovoCadastro());
            ImageIcon tl3i = new ImageIcon(getClass().getResource("/GUI/Imagens/rodaRegra.png"));
            tile3=new TJbutton("",0,0,0,0);  
            tile3.setIcon(tl3i);
            textoTile3=new TJlabel("Rodar regra de backup",0,0,0,0);
            textoTile3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile3.setForeground(Color.BLACK);
            tile3.addActionListener(new AcaoRodaRegra());
            ImageIcon tl4 = new ImageIcon(getClass().getResource("/GUI/Imagens/duplicata.png"));
            tile4=new TJbutton("",0,0,0,0);  
            tile4.setIcon(tl4);
            tile4.addActionListener(new AcaoBuscaDuplicada());
            textoTile4=new TJlabel("Buscar arquivos duplicados",0,0,0,0);
            textoTile4.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            textoTile4.setForeground(Color.BLACK);            
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,t1,fundo);
            new Thread(text).start();
            Runnable rt1 = new AcaoMovimentoDeObjetos(118,148,80,80,tile1,fundo);
            new Thread(rt1).start();
            Runnable rtt1 = new AcaoMovimentoDeObjetos(203,171,799,41,textoTile1,fundo);
            new Thread(rtt1).start();            
            Runnable rt3 = new AcaoMovimentoDeObjetos(118,233,80,80,tile3,fundo);
            new Thread(rt3).start();
            Runnable rtt3 = new AcaoMovimentoDeObjetos(203,256,799,41,textoTile3,fundo);
            new Thread(rtt3).start();        
            Runnable rt4 = new AcaoMovimentoDeObjetos(118,318,80,80,tile4,fundo);
            new Thread(rt4).start();
            Runnable rtt4 = new AcaoMovimentoDeObjetos(203,341,799,41,textoTile4,fundo);
            new Thread(rtt4).start();         
        }
        private void esconderInicio()
        {
                    Runnable text = new AcaoRecolherObjetos(50,25,799,114,t1,fundo);
                    new Thread(text).start();
                    Runnable rt1 = new AcaoRecolherObjetos(118,148,80,80,tile1,fundo);
                    new Thread(rt1).start();
                    Runnable rtt1 = new AcaoRecolherObjetos(203,171,799,41,textoTile1,fundo);
                    new Thread(rtt1).start(); 
                    Runnable rt3 = new AcaoRecolherObjetos(118,233,80,80,tile3,fundo);
                    new Thread(rt3).start();
                    Runnable rtt3 = new AcaoRecolherObjetos(203,256,799,41,textoTile3,fundo);
                    new Thread(rtt3).start();        
                    Runnable rt4 = new AcaoRecolherObjetos(118,318,80,80,tile4,fundo);
                    new Thread(rt4).start();
                    Runnable rtt4 = new AcaoRecolherObjetos(203,341,799,41,textoTile4,fundo);
                    new Thread(rtt4).start(); 
        }
        //listeners da tela de inicio
        class AcaoBuscaDuplicada implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				esconderInicio();
				telaBuscaCopia();
			}
        	
        }
        class AcaoNovoCadastro implements ActionListener{          

            @Override
            public void actionPerformed(ActionEvent e) {
                telaCadastro();
                esconderInicio();
        }
        }
        class AcaoRodaRegra implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				esconderInicio();
				regraBackup();
			}
        	
        }
        //tela de  conclusão
        //setBounds (horizontal,vertical,largura,altura);
        private void concluido(){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlv=new JLabel(v1);
            tlv.addMouseListener(new AcaoChamarTelaVoltaInicio(true));
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            t1=new TJlabel("Concluído",0,0,0,0);
            t1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,81));
            t1.setForeground(Color.BLACK);
            ImageIcon tl1i = new ImageIcon(getClass().getResource("/GUI/Imagens/ok.png"));
            Image temp= tl1i.getImage();
            imgc = new FundoJpane(temp,0,0,0,0);
            Runnable icone = new AcaoMovimentoDeObjetos(185,200,100,100,imgc,fundo);
            new Thread(icone).start();
            Runnable text = new AcaoMovimentoDeObjetos(300,180,799,114,t1,fundo);
            new Thread(text).start();
        }
        private void esconderConcluido(){
            Runnable icone = new AcaoRecolherObjetos(185,200,100,100,imgc,fundo);
			new Thread(icone).start();
            Runnable text = new AcaoRecolherObjetos(300,180,799,114,t1,fundo);
			new Thread(text).start();
        }
        //busca backup
        
        private void telaBuscaCopia(){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlv=new JLabel(v1);
            tlv.addMouseListener(new AcaoBuscaToMenu());
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            t1=new TJlabel("Busca de arquivos duplicados",0,0,0,0);
            t1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            t1.setForeground(Color.BLACK);
            Runnable text = new AcaoMovimentoDeObjetos(40,25,799,114,t1,fundo);
            new Thread(text).start();
            procura = new TJlabel("Insira o caminho do diretório a ser consultado",0,0,0,0);
            procura.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            procura.setForeground(Color.BLACK);
            Runnable t1p=new AcaoMovimentoDeObjetos(60,225,700,30,procura,fundo);
            new Thread(t1p).start();
            procuraa = new TJlabel("Insira o arquivo para verificação",0,0,0,0);
            procuraa.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            procuraa.setForeground(Color.BLACK);
            Runnable a=new AcaoMovimentoDeObjetos(60,305,700,30,procuraa,fundo);
            new Thread(a).start();
            //setBounds (horizontal,vertical,largura,altura);
            //campo
            dirp = new TJtextField(0,0,0,0);
            dirp.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            dirp.setForeground(Color.BLACK);
            dirp.setEditable(false);
            Runnable campo=new AcaoMovimentoDeObjetos(60,260,600,30,dirp,fundo);
            new Thread(campo).start();
            dirpa = new TJtextField(0,0,0,0);
            dirpa.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            dirpa.setForeground(Color.BLACK);
            dirpa.setEditable(false);
            Runnable campoa=new AcaoMovimentoDeObjetos(60,340,600,30,dirpa,fundo);
            new Thread(campoa).start();
            //botão pesquisa
            SearchDic=new TJbutton("",0,0,0,0);
            ImageIcon i1 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            SearchDic.setIcon(i1);
            SearchDic.addActionListener(new AcaoChooserProcura(this));//backup
            Runnable sea1=new AcaoMovimentoDeObjetos(665,260,32,32,SearchDic,fundo);
            new Thread(sea1).start();
            SearchArc=new TJbutton("",0,0,0,0);
            ImageIcon i1a = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            SearchArc.setIcon(i1a);
            SearchArc.addActionListener(new AcaoChooserCompara(this));//backup
            Runnable sea1a=new AcaoMovimentoDeObjetos(665,340,32,32,SearchArc,fundo);
            new Thread(sea1a).start();
            buscaDuplicado=new TJbutton("Busca",0,0,0,255);
            buscaDuplicado.setForeground(Color.white);
            buscaDuplicado.addActionListener(new BuscaArquivos());
            Runnable botaoBusca=new AcaoMovimentoDeObjetos(310,400,100,30,buscaDuplicado,fundo);
            new Thread(botaoBusca).start();
        }
        class BuscaArquivos implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				iniCarregamentoBusca();
				System.out.println(dirp.getText());
				Runnable bus = new BuscaClone();
				new Thread(bus).start();
			}
        	
        }
        class BuscaClone implements Runnable{
			public ArrayList<Artefato> listFound;
			@Override
			public void run() {
				if(dirp.getText()==null && dirpa.getText()==null)System.out.println("Alguem ta nulo");
				else listFound=core.buscarClones(dirp.getText(),dirpa.getText());
			}
        	
        }
        private void escondeBuscaCopia(){
            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            Runnable text = new AcaoRecolherObjetos(50,25,799,114,t1,fundo);
            new Thread(text).start();
            Runnable sea1=new AcaoRecolherObjetos(655,285,32,32,SearchDic,fundo);
            new Thread(sea1).start();
            Runnable campo=new AcaoRecolherObjetos(50,285,600,30,dirp,fundo);
            new Thread(campo).start();
            Runnable t1p=new AcaoRecolherObjetos(50,250,700,30,procura,fundo);
            new Thread(t1p).start();
            Runnable botaoBusca=new AcaoRecolherObjetos(310,320,100,30,buscaDuplicado,fundo);
            new Thread(botaoBusca).start();
            Runnable campoa=new AcaoRecolherObjetos(60,340,600,30,dirpa,fundo);
            new Thread(campoa).start();
            Runnable a=new AcaoRecolherObjetos(60,305,700,30,procuraa,fundo);
            new Thread(a).start();
            Runnable sea1a=new AcaoRecolherObjetos(665,340,32,32,SearchArc,fundo);
            new Thread(sea1a).start();
        }
        class AcaoBuscaToMenu implements MouseListener{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				escondeBuscaCopia();
				telaInicio();
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
// tela de cadastro
        private void telaCadastro()
        {

            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlv=new JLabel(v1);
            tlv.addMouseListener(new AcaoChamarTelaVoltaInicio(false));
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            tp1=new TJlabel("Novo backup",0,0,0,0);
            tp1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tp1.setForeground(Color.BLACK);
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            //nome
            tl1=new TJlabel("Nome",0,0,0,0);
            tl1.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl1.setForeground(Color.BLACK);
            Runnable nome = new AcaoMovimentoDeObjetos(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            cnome = new TJtextField(0,0,0,0);
            cnome.setEditable(true);
            cnome.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cnome.setForeground(Color.BLACK);
            Runnable anome = new AcaoMovimentoDeObjetos(50,179,650,38,cnome,fundo);
            new Thread(anome).start();
            //diretorio Backup
            tl3=new TJlabel("Diretório de destino do backup",0,0,0,0);
            tl3.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl3.setForeground(Color.BLACK);
            Runnable bac = new AcaoMovimentoDeObjetos(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            cbac = new TJtextField(0,0,0,0);
            cbac.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cbac.setForeground(Color.BLACK);
            cbac.setEditable(false);
            Runnable abac = new AcaoMovimentoDeObjetos(50,372,650,38,cbac,fundo);
            new Thread(abac).start();
            //fim
            //diretorio arquivo
            tl2=new TJlabel("Diretórios e arquivos de origem",0,0,0,0);
            tl2.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,31));
            tl2.setForeground(Color.BLACK);
            Runnable dic = new AcaoMovimentoDeObjetos(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            cdic = new TJtextArea(0,0,0,0);
            cdic.setLineWrap(true);
            cdic.setWrapStyleWord(true);
            cdic.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
            cdic.setForeground(Color.black);
            cdic.setEditable(false);
            cdic.setBounds(0, 0, WIDTH,HEIGHT);
            scr = new JScrollPane(cdic);
            scr.getVerticalScrollBar().addAdjustmentListener(new AcaoRolagemAutomatica());
            scr.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0),new LineBorder(Color.BLACK)));
            scr.setOpaque(false);//
            scr.getViewport().setOpaque(false);//
            scr.setBounds(0,0,648,74);   
            Runnable adic = new AcaoMovimentoDeObjetos(50,256,650,76,scr,fundo);
            new Thread(adic).start();
             //botao procura pasta para backup
            Search=new TJbutton("",0,0,0,0);
            ImageIcon i1 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Search.setIcon(i1);
            Search.addActionListener(new AcaoChooserBackup(this));//backup
            Runnable sea1=new AcaoMovimentoDeObjetos(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            //botao procura arquivos
            Searchs=new TJbutton("",0,0,0,0);
            ImageIcon i2 = new ImageIcon(getClass().getResource("/GUI/Imagens/sea.jpg"));
            Searchs.setIcon(i2);
            Searchs.addActionListener(new AcaoChooserDiretorio(this));//origem
            Runnable sea2=new AcaoMovimentoDeObjetos(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start();
            //botao confirma
            conf=new TJbutton("Confirmar",0,0,0,255);            
            conf.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            conf.setForeground(Color.WHITE);
            conf.addActionListener(new GravarCadastro());
            Runnable cf=new AcaoMovimentoDeObjetos(50,432,90,38,conf,fundo);
            new Thread(cf).start();
            //botão agenda
            age=new TJbutton("Agendamento",0,0,0,255);
            age.setForeground(Color.white);
            age.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            age.addActionListener(new AcaoChamarTelaAgenda());
            Runnable ag=new AcaoMovimentoDeObjetos(650,432,90,38,age,fundo);
            new Thread(ag).start();
            
            //fim
            //setBounds (horizontal,vertical,largura,altura);
        }
        private void esconderCadastro(){
            Runnable sea1=new AcaoRecolherObjetos(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            Runnable sea2=new AcaoRecolherObjetos(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start(); 
            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            Runnable text = new AcaoRecolherObjetos(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            Runnable nome = new AcaoRecolherObjetos(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            Runnable anome = new AcaoRecolherObjetos(50,179,620,38,cnome,fundo);
            new Thread(anome).start();
            Runnable dic = new AcaoRecolherObjetos(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            Runnable adic = new AcaoRecolherObjetos(50,256,620,76,scr,fundo);
            new Thread(adic).start();
            Runnable bac = new AcaoRecolherObjetos(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            Runnable abac = new AcaoRecolherObjetos(50,372,620,38,cbac,fundo);
            new Thread(abac).start();
            Runnable ag=new AcaoRecolherObjetos(650,432,90,38,age,fundo);
            new Thread(ag).start();
            Runnable cf=new AcaoRecolherObjetos(50,432,90,38,conf,fundo);
            new Thread(cf).start();

        }
        //listener Cadastro
        class GravarCadastro implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(cdic.getText().isEmpty() && cbac.getText().isEmpty() && cnome.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Todos os campos são obrigatórios");
				}else{
				R=new RegraBackup(cbac.getText(),cdic.getText());
				B=new Backup(cnome.getText(), new Date().toString());
				core.criarBackup(B,R);
				esconderCadastro();
				concluido();
				}
			}
        	
        }
        class AcaoChooserDiretorio implements ActionListener{
        private JFileChooser chooser;
        private JFrame j;
        public AcaoChooserDiretorio(JFrame j){
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
                        caminho+=temp.getAbsolutePath()+"|\n";
                        cdic.setText(caminho);
                    }
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
        class AcaoChooserBackup implements ActionListener{
        private JFrame j;
        private JFileChooser chooserb;
        public AcaoChooserBackup(JFrame j){
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
                        cbac.setText(file.getAbsolutePath()+"|");
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
        class AcaoChooserProcura implements ActionListener{
        private JFrame j;
        private JFileChooser chooserb;
        public AcaoChooserProcura(JFrame j){
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
                        dirp.setText(file.getAbsolutePath());
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
        class AcaoChooserCompara implements ActionListener{
        private JFrame j;
        private JFileChooser chooserb;
        public AcaoChooserCompara(JFrame j){
            this.j=j;
        }
        String caminho="";
        @Override
        public void actionPerformed(ActionEvent e) {
            chooserb = new JFileChooser();
            chooserb.setFileSelectionMode(JFileChooser.FILES_ONLY);  
            chooserb.setMultiSelectionEnabled(false);
            int r=chooserb.showOpenDialog(j);
            if (r == JFileChooser.APPROVE_OPTION){
                File file=chooserb.getSelectedFile(); 
                try{
                        dirpa.setText(file.getName());
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(j,"Erro ao carregar o caminho!");
                }
            }
        }
            
        }
        class AcaoChamarTelaVoltaInicio implements MouseListener{
        	boolean c=false;
        	AcaoChamarTelaVoltaInicio(boolean c)
        	{
        		this.c=c;
        	}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(c==true){
					esconderConcluido();
		            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tlv,fundo);
		            new Thread(voltar).start();
				}else esconderCadastro();
				telaInicio();
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
        class AcaoChamarTelaAgenda implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                    esconderCadastro();
                    telaAgendamento();
            }

        }
        class AcaoRolagemAutomatica implements AdjustmentListener{ //rolagem automatica

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
        private void telaAgendamento(){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tla=new JLabel(v1);
            tla.addMouseListener(new AcaoChamarTelaVoltaCadastro());
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tla,fundo);
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
            scrolldia.setEnabled(false);
            scrolldia.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrolldia.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrolldia.setBorder(null);
            diau = new TJbutton("",0,0,0,0);
            ImageIcon idiau = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            diau.setIcon(idiau);
            diau.addMouseListener(new AcaoSubirScroll(scrolldia));
            diau.setBorder(null);
            diad = new TJbutton("",0,0,0,0);
            ImageIcon idiad = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            diad.setIcon(idiad);
            diad.addMouseListener(new AcaoDescerScroll(scrolldia));
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
            scrollHora.setEnabled(false);
            scrollHora.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollHora.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollHora.setBorder(null);
            hu = new TJbutton("",0,0,0,0);
            ImageIcon ihu = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            hu.setIcon(ihu);
            hu.addMouseListener(new AcaoSubirScroll(scrollHora));
            hu.setBorder(null);
            hd = new TJbutton("",0,0,0,0);
            ImageIcon ihd = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            hd.setIcon(ihd);
            hd.addMouseListener(new AcaoDescerScroll(scrollHora));
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
            scrollMinutos.setEnabled(false);
            scrollMinutos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollMinutos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollMinutos.setBorder(null);            
            mu = new TJbutton("",0,0,0,0);
            ImageIcon imu = new ImageIcon(getClass().getResource("/GUI/Imagens/UP.png"));
            mu.setIcon(imu);
            mu.addMouseListener(new AcaoSubirScroll(scrollMinutos));
            mu.setBorder(null);
            md = new TJbutton("",0,0,0,0);
            ImageIcon imd = new ImageIcon(getClass().getResource("/GUI/Imagens/Down.png"));
            md.setIcon(imd);
            md.addMouseListener(new AcaoDescerScroll(scrollMinutos));
            md.setBorder(null);         
            //fim minutos
            confa=new TJbutton("Agendar e confirmar",0,0,0,255);            
            confa.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,18));
            confa.setForeground(Color.WHITE); 
            confa.addActionListener(new SalvaAgendamento());
            confa.setBounds(325,432,150,38);
            fundo.add(confa);
            ImageIcon icd = new ImageIcon(getClass().getResource("/GUI/Imagens/100.png"));
            Image id=icd.getImage();
            ld=new FundoJpane(id,0,0,0,0);
            ld.setBounds(100,208,99,156);
            lh=new FundoJpane(id,0,0,0,0);
            lh.setBounds(300,208,51,156);
            lm=new FundoJpane(id,0,0,0,0);
            lm.setBounds(500,208,51,156);
            check=new TJcheck("Desligar o computador após a execução.",0,0,0,0);
            check.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,30));
            check.setForeground(Color.BLACK); 
            check.setFocusable(false);
            //threads de movimento
            //setBounds (horizontal,vertical,largura,altura);
            Runnable min= new AcaoMovimentoDeObjetos(500,208,51,156,scrollMinutos,fundo);
            new Thread(min).start();
            Runnable upm = new AcaoMovimentoDeObjetos(550,260,17,27,mu,fundo);
            new Thread(upm).start();
            Runnable dwm = new AcaoMovimentoDeObjetos(550,288,17,27,md,fundo);
            new Thread(dwm).start();            
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tpa,fundo);
            new Thread(text).start();
            Runnable day= new AcaoMovimentoDeObjetos(100,208,99,156,scrolldia,fundo);
            new Thread(day).start();
            Runnable upd = new AcaoMovimentoDeObjetos(200,260,17,27,diau,fundo);
            new Thread(upd).start();
            Runnable dwd = new AcaoMovimentoDeObjetos(200,288,17,27,diad,fundo);
            new Thread(dwd).start();
            Runnable lbd = new AcaoMovimentoDeObjetos(50,257,50,50,lbdia,fundo);
            new Thread(lbd).start();
            Runnable lbh = new AcaoMovimentoDeObjetos(250,257,50,50,lbdh,fundo);
            new Thread(lbh).start();
            Runnable hor= new AcaoMovimentoDeObjetos(300,208,51,156,scrollHora,fundo);
            new Thread(hor).start();
            Runnable uph = new AcaoMovimentoDeObjetos(350,260,17,27,hu,fundo);
            new Thread(uph).start();
            Runnable dwh = new AcaoMovimentoDeObjetos(350,288,17,27,hd,fundo);
            new Thread(dwh).start();
            Runnable chd = new AcaoMovimentoDeObjetos(50,328,799,114,check,fundo);
            new Thread(chd).start();
            fundo.add(ld);
            fundo.add(lh);
            fundo.add(lm);
            //setBounds (horizontal,vertical,largura,altura);
        }
        private DiasSemana getDia(JScrollPane scr){;
        	DiasSemana dia=null;
        	JScrollBar scroll = scr.getVerticalScrollBar();
        	int temp=scroll.getValue()+53,resul;
        	resul=temp/53;
        	switch(resul){
        		case 1: dia=DiasSemana.SEGUNDA;
        		break;
        		case 2: dia=DiasSemana.TERCA;
        		break;
        		case 3:	dia=DiasSemana.QUARTA;
        		break;
        		case 4: dia=DiasSemana.QUINTA;
        		break;
        		case 5: dia=DiasSemana.SEXTA;
        		break;
        		case 6: dia=DiasSemana.SABADO;
        		break;
        		case 7: dia=DiasSemana.DOMINGO;
        		break;
        	}
        	return dia;
        }
        
        private String getMinuto(JScrollPane scr){;
    	JScrollBar scroll = scr.getVerticalScrollBar();
    	int temp=scroll.getValue()+53,resul;
    	resul=temp/53;
    	resul--;
    	String minuto=String.valueOf(resul);
    	return minuto;
    }
        private String getHora(JScrollPane scr){;
    	JScrollBar scroll = scr.getVerticalScrollBar();
    	int temp=scroll.getValue()+53,resul;
    	resul=temp/53;
    	resul--;
    	String hora=String.valueOf(resul);
    	return hora;
    }

        //esconder agendamento
        private void esconderAgendamento(){
            Runnable chd = new AcaoRecolherObjetos(50,328,799,114,check,fundo);
            new Thread(chd).start();
            Runnable d= new AcaoRecolherObjetos(100,208,99,156,ld,fundo);
            new Thread(d).start();
            Runnable h= new AcaoRecolherObjetos(300,208,51,156,lh,fundo);
            new Thread(h).start();
            Runnable m= new AcaoRecolherObjetos(500,208,51,156,lm,fundo);
            new Thread(m).start();
            Runnable cf=new AcaoRecolherObjetos(355,432,90,38,confa,fundo);
            new Thread(cf).start();  
            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tla,fundo);
            new Thread(voltar).start();
            Runnable text = new AcaoRecolherObjetos(50,25,799,114,tpa,fundo);
            new Thread(text).start();
            Runnable day= new AcaoRecolherObjetos(100,208,99,156,scrolldia,fundo);
            new Thread(day).start();
            Runnable upd = new AcaoRecolherObjetos(200,260,17,27,diau,fundo);
            new Thread(upd).start();
            Runnable dwd = new AcaoRecolherObjetos(200,288,17,27,diad,fundo);
            new Thread(dwd).start();
            Runnable lbd = new AcaoRecolherObjetos(50,257,50,50,lbdia,fundo);
            new Thread(lbd).start();
            Runnable lbh = new AcaoRecolherObjetos(250,257,50,50,lbdh,fundo);
            new Thread(lbh).start();
            Runnable hor= new AcaoRecolherObjetos(300,208,51,156,scrollHora,fundo);
            new Thread(hor).start();
            Runnable uph = new AcaoRecolherObjetos(350,260,17,27,hu,fundo);
            new Thread(uph).start();
            Runnable dwh = new AcaoRecolherObjetos(350,288,17,27,hd,fundo);
            new Thread(dwh).start();
            Runnable min= new AcaoRecolherObjetos(500,208,51,156,scrollMinutos,fundo);
            new Thread(min).start();
            Runnable upm = new AcaoRecolherObjetos(550,260,17,27,mu,fundo);
            new Thread(upm).start();
            Runnable dwm = new AcaoRecolherObjetos(550,288,17,27,md,fundo);
            new Thread(dwm).start();
            Runnable mlb = new AcaoRecolherObjetos(430,257,70,50,lbm,fundo);
            new Thread(mlb).start();
        }
        //listener agendamento
        class SalvaAgendamento implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Agendado dia: "+getDia(scrolldia)+" ás "+getHora(scrollHora)+":"+getMinuto(scrollMinutos));
				if(cdic.getText().isEmpty() && cbac.getText().isEmpty() && cnome.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Todos os campos são obrigatórios");
				}else{
				boolean des;
				if(check.isSelected())des=true;
				else des=false;
				R=new RegraBackup(cbac.getText(),cdic.getText());
				B=new Backup(cnome.getText(), new Date().toString());
				D=new Dias(getDia(scrolldia),getHora(scrollHora)+":"+getMinuto(scrollMinutos),des);
				core.criarBackup(B,R,D);
				esconderAgendamento();
				esconderCadastro();
				concluido();
				}
			}
        	
        }
        class AcaoChamarTelaVoltaCadastro implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            esconderAgendamento();
            Runnable sea1=new AcaoMovimentoDeObjetos(700,372,38,38,Search,fundo);
            new Thread(sea1).start();
            Runnable sea2=new AcaoMovimentoDeObjetos(700,256,38,38,Searchs,fundo);
            new Thread(sea2).start(); 
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tp1,fundo);
            new Thread(text).start();
            Runnable nome = new AcaoMovimentoDeObjetos(50,140,100,38,tl1,fundo);
            new Thread(nome).start();
            Runnable dic = new AcaoMovimentoDeObjetos(50,217,700,38,tl2,fundo);
            new Thread(dic).start();
            Runnable adic = new AcaoMovimentoDeObjetos(50,256,650,76,scr,fundo);
            new Thread(adic).start();
            Runnable bac = new AcaoMovimentoDeObjetos(50,333,700,38,tl3,fundo);
            new Thread(bac).start();
            Runnable ag=new AcaoMovimentoDeObjetos(650,432,90,38,age,fundo);
            new Thread(ag).start();
            Runnable cf=new AcaoMovimentoDeObjetos(50,432,90,38,conf,fundo);
            new Thread(cf).start(); 
            Runnable anome = new AcaoMovimentoDeObjetos(50,179,650,38,cnome,fundo);
            new Thread(anome).start();
            Runnable abac = new AcaoMovimentoDeObjetos(50,372,650,38,cbac,fundo);
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
        
    class AcaoDescerScroll implements MouseListener{
        private JScrollPane scr;
        boolean cont=false;
        public AcaoDescerScroll(JScrollPane scr)
        {
            this.scr=scr;
        }
		@Override
		public void mouseClicked(MouseEvent arg0) {}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {
			Runnable descer = new Correr(false,scr);
			new Thread(descer).start();
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			controle=false;
		}

    }
    
    class AcaoSubirScroll implements MouseListener{

       private JScrollPane scr;
        public AcaoSubirScroll(JScrollPane scr)
        {
            this.scr=scr;
        }
		@Override
		public void mouseClicked(MouseEvent arg0) {}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {
			Runnable subir = new Correr(true,scr);
			new Thread(subir).start();
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			controle=false;
		}
        
    }
    
    	class Correr implements Runnable{
    		boolean c;
    	    private JScrollPane scr;
    		Correr(boolean c,JScrollPane scr){
    			this.c=c;
    			controle=true;
                this.scr=scr;
    		}
			@Override
			public void run() {
				while(controle){
					  try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(c==false){  JScrollBar scroll = scr.getVerticalScrollBar();
			          if(scroll.getValue()<=scroll.getMaximum()-53)scroll.setValue(scroll.getValue()+53);
					}else{
			            JScrollBar scroll = scr.getVerticalScrollBar();
			            if(scroll.getValue()>0)scroll.setValue(scroll.getValue()-53);
					}
				}
				
			}
    		
    	}
    	//tela regra de backup
        class AcaoRegraToMenu implements MouseListener{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				escondeRegra();
				telaInicio();
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
			private void escondeRegra(){
	            Runnable text = new AcaoRecolherObjetos(50,25,799,114,tp1,fundo);
	            new Thread(text).start();
	            Runnable sr = new AcaoRecolherObjetos(50,140,715,333,scrollRegra,fundo);
	            new Thread(sr).start();	
	            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tlv,fundo);
	            new Thread(voltar).start();
			}
    	private void regraBackup(){
            //setBounds (horizontal,vertical,largura,altura);
    		//fundo das informações
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlv=new JLabel(v1);
            tlv.addMouseListener(new AcaoRegraToMenu());
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
            new Thread(voltar).start();
            tp1=new TJlabel("Rodar Regra de backup",0,0,0,0);
            tp1.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tp1.setForeground(Color.BLACK);
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tp1,fundo);
            new Thread(text).start();
    		Backup ba;
    		int cont=0,cp=1;
    		IteradorBackups ib;
    		int largura=710,altura=125;
    		FundoJpane area = new FundoJpane(null,0,0,0,0);
    		area.setLayout(new FlowLayout());
    		area.setPreferredSize(new Dimension(largura,altura));
    		ib=core.resgatarBackups();
    		scrollRegra = new JScrollPane(area);
    		scrollRegra.setBorder(null);
    		scrollRegra.setOpaque(false);//
    		scrollRegra.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    		scrollRegra.getViewport().setOpaque(false);
    		while(ib.hasNext()){
    			ba=null;
    			ba=ib.next();
    			area.add(criarInfo(ba,cont,125*cp,0,700,123));
    			cp++;
    			cont++;
    			System.out.println(cont);
    			if(ib.hasNext())area.setPreferredSize(new Dimension(largura,altura*cp));
    		}
            Runnable sr = new AcaoMovimentoDeObjetos(50,140,715,333,scrollRegra,fundo);
            new Thread(sr).start();
    		//fim fundo info
    		//motor de apresentação
    		
    	}

		public void iniCarregamento()
        {
            escondeRegra();
    		//setBounds (horizontal,vertical,largura,altura);
            ImageIcon tl1i = new ImageIcon(getClass().getResource("/GUI/Imagens/load3.gif"));
            Image temp= tl1i.getImage();
            imgci = new FundoJpane(temp,0,0,0,0);
            Runnable gifLoad = new AcaoMovimentoDeObjetos(286,121,219,190,imgci,fundo);
            new Thread(gifLoad).start();
            cancela = new TJbutton("Cancelar",0,0,0,255);
            cancela.setForeground(Color.white);
            cancela.addActionListener(new BotaoCancela());
            Runnable cancel = new AcaoMovimentoDeObjetos(304,384,168,57,cancela,fundo);
            new Thread(cancel).start();
        }

		public void iniCarregamentoBusca()
        {
            escondeBuscaCopia();
    		//setBounds (horizontal,vertical,largura,altura);
            ImageIcon tl1i = new ImageIcon(getClass().getResource("/GUI/Imagens/load3.gif"));
            Image temp= tl1i.getImage();
            imgci = new FundoJpane(temp,0,0,0,0);
            Runnable gifLoad = new AcaoMovimentoDeObjetos(286,121,219,190,imgci,fundo);
            new Thread(gifLoad).start();
            cancela = new TJbutton("Cancelar",0,0,0,255);
            cancela.setForeground(Color.white);
            cancela.addActionListener(new BotaoCancela());
            Runnable cancel = new AcaoMovimentoDeObjetos(304,384,168,57,cancela,fundo);
            new Thread(cancel).start();
        }
        class BotaoCancela implements ActionListener{


			public void actionPerformed(ActionEvent arg0) {
				isCancelado=true;	
			}
        	
        }
		public void stopCarregamento(){
    		//setBounds (horizontal,vertical,largura,altura);
            Runnable text = new AcaoRecolherObjetos(199,88,380,269,imgci,fundo);
            new Thread(text).start();
            Runnable cancel = new AcaoRecolherObjetos(304,384,168,57,cancela,fundo);
            new Thread(cancel).start();
            concluido();
        }
    	private FundoJpane criarInfo(Backup b,int p,int h, int v, int l,int a){
    		//tamanho da letra 18
    		//setBounds (horizontal,vertical,largura,altura);
    		Integer i = new Integer(p);
    		FundoJpane celula = new FundoJpane(null,0,0,0,0);
    		celula.setBackground(Color.BLACK);
    		celula.setLayout(null);
    		celula.setPreferredSize(new Dimension(700,123));
    		TJlabel nome=new TJlabel("Nome do Backup:",0,0,0,0);
    		nome.setBounds(0,0,157,18);
    		nome.setBorder(null);
    		nome.setFont(new Font("Microsoft Yi Baiti",Font.BOLD,20));
    		nome.setForeground(Color.black);
    		celula.add(nome);
    		TJlabel data=new TJlabel("Data de Criação:",0,0,0,0);
    		data.setBounds(0,20,147,18);
    		data.setBorder(null);
    		data.setFont(new Font("Microsoft Yi Baiti",Font.BOLD,20));
    		data.setForeground(Color.black);
    		celula.add(data);
    		TJlabel origem=new TJlabel("Caminho do backup:",0,0,0,0);
    		origem.setBounds(0,40,184,18);
    		origem.setFont(new Font("Microsoft Yi Baiti",Font.BOLD,20));
    		origem.setBorder(null);
    		origem.setForeground(Color.black);
    		celula.add(origem);
    		//setBounds (horizontal,vertical,largura,altura);
    		TJtextField cnome = new TJtextField(0,0,0,0);
    		cnome.setBorder(null);
    		cnome.setForeground(Color.black);
    		cnome.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
    		cnome.setBounds(140,0,700,18);
    		celula.add(cnome);
    		TJtextField cdata = new TJtextField(0,0,0,0);
    		cdata.setBorder(null);
    		cdata.setForeground(Color.black);
    		cdata.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
    		cdata.setBounds(135,20,700,18);
    		celula.add(cdata);
    		TJtextField corigem = new TJtextField(0,0,0,0);
    		corigem.setBorder(null);
    		corigem.setForeground(Color.black);
    		corigem.setFont(new Font("Microsoft Yi Baiti",Font.PLAIN,20));
    		corigem.setBounds(160,40,700,18);
    		celula.add(corigem);
    		cnome.setEditable(false);
    		cnome.setFocusable(false);
    		cdata.setEditable(false);
    		cdata.setFocusable(false);
    		corigem.setEditable(false);
    		corigem.setFocusable(false);
    		cnome.setText(b.getNomeBackup());
    		cdata.setText(b.getDataInicio());
    		corigem.setText(b.getRegra().getDestino());
    		TJbutton rodar = new TJbutton("Rodar regra",0,0,0,255);
    		rodar.setForeground(Color.white);
    		TJbutton versao = new TJbutton("Versões",0,0,0,255);
    		TJcheck checkzip=new TJcheck("Salvar saída em Zip.",0,0,0,0);
    		checkzip.setFont(new Font("Microsoft Yi Baiti",Font.BOLD,20));
    		checkzip.setForeground(Color.BLACK); 
    		checkzip.setFocusable(false);
    		checkzip.setBounds(0,65,230,18);
    		celula.add(checkzip);
    		//setBounds (horizontal,vertical,largura,altura);
    		versao.setForeground(Color.white);
    		versao.setBounds(400,65,134,30);
    		rodar.setBounds(231,65,134,30);
    		rodar.addActionListener(new ExecutarRegra(i,checkzip));
    		versao.addActionListener(new Acaoversao(i));
    		celula.add(rodar);
    		celula.add(versao);
    		celula.setBounds(h,v,l,a);
    		return celula;
    	}
    	class Acaoversao implements ActionListener{
    	    int num;
			Acaoversao(int num){
    			this.num=num;
    		}
			@Override
			public void actionPerformed(ActionEvent e) {
				telaVersao(num);
			}
    		
    	}
    	private void telaVersao(int num){
            ImageIcon v1 = new ImageIcon(getClass().getResource("/GUI/Imagens/back.png"));
            tlvRegra=new JLabel(v1);
            tlvRegra.addMouseListener(new voltaRegra());
            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlvRegra,fundo);
            new Thread(voltar).start();
    		escondeRegra();
    		Backup b=null;
    		int cont=0;
    		IteradorBackups ib=core.resgatarBackups();
			while(cont<=num && ib.hasNext()){
				 b=null;
			     b=ib.next();
			     cont++;
			    }
    		IteradorVersoes ver=b.resgatarVersoes();
            tp1Regra=new TJlabel("Informação da versão",0,0,0,0);
            tp1Regra.setFont(new Font("CordiaUPC",Font.PLAIN,83));
            tp1Regra.setForeground(Color.BLACK);
            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tp1Regra,fundo);
            new Thread(text).start();
            TJtextArea infov = new TJtextArea(0,0,0,0);
            infov.setFont(new Font("Microsoft Yi Baiti",Font.BOLD,20));
            infov.setForeground(Color.black);
            infov.setLineWrap(true);
            infov.setWrapStyleWord(true);
            infov.setEditable(false);
    		scrollVersao = new JScrollPane(infov);
    		scrollVersao.setBorder(null);
    		scrollVersao.setOpaque(false);//
    		scrollVersao.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    		scrollVersao.getViewport().setOpaque(false);
            Runnable sv = new AcaoMovimentoDeObjetos(50,140,700,333,scrollVersao,fundo);
            new Thread(sv).start();
            cont=1;
            String str="Versões do backup "+b.nomeBackup+"\n\n\n";
    		if(ver.hasNext()==false){
    			str+="Não há nenhuma versão deste backup ainda!";
    			infov.setText(str);
    		}            
            Versao versao;
    		while(ver.hasNext()){
    		    versao = ver.next();
    			str+="Versão "+cont+"!\n";
    			str+="Ultima modificação: "+versao.dataInicio+"\n";
    			str+="Estado do backup: "+versao.getEstado()+"\n";
    			str+="___________________________________________________________________________\n";
    			cont++;
    		}
    		infov.setText(str);
    	}
    	class voltaRegra implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				escondeVersao();
	            Runnable voltar= new AcaoMovimentoDeObjetos(50,6,22,22,tlv,fundo);
	            new Thread(voltar).start();	
	            Runnable text = new AcaoMovimentoDeObjetos(50,25,799,114,tp1,fundo);
	            new Thread(text).start();
	            Runnable sr = new AcaoMovimentoDeObjetos(50,140,715,333,scrollRegra,fundo);
	            new Thread(sr).start();	
			}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}    
    		
    	}
		private void escondeVersao() {
            Runnable voltar= new AcaoRecolherObjetos(50,6,22,22,tlvRegra,fundo);
            new Thread(voltar).start();
            Runnable text = new AcaoRecolherObjetos(50,25,799,114,tp1Regra,fundo);
            new Thread(text).start();
            Runnable sv = new AcaoRecolherObjetos(50,140,700,333,scrollVersao,fundo);
            new Thread(sv).start();
		}
    	class ExecutarRegra implements ActionListener{ 
    		int num,cont=0;
    		TJcheck zip;
    		Backup ba;
    		IteradorBackups ib=core.resgatarBackups();
    		ExecutarRegra(int num, TJcheck zip){
    			this.num=num;
    			this.zip=zip;
    		}
			@Override
			public void actionPerformed(ActionEvent arg0) {
	    		iniCarregamento();
	    		Runnable send = new enviarRegra(zip,ba,ib,cont,num);
	    		new Thread(send).start();
			}
    		
    	}
    	
    	class enviarRegra implements Runnable{
    		TJcheck zip;
    		Backup ba;
    		IteradorBackups ib;
    		int cont,num;
    		enviarRegra(TJcheck zip,Backup ba,IteradorBackups ib,int cont,int num)
    		{
    			this.zip=zip;
    			this.ba=ba;
    			this.ib=ib;
    			this.cont=cont;
    			this.num=num;
    		}
			@Override
			public void run() {
				while(cont<=num && ib.hasNext()){
				     ba=ib.next();
				     cont++;
				    }
				    core.rodarBackup(ba, zip.isSelected());
				
			}
    		
    	}
//Minhas classes de movimento
        class AcaoMovimentoDeObjetos implements Runnable{
        private    int x,y,alt,larg;
        private   JButton b=null;
        private   JLabel l=null;
        private    JPanel j;
        private    TJtextField t=null;
        private    TJtextArea a=null;
        private    JScrollPane r=null;
        private    JPanel p=null;
        private    TJcheck c=null;
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,JLabel l,JPanel j){
                this.x=x;
                this.y=y;
                this.l=l;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,TJcheck c,JPanel j){
               this.x=x;
               this.y=y;
               this.c=c;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
           }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,JButton b,JPanel j){
                this.x=x;
                this.y=y;
                this.b=b;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,TJtextField t,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.t=t;
           }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,TJtextArea a,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.a=a;
           }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,JScrollPane r,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.r=r;
           }
           public AcaoMovimentoDeObjetos(int x,int y,int larg,int alt,FundoJpane p,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.p=p;
           }
            @Override
            public void run() {
                int temp=800,pi=50;//numero de pixel por velocidade            
                while(temp>=x)
                {
                    try {
                        Thread.sleep(10);//velocidade
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AcaoMovimentoDeObjetos.class.getName()).log(Level.SEVERE, null, ex);
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
                     if(c!=null)
                    {
                        c.setBounds(temp, y, larg, alt);
                        temp-=pi;
                        j.add(c);
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
                     if(c!=null)
                    {
                        c.setBounds(x, y, larg, alt);
                        j.add(c);
                    }
                j.repaint();
                Thread.interrupted();
            }
        }
        
        class AcaoRecolherObjetos implements Runnable{
            private    int x,y,alt,larg;
            private   JButton b=null;
            private   JLabel l=null;
            private    JPanel j;
            private    TJtextField t=null;
            private    TJtextArea a=null;
            private    JScrollPane r=null;
            private    JPanel p=null;
            private    TJcheck c=null;       
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,JLabel l,JPanel j){
                this.x=x;
                this.y=y;
                this.l=l;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,TJcheck c,JPanel j){
               this.x=x;
               this.y=y;
               this.c=c;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
           }
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,JButton b,JPanel j){
                this.x=x;
                this.y=y;
                this.b=b;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
            }
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,JPanel p,JPanel j){
                this.x=x;
                this.y=y;
                this.j=j;
                this.alt=alt;
                this.larg=larg;
                this.p=p;
            }
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,TJtextField t,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.t=t;
           }
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,TJtextArea a,JPanel j){
               this.x=x;
               this.y=y;
               this.j=j;
               this.alt=alt;
               this.larg=larg;
               this.a=a;
           } 
           public AcaoRecolherObjetos(int x,int y,int larg,int alt,JScrollPane r,JPanel j){
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
                        Logger.getLogger(AcaoRecolherObjetos.class.getName()).log(Level.SEVERE, null, ex);
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
                     if(c!=null)
                    {
                        c.setBounds(temp, y, larg, alt);
                        temp+=50;
                        j.add(c);
                    } 
                }
                j.repaint();
                Thread.interrupted();
            }
        }
//listeners arrastar a tela
    class AcaoCoordenadasFrameMovimentacao implements MouseListener{
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
    
    class AcaoCoordenadasTelaMovimentacao implements MouseMotionListener{
		@Override
                public void mouseDragged(MouseEvent e) {	
               screenX = e.getXOnScreen();
               screenY = e.getYOnScreen();
              setLocation(screenX-tempx, screenY-tempy);			
        }
        @Override
        public void mouseMoved(MouseEvent e) { 
    }
    }
 //listeners Botoes Close E MIN
        class AcaoFechar implements ActionListener{    

        @Override
        public void actionPerformed(ActionEvent e) {
                System.exit(1);
        }
    }
        class AcaoMinimizar implements ActionListener{    

        @Override
        public void actionPerformed(ActionEvent e) {
                setState(Frame.ICONIFIED);
        }
    }
//fim da classe
}
