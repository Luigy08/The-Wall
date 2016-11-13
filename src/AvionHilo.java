/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author wilmer
 */
public class AvionHilo extends Thread{
    
    private JProgressBar barra;
    private JLabel jL_Asiento1;
    private JLabel jL_Asiento2;
    private JLabel jL_Asiento3;
    private JLabel jL_Asiento4;
    private JLabel jL_Asiento5;
    private boolean avanzar;
    private boolean vive;

    public AvionHilo() {
    }

 

    public AvionHilo( JLabel jL_Asiento1, JLabel jL_Asiento2, JLabel jL_Asiento3, JLabel jL_Asiento4, JLabel jL_Asiento5) {
        this.jL_Asiento1 = jL_Asiento1;
        this.jL_Asiento2 = jL_Asiento2;
        this.jL_Asiento3 = jL_Asiento3;
        this.jL_Asiento4 = jL_Asiento4;
        this.jL_Asiento5 = jL_Asiento5;
        avanzar = true;
        vive = true;
    }

    public JLabel getjL_Asiento1() {
        return jL_Asiento1;
    }

    public void setjL_Asiento1(JLabel jL_Asiento1) {
        this.jL_Asiento1 = jL_Asiento1;
    }

    public JLabel getjL_Asiento2() {
        return jL_Asiento2;
    }

    public void setjL_Asiento2(JLabel jL_Asiento2) {
        this.jL_Asiento2 = jL_Asiento2;
    }

    public JLabel getjL_Asiento3() {
        return jL_Asiento3;
    }

    public void setjL_Asiento3(JLabel jL_Asiento3) {
        this.jL_Asiento3 = jL_Asiento3;
    }

    public JLabel getjL_Asiento4() {
        return jL_Asiento4;
    }

    public void setjL_Asiento4(JLabel jL_Asiento4) {
        this.jL_Asiento4 = jL_Asiento4;
    }

    public JLabel getjL_Asiento5() {
        return jL_Asiento5;
    }

    public void setjL_Asiento5(JLabel jL_Asiento5) {
        this.jL_Asiento5 = jL_Asiento5;
    }

    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    //renice
    @Override
    public void run(){
        int contador =1;
        while (vive){
            if (avanzar) {
                try {
                    Thread.sleep(2500);
                } catch (Exception e) {
                }
                if (contador==1) {
                    jL_Asiento1.setIcon( new ImageIcon("ocupado.png") );
                }
                
                if (contador==2) {
                    jL_Asiento2.setIcon( new ImageIcon("ocupado.png") );
                }
                
                if (contador==3) {
                    jL_Asiento3.setIcon( new ImageIcon("ocupado.png") );
                }
                if (contador==4) {
                    jL_Asiento4.setIcon( new ImageIcon("ocupado.png") );
                }
                if (contador==5) {
                    jL_Asiento5.setIcon( new ImageIcon("ocupado.png") );
                }
                
                
                if (contador==6) {
                    JOptionPane.showMessageDialog(jL_Asiento5,"El avion esta lleno");
                    vive=false;
                    
                }
                
                
            }
            contador++;
        }
        
}
    
    
}
