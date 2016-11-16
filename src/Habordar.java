
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
public class Habordar extends Thread{
    private JProgressBar abordando;
    private Cola emigrantes;
    private Cola deportados;
    private JLabel size;
    private JLabel AAngar;
    private Cola angar;
    private Avion enVuelo;
    private HDespegue hiloDespegue;
    private JProgressBar pb_AV;
    private JLabel lb_destino;

    public Habordar(JProgressBar abordando, Cola emigrantes, Cola deportados, JLabel size, JLabel AAngar, Cola angar, Avion enVuelo, JProgressBar pb_AV, JLabel lb_destino) {
        this.abordando = abordando;
        this.emigrantes = emigrantes;
        this.deportados = deportados;
        this.size = size;
        this.AAngar = AAngar;
        this.angar = angar;
        this.enVuelo = enVuelo;
        this.pb_AV = pb_AV;
        this.lb_destino = lb_destino;
    }

    public void run() {
        int con = 0;
        while (((Avion) angar.getHead().getValor()).isDisponible() && emigrantes.size() > 0) {
            size.setText(emigrantes.size() + "");
            AAngar.setText(((Avion) angar.getHead().getValor()).getNombre());
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            ((persona)emigrantes.getHead().getValor()).setDeportado(true);
            //principal p=new principal();
            persona abordado=(persona)emigrantes.Dequeue();
           // p.escribirDeportados(abordado);
            //p.escribirEmigrantes(emigrantes);
            ((Avion) angar.getHead().getValor()).getPasajeros().Apilar(abordado);
            abordando.setValue(abordando.getValue() + 1);
            con++;
            if (con == 5) {
                ((Avion) angar.getHead().getValor()).setDisponible(false);
                enVuelo = (Avion) angar.Dequeue();
                abordando.setValue(0);
                con = 0;
                hiloDespegue = new HDespegue(this.pb_AV, deportados, this.lb_destino, angar, enVuelo);
                hiloDespegue.start();
            }
        }
    }
}
