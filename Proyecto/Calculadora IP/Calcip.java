/*
NOMBRE DEL ALUMNO: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CV15
MATERIA: REDES DE COMPUTADORAS
MAESTRO: JUAN JESUS ALCARAZ TORRES
PROGRAMA: CALCULADORA IP
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;

//Variables de instancia
public class Calcip extends JFrame implements ActionListener {
    private JButton jcalc,jlim;
    private JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,k1,k2,k3,k4,k5,k6,k7,k8;
    private JTextField d1,d2,d3,d4,m1,m2,s1,s2,s3,s4,s5,s6,s7,s8,s9,sb1,sb2,sb3;
    private int i;
//Constructor   
    public Calcip(){
        JFrame Ventana = new JFrame();
        Ventana.setSize(500,300);
        Ventana.setTitle("CALCULADORA IP");
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
        ImageIcon escudo = new ImageIcon("IPN.JPG"); 
        Ventana.setIconImage(escudo.getImage());
  
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0xCCFFCC));
        this.getContentPane().add(panel);   
//Se inicializan y se agregan al panel etiquetas, botones y campos de texto     
        j1 = new JLabel("Dirección: ");
        j1.setBounds(400, 10, 70, 20);
        panel.add(j1);
        d1 = new JTextField(3);
        d1.setBounds(460, 10, 30, 20);
        panel.add(d1);
        j2 = new JLabel(".");
        j2.setBounds(495, 10, 30, 20);
        panel.add(j2);
        d2= new JTextField(3);
        d2.setBounds(505, 10, 30, 20);
        panel.add(d2);
        j3 = new JLabel(".");
        j3.setBounds(540, 10, 20, 20);
        panel.add(j3);
        d3= new JTextField(3);
        d3.setBounds(550, 10, 30, 20);
        panel.add(d3);
        j4 = new JLabel(".");
        j4.setBounds(585, 10, 20, 20);
        panel.add(j4);
        d4 = new JTextField(3);
        d4.setBounds(595, 10, 30, 20);
        panel.add(d4);
        j5 = new JLabel("Mascara de red(/24)");
        j5.setBounds(640, 10, 120, 20);
        panel.add(j5);
        m1 = new JTextField(2);
        m1.setBounds(760, 10, 30, 20);
        panel.add(m1);
        j6= new JLabel("mover a: ");
        j6.setBounds(800, 10, 80, 20);
        panel.add(j6);
        m2 = new JTextField(2);
        m2.setBounds(860, 10, 30, 20);
        panel.add(m2);
        jcalc = new JButton("Calcular");
        jcalc.setBounds(500, 40, 90, 20);
        panel.add(jcalc);
        jcalc.addActionListener(this);
        jlim = new JButton("Limpiar");
        jlim.setBounds(600, 40, 90, 20);
        panel.add(jlim);
        jlim.addActionListener(this);
        j8 = new JLabel("");
        j8.setBounds(450, 60, 300, 30);
        panel.add(j8);
        j9 = new JLabel("Direccion IP: ");
        j9.setBounds(30, 100, 120, 30);
        panel.add(j9);
        s1 = new JTextField(15);
        s1.setBounds(120, 100, 100, 30);
        panel.add(s1);
        sb1 = new JTextField(40);
        sb1.setBounds(230, 100, 260, 30);
        panel.add(sb1);
        k1 = new JLabel("Mascara: ");
        k1.setBounds(30, 140, 120, 30);
        panel.add(k1);
        s2 = new JTextField(15);
        s2.setBounds(120, 140, 100, 30);
        panel.add(s2);
        sb2 = new JTextField(40);
        sb2.setBounds(230, 140, 260, 30);
        panel.add(sb2);
        k2 = new JLabel("Wildcard: ");
        k2.setBounds(30, 180, 120, 30);
        panel.add(k2);
        s3 = new JTextField(15);
        s3.setBounds(120, 180, 100, 30);
        panel.add(s3);
        sb3 = new JTextField(40);
        sb3.setBounds(230, 180, 260, 30);
        panel.add(sb3);
        k3 = new JLabel("Host min:");
        k3.setBounds(30, 220, 120, 30);
        panel.add(k3);
        s4 = new JTextField(15);
        s4.setBounds(120, 220, 100, 30);
        panel.add(s4);
        k4 = new JLabel("Host max:");
        k4.setBounds(30, 260, 120, 30);
        panel.add(k4);
        s5 = new JTextField(15);
        s5.setBounds(120,260,100,30);
        panel.add(s5);
        k5  =new JLabel("Broadcast:");
        k5.setBounds(30, 300, 120, 30);
        panel.add(k5);
        s6 = new JTextField(15);
        s6.setBounds(120, 300, 100, 30);
        panel.add(s6);
        k6 = new JLabel("Hosts/red:");
        k6.setBounds(30, 340, 120, 30);
        panel.add(k6);
        s7 = new JTextField(15);
        s7.setBounds(120, 340, 100, 30);
        panel.add(s7);
        k7 = new JLabel("Subredes:");
        k7.setBounds(30, 380, 120, 30);
        panel.add(k7);
        s8 = new JTextField(15);
        s8.setBounds(120, 380, 100, 30);
        panel.add(s8);
        k8 = new JLabel("Host/subred:");
        k8.setBounds(30, 420, 120, 30);
        panel.add(k8);
        s9 = new JTextField(15);
        s9.setBounds(120, 420, 100, 30);
        panel.add(s9);
        setVisible(true);

    }
//Metodo para obtener y realizar operaciones con la interaccion de los elementos
    public void actionPerformed(ActionEvent e){
//Variables locales para el manejo de los dato ingresados
        int mod1, mod2, mod3, mod4, tama = 0, rtam = 0 , modm1 = 0;
        int tmas = 0, var = 0, modm2 = 0, qh = 0, q1,q2,q3,q4;
        int icad1, icad2, icad3, exp = 0, val = 0, res = 0;
        int smp1 = 0, vaux = 0, resta = 0, nsubr = 0;
        String part1;
        String part2;
        String part3;
        String bin1 = "";
        String bin2 = "";
        String bin3 = "";
        String bin4 = "";
        String bim1 = "";
        String f = "0";
        
//Obtencion de la direccion IP y del numero de bits de la mascara
        JButton jb = (JButton)e.getSource();
        int p1 = Integer.parseInt(d1.getText());
        int p2 = Integer.parseInt(d2.getText());
        int p3 = Integer.parseInt(d3.getText());
        int p4 = Integer.parseInt(d4.getText());
        int sm1 = Integer.parseInt(m1.getText());
        int sm2 = Integer.parseInt(m2.getText());
//-------------------------BOTON CALCULAR-------------------------------------------
        if(jb == jcalc){
            if(p1 < 127){//Cuando el primer octeto es menor a 127
//Se tiene una clase A
                j8.setText("Red de Clase A");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                q1 = p1;
                q2 = p2;
                q3 = p3;
                resta = sm2 -sm1;
                resta = (int)(Math.pow(2, resta));
                s8.setText(""+resta);
                nsubr = 32 - sm2;
                nsubr = (int)(Math.pow(2,nsubr))-2;
                s9.setText(""+nsubr);
//-------------------------------------------------------------------------
                while(p1>0){//Se obtiene el binario del primer octeto
                    mod1 = p1%2;
                    bin1 = mod1 + bin1;
                    p1 = p1/2;
                }
//Se agrega un 0 al MSB del octeto
                bin1 = f + bin1; 
                part1 = bin1;
                
                while(p2>0){//Se obtiene el binario del segundo octeto
                    mod2 = p2%2;
                    bin2 = mod2 + bin2;
                    p2 = p2/2;
                }
//Se obitene el tamano del octeto y si es menor a 8 se agregan ceros 
                if(tama < 8){
                    f ="";
                    tama = bin2.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin2 = f + bin2;//Se agregan los ceros
                }
                part2 = bin2;
                while(p3>0){//Se obtiene el binario del tercer octeto
                    mod3 = p3%2;
                    bin3 = mod3 + bin3;
                    p3 = p3/2;
                }
                tama = 0;
                rtam = 0;
//Se obtiene el tamaño del segundo octeto y si es menor a 8 se agregan ceros
                if(tama < 8){
                    f ="";
                    tama = bin3.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin3 = f + bin3;//Se agregan los ceros
                }
                part3 = bin3;
                rtam = 0;
                tama = 0;
                while(p4>0){//Se obtiene el binario del cuarto octeto
                    mod4 = p4%2;
                    bin4 = mod4 + bin4;
                    p4 = p4/2;
                }
                if(tama < 8){
                    f ="";
                    tama = bin4.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin4 = f + bin4;//Se agregan los ceros
                }
                sb1.setText(""+bin1+"."+bin2+"."+bin3+"."+bin4);
//Se obtienen los hosts por red 
                qh = 32 - sm1;
                qh = (int)(Math.pow(2, qh)-2);
                s7.setText(""+qh);
//Se obtiene la mascara a partir del valor de bits que se ingresa
                if(sm1<=8){// se obtiene la mascara
                    if(sm1 == 8){
                        s2.setText("255.0.0.0");
                        sb2.setText("11111111.00000000.00000000.00000000");
                        s3.setText("0.255.255.255");
                        sb3.setText("00000000.11111111.11111111.11111111");
                        s4.setText(""+q1+".0.0.1");
                        s5.setText(""+q1+".255.255.254");
                        s6.setText(""+q1+".255.255.255");
                        
                        
                    }
                    else{
                        sm1 = 8 - sm1;
                        smp1 = sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText(""+sm1+".0.0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText(""+bim1+".00000000.00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText(""+var+".255.255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText(""+bim1+".11111111.11111111.11111111");
//------------OBTENCION DE HOST MINIMO, MAXIMO Y BROADCAST------------------------
                        part1 = bin1.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q1 = q1 - res;
                        s4.setText(""+q1+".0.0.1");
                        vaux = 255 - vaux;
                        vaux = q1 + vaux;
                        s5.setText(""+vaux+".255.255.254");
                        s6.setText(""+vaux+".255.255.255");
                    }
                }
//-------------FINAL DE MASCARA MENOR O IGUAL A 8--------------------------------  
//Mascara de bits a partir del numero de bits entre 9 y 16
                if(sm1>8 && sm1<=16){
                    if(sm1 == 16){
                        s2.setText("255.255.0.0");
                        sb2.setText("11111111.11111111.00000000.00000000");
                        s3.setText("0.0.255.255");
                        sb3.setText("00000000.00000000.11111111.11111111");
                        s4.setText(""+q1+"."+q2+".0.1");
                        s5.setText(""+q1+"."+q2+".255.254");
                        s6.setText(""+q1+"."+q2+".255.255");
                    }
                    else{
                        sm1 = 16 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255."+sm1+".0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111."+bim1+".00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText("0."+var+".255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000."+bim1+".11111111.11111111");
//--------OBTENCION DE HOST MINIMO,MAXIMO Y BROADCAST----------------------------
                        part1 = bin2.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q2 = q2 - res;
                        s4.setText(""+q1+"."+q2+".0.1");
                        vaux = 255 - vaux;
                        vaux = q2 + vaux;
                        s5.setText(""+q1+"."+vaux+".255.254");
                        s6.setText(""+q1+"."+vaux+".255.255");
                    }
                }
//------------------FINAL DE MASCARA MENOR O IGUAL A 16-------------------------
                if(sm1>16 && sm1<=24){
                    if(sm1 == 24){
                        s2.setText("255.255.255.0");
                        sb2.setText("11111111.11111111.11111111.00000000");
                        s3.setText("0.0.0.255");
                        sb3.setText("00000000.00000000.00000000.11111111");
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        s5.setText(""+q1+"."+q2+"."+q3+".254");
                        s6.setText(""+q1+"."+q2+"."+q3+".255");
                    }
                    else{
                        sm1 = 24 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255.255."+sm1+".0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111.11111111."+bim1+".00000000");
                        var = 255 - var;
                        s3.setText("0.0."+var+".255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000.00000000."+bim1+".11111111");
//--------------OBTENCION DE HOST MINIMO,MAXIMO Y BROADCAST---------------------
                        part1 = bin3.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q3 = q3 - res;
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        vaux = 255 - vaux;
                        vaux = q3 + vaux;
                        s5.setText(""+q1+"."+q2+"."+vaux+".254");
                        s6.setText(""+q1+"."+q2+"."+vaux+".255");
                    }
                }
//-------------FINAL DE MASCAAR MENOR O IGUAL A 24------------------------------                   
            }
//////////////////////////////////////////////////////////////////////////////////////////
            if(p1 == 127){
                j8.setText("El intervalo 127.x.x.x esta reservado como loopback");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                
            }
//****************************************************************************************
//////////////////////////////////////////////////////////////////////////////////////////
            if(p1 >= 128 && p1 <= 191){
                j8.setText("Red de Clase B");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                q1 = p1;
                q2 = p2;
                q3 = p3;
                resta = sm2 -sm1;
                resta = (int)(Math.pow(2, resta));
                s8.setText(""+resta);
                nsubr = 32 - sm2;
                nsubr = (int)(Math.pow(2,nsubr))-2;
                s9.setText(""+nsubr);
                while(p1>0){//Se obtiene el binario del primer octeto
                    mod1 = p1%2;
                    bin1 = mod1 + bin1;
                    p1 = p1/2;
                }
//Se agrega un 0 al MSB del octeto
                bin1 = f + bin1;  
                part1 = bin1;
                while(p2>0){//Se obtiene el binario del segundo octeto
                    mod2 = p2%2;
                    bin2 = mod2 + bin2;
                    p2 = p2/2;
                }
//Se obitene el tamano del octeto y si es menor a 8 se agregan ceros 
                if(tama < 8){
                    f ="";
                    tama = bin2.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin2 = f + bin2;//Se agregan los ceros
                }
                part2 = bin2;
                while(p3>0){//Se obtiene el binario del tercer octeto
                    mod3 = p3%2;
                    bin3 = mod3 + bin3;
                    p3 = p3/2;
                }
                tama = 0;
                rtam = 0;
//Se obtiene el tamaño del segundo octeto y si es menor a 8 se agregan ceros
                if(tama < 8){
                    f ="";
                    tama = bin3.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin3 = f + bin3;//Se agregan los ceros
                }
                part3 = bin3;
                rtam = 0;
                tama = 0;
                while(p4>0){//Se obtiene el binario del cuarto octeto
                    mod4 = p4%2;
                    bin4 = mod4 + bin4;
                    p4 = p4/2;
                }
                if(tama < 8){
                    f ="";
                    tama = bin4.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin4 = f + bin4;//Se agregan los ceros
                }
                sb1.setText(""+bin1+"."+bin2+"."+bin3+"."+bin4);
//Se obtienen los hosts por red 
                qh = 32 - sm1;
                qh = (int)(Math.pow(2, qh)-2);
                s7.setText(""+qh);
//Se obtiene la mascara a partir del valor de bits que se ingresa
                if(sm1<=8){// se obtiene la mascara
                    if(sm1 == 8){
                        s2.setText("255.0.0.0");
                        sb2.setText("11111111.00000000.00000000.00000000");
                        s3.setText("0.255.255.255");
                        sb3.setText("00000000.11111111.11111111.11111111");
                        s4.setText(""+q1+".0.0.1");
                        s5.setText(""+q1+".255.255.254");
                        s6.setText(""+q1+".255.255.255");
                        
                    }
                    else{
                        sm1 = 8 - sm1;
                        smp1 = sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText(""+sm1+".0.0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText(""+bim1+".00000000.00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText(""+var+".255.255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText(""+bim1+".11111111.11111111.11111111");
//-------------OBTENCION DE HOST MINIMO.MAXIMO Y BROADCAST----------------------
                        part1 = bin1.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q1 = q1 - res;
                        s4.setText(""+q1+".0.0.1");
                        vaux = 255 - vaux;
                        vaux = q1 + vaux;
                        s5.setText(""+vaux+".255.255.254");
                        s6.setText(""+vaux+".255.255.255");
                    }
//-----------FINAL DE MASCARA MENOR O IGUAL A 8---------------------------------
                }
//Mascara de bits a partir del numero de bits entre 9 y 16
                if(sm1>8 && sm1<=16){
                    if(sm1 == 16){
                        s2.setText("255.255.0.0");
                        sb2.setText("11111111.11111111.00000000.00000000");
                        s3.setText("0.0.255.255");
                        sb3.setText("00000000.00000000.11111111.11111111");
                        s4.setText(""+q1+"."+q2+".0.1");
                        s5.setText(""+q1+"."+q2+".255.254");
                        s6.setText(""+q1+"."+q2+".255.255");
                    }
                    else{
                        sm1 = 16 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255."+sm1+".0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111."+bim1+".00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText("0."+var+".255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000."+bim1+".11111111.11111111");
//-------------OBTENCION DE HOST MINIMO, MAXIMO Y BROADCAST---------------------
                        part1 = bin2.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q2 = q2 - res;
                        s4.setText(""+q1+"."+q2+".0.1");
                        vaux = 255 - vaux;
                        vaux = q2 + vaux;
                        s5.setText(""+q1+"."+vaux+".255.254");
                        s6.setText(""+q1+"."+vaux+".255.255");
//--------------FINAL DE LA MASCARA MENOR O IGUAL A 16--------------------------
                    }
                }
                if(sm1>16 && sm1<=24){
                    if(sm1 == 24){
                        s2.setText("255.255.255.0");
                        sb2.setText("11111111.11111111.11111111.00000000");
                        s3.setText("0.0.0.255");
                        sb3.setText("00000000.00000000.00000000.11111111");
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        s5.setText(""+q1+"."+q2+"."+q3+".254");
                        s6.setText(""+q1+"."+q2+"."+q3+".255");
                    }
                    else{
                        sm1 = 24 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255.255."+sm1+".0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111.11111111."+bim1+".00000000");
                        var = 255 - var;
                        s3.setText("0.0."+var+".255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000.00000000."+bim1+".11111111");
//------- HOST MAXIMO. MINIMO Y BROADCAST---------------------------------------
                        part1 = bin3.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q3 = q3 - res;
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        vaux = 255 - vaux;
                        vaux = q3 + vaux;
                        s5.setText(""+q1+"."+q2+"."+vaux+".254");
                        s6.setText(""+q1+"."+q2+"."+vaux+".255");
//----------------FINAL DE MASACRA MENOR O IGUAL A 24---------------------------
                    }
                }
 
            }
//****************************************************************************************
//////////////////////////////////////////////////////////////////////////////////////////
            if(p1 >= 192 && p1<= 223){
                j8.setText("Red de Clase C");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                q1 = p1;
                q2 = p2;
                q3 = p3;
                resta = sm2 -sm1;
                resta = (int)(Math.pow(2, resta));
                s8.setText(""+resta);
                nsubr = 32 - sm2;
                nsubr = (int)(Math.pow(2,nsubr))-2;
                s9.setText(""+nsubr);
                while(p1>0){//Se obtiene el binario del primer octeto
                    mod1 = p1%2;
                    bin1 = mod1 + bin1;
                    p1 = p1/2;
                }
//Se agrega un 0 al MSB del octeto
                bin1 = f + bin1;  
                part1 = bin1;
                while(p2>0){//Se obtiene el binario del segundo octeto
                    mod2 = p2%2;
                    bin2 = mod2 + bin2;
                    p2 = p2/2;
                }
//Se obitene el tamano del octeto y si es menor a 8 se agregan ceros 
                if(tama < 8){
                    f ="";
                    tama = bin2.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin2 = f + bin2;//Se agregan los ceros
                }
                part2 = bin2;
                while(p3>0){//Se obtiene el binario del tercer octeto
                    mod3 = p3%2;
                    bin3 = mod3 + bin3;
                    p3 = p3/2;
                }
                tama = 0;
                rtam = 0;
//Se obtiene el tamaño del segundo octeto y si es menor a 8 se agregan ceros
                if(tama < 8){
                    f ="";
                    tama = bin3.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin3 = f + bin3;//Se agregan los ceros
                }
                part3 = bin3;
                rtam = 0;
                tama = 0;
                while(p4>0){//Se obtiene el binario del cuarto octeto
                    mod4 = p4%2;
                    bin4 = mod4 + bin4;
                    p4 = p4/2;
                }
                if(tama < 8){
                    f ="";
                    tama = bin4.length();
                    rtam = 8 - tama;
                    for(i=1; i<=rtam;i++){
                        f=f+0;
                    }
                    bin4 = f + bin4;//Se agregan los ceros
                }
                sb1.setText(""+bin1+"."+bin2+"."+bin3+"."+bin4);
//Se obtienen los hosts por red 
                qh = 32 - sm1;
                qh = (int)(Math.pow(2, qh)-2);
                s7.setText(""+qh);
//Se obtiene la mascara a partir del valor de bits que se ingresa
                if(sm1<=8){// se obtiene la mascara
                    if(sm1 == 8){
                        s2.setText("255.0.0.0");
                        sb2.setText("11111111.00000000.00000000.00000000");
                        s3.setText("0.255.255.255");
                        sb3.setText("00000000.11111111.11111111.11111111");
                        s4.setText(""+q1+".0.0.1");
                        s5.setText(""+q1+".255.255.254");
                        s6.setText(""+q1+".255.255.255");
                        
                    }
                    else{
                        sm1 = 8 - sm1;
                        smp1 = sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText(""+sm1+".0.0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText(""+bim1+".00000000.00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText(""+var+".255.255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText(""+bim1+".11111111.11111111.11111111");
//-------------OBTENCION DE HOST MINIMO.MAXIMO Y BROADCAST----------------------
                        part1 = bin1.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q1 = q1 - res;
                        s4.setText(""+q1+".0.0.1");
                        vaux = 255 - vaux;
                        vaux = q1 + vaux;
                        s5.setText(""+vaux+".255.255.254");
                        s6.setText(""+vaux+".255.255.255");
//---------------FINAL MASCARA MENOR O IGUAL A 8--------------------------------
                    }
                }
//Mascara de bits a partir del numero de bits entre 9 y 16
                if(sm1>8 && sm1<=16){
                    if(sm1 == 16){
                        s2.setText("255.255.0.0");
                        sb2.setText("11111111.11111111.00000000.00000000");
                        s3.setText("0.0.255.255");
                        sb3.setText("00000000.00000000.11111111.11111111");
                        s4.setText(""+q1+"."+q2+".0.1");
                        s5.setText(""+q1+"."+q2+".255.254");
                        s6.setText(""+q1+"."+q2+".255.255");
                    }
                    else{
                        sm1 = 16 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255."+sm1+".0.0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111."+bim1+".00000000.00000000");
//Se obtiene el Wildcard correspondiente 
                        var = 255 - var;
                        s3.setText("0."+var+".255.255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000."+bim1+".11111111.11111111");
//-------------OBTENCION DE HOST MINIMO, MAXIMO Y BROADCAST---------------------
                        part1 = bin2.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q2 = q2 - res;
                        s4.setText(""+q1+"."+q2+".0.1");
                        vaux = 255 - vaux;
                        vaux = q2 + vaux;
                        s5.setText(""+q1+"."+vaux+".255.254");
                        s6.setText(""+q1+"."+vaux+".255.255");
//--------------FINAL DE LA MASCARA MENOR O IGUAL A 16--------------------------
                    }
                }
                if(sm1>16 && sm1<=24){
                    if(sm1 == 24){
                        s2.setText("255.255.255.0");
                        sb2.setText("11111111.11111111.11111111.00000000");
                        s3.setText("0.0.0.255");
                        sb3.setText("00000000.00000000.00000000.11111111");
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        s5.setText(""+q1+"."+q2+"."+q3+".254");
                        s6.setText(""+q1+"."+q2+"."+q3+".255");
                    }
                    else{
                        sm1 = 24 - sm1;
                        smp1 = 8 - sm1;
                        sm1 = (int) (Math.pow(2, 8) - Math.pow(2, sm1));
                        var = sm1;
                        vaux = sm1;
                        s2.setText("255.255."+sm1+".0");
                        while(sm1>0){//Se obtiene el binario de la mascara
                            modm1 = sm1%2;
                            bim1 = modm1 + bim1;
                            sm1 = sm1/2;
                        }
                        
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb2.setText("11111111.11111111."+bim1+".00000000");
                        var = 255 - var;
                        s3.setText("0.0."+var+".255");
                        modm1 = 0;
                        bim1 = "";
                        while(var>0){//Se obtiene el binario de la mascara
                            modm1 = var%2;
                            bim1 = modm1 + bim1;
                            var = var/2;
                        }
                        tmas = 0;
                        rtam = 0;
                        if(tmas < 8){//Se agregan ceros para formar el octeto
                            f ="";
                            tmas = bim1.length();
                            rtam = 8 - tmas;
                            for(i=1; i<=rtam;i++){
                                f=f+0;
                            }
                        bim1 = f + bim1;//Se agregan los ceros
                        }
                        sb3.setText("00000000.00000000."+bim1+".11111111");
//------- HOST MAXIMO. MINIMO Y BROADCAST---------------------------------------
                        part1 = bin3.substring(smp1+1);
                        icad1 = Integer.valueOf(part1);
                        while(icad1>0){
                            val = icad1%10;
                            res = res + val*(int)Math.pow(2, exp);
                            exp++;
                            icad1 = icad1/10;
                        }
                        q3 = q3 - res;
                        s4.setText(""+q1+"."+q2+"."+q3+".1");
                        vaux = 255 - vaux;
                        vaux = q3 + vaux;
                        s5.setText(""+q1+"."+q2+"."+vaux+".254");
                        s6.setText(""+q1+"."+q2+"."+vaux+".255");
//----------------FINAL DE MASACRA MENOR O IGUAL A 24---------------------------
                    }
                }

            }
//****************************************************************************************
//////////////////////////////////////////////////////////////////////////////////////////
            if(p1 >= 224 && p1<= 239){
                j8.setText("Red de Clase D");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                sb1.setText("No disponible");
                s2.setText("No disponible");
                sb2.setText("No disponible");
                s3.setText("No disponible");
                sb3.setText("No disponible");
                s4.setText("No disponible");
                s5.setText("No disponible");
                s6.setText("No disponible");
                s7.setText("No disponible");
                s8.setText("No disponible");
                s9.setText("No disponible");
            }
//****************************************************************************************
//////////////////////////////////////////////////////////////////////////////////////////
            if(p1 >= 240 && p1<= 255){
                j8.setText("Red de Clase E");
                s1.setText(""+p1+"."+p2+"."+p3+"."+p4);
                s2.setText("No disponible");
                sb1.setText("No disponible");
                s2.setText("No disponible");
                sb2.setText("No disponible");
                s3.setText("No disponible");
                sb3.setText("No disponible");
                s4.setText("No disponible");
                s5.setText("No disponible");
                s6.setText("No disponible");
                s7.setText("No disponible");
                s8.setText("No disponible");
                s9.setText("No disponible");
            }
//*****************************************************************************************
        }//FIN DEL BOTON CALCULAR
//-----------------BOTON PARA LIMPIAR LOS CAMPOS DE ENTRADA Y SALIDA---------------------------
        if(jb == jlim){
            j8.setText("");
            d1.setText("");
            d2.setText("");
            d3.setText("");
            d4.setText("");
            m1.setText("");
            m2.setText("");
            s1.setText("");
            sb1.setText("");
            s2.setText("");
            sb2.setText("");
            s3.setText("");
            sb3.setText("");
            s4.setText("");
            s5.setText("");
            s6.setText("");
            s7.setText("");
            s8.setText("");
            s9.setText("");
        }

    }
//---------------MAIN DE LA CALCULADORA-----------------------------------------------------
    public static void main(String[] args){
        Calcip calculadora = new Calcip();
    }
}
