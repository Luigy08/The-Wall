
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luigy
 */
public class HDespegue extends Thread{
     private JProgressBar Avuelo;
     private Cola deportados;
     private JLabel destino;
     private Cola angar;
     private Avion enVuelo;

    public HDespegue(JProgressBar Avuelo, Cola deportados, JLabel destino, Cola angar, Avion enVuelo) {
        this.Avuelo = Avuelo;
        this.deportados = deportados;
        this.destino = destino;
        this.angar = angar;
        this.enVuelo = enVuelo;
    }
     
    
    public void run(){
        try {
            while(!enVuelo.isDisponible()&&!enVuelo.getPasajeros().IsEmpty()){
            
            try {
                Thread.sleep((((int)Math.random()*5+10)*1000)/5);
            } catch (Exception e) {
            }
            destino.setText(((persona)enVuelo.getPasajeros().getHead().getValor()).getPaisOrigen());
            Avuelo.setValue(Avuelo.getValue()+1);
            deportados.queue((persona)enVuelo.getPasajeros().Desapilar());
            if (enVuelo.getPasajeros().IsEmpty()) {
                enVuelo.setDisponible(true);
                angar.queue(enVuelo);
                destino.setText("");
                Avuelo.setValue(0);
            }
            
        }
        } catch (Exception e) {
        }
        
    }
    
}