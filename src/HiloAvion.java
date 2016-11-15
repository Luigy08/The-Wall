/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author wilmer
 */
public class HiloAvion extends Thread {

    private JProgressBar barra1;
    private JProgressBar barra2;
    private JProgressBar barra3;
    private JProgressBar barra4;
    private JProgressBar barra5;
    private JProgressBar barra6;
    private JProgressBar barra7;
    private JProgressBar barra8;
    private JProgressBar barra9;
    private JProgressBar barra10;
    private boolean avanzar;
    private boolean vive;

    public void cargar() {

    }

    public HiloAvion() {
    }

    public HiloAvion(JProgressBar barra1, JProgressBar barra2, JProgressBar barra3, JProgressBar barra4, JProgressBar barra5, JProgressBar barra6, JProgressBar barra7, JProgressBar barra8, JProgressBar barra9, JProgressBar barra10) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
        this.barra4 = barra4;
        this.barra5 = barra5;
        this.barra6 = barra6;
        this.barra7 = barra7;
        this.barra8 = barra8;
        this.barra9 = barra9;
        this.barra10 = barra10;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public JProgressBar getBarra3() {
        return barra3;
    }

    public void setBarra3(JProgressBar barra3) {
        this.barra3 = barra3;
    }

    public JProgressBar getBarra4() {
        return barra4;
    }

    public void setBarra4(JProgressBar barra4) {
        this.barra4 = barra4;
    }

    public JProgressBar getBarra5() {
        return barra5;
    }

    public void setBarra5(JProgressBar barra5) {
        this.barra5 = barra5;
    }

    public JProgressBar getBarra6() {
        return barra6;
    }

    public void setBarra6(JProgressBar barra6) {
        this.barra6 = barra6;
    }

    public JProgressBar getBarra7() {
        return barra7;
    }

    public void setBarra7(JProgressBar barra7) {
        this.barra7 = barra7;
    }

    public JProgressBar getBarra8() {
        return barra8;
    }

    public void setBarra8(JProgressBar barra8) {
        this.barra8 = barra8;
    }

    public JProgressBar getBarra9() {
        return barra9;
    }

    public void setBarra9(JProgressBar barra9) {
        this.barra9 = barra9;
    }

    public JProgressBar getBarra10() {
        return barra10;
    }

    public void setBarra10(JProgressBar barra10) {
        this.barra10 = barra10;
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
    public void run() {
        int controlDePersonas = 0;
        Pila lista_deportados = new Pila();
        File archivo = null;
        try {
            archivo = new File("./personasDep.lu");
            //Leer lo que ya tiene el archivo y ponerlo en arrayList
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);

            persona cargando = new persona();
            try {
                while ((cargando = (persona) objeto.readObject()) != null) {
                    System.out.println("Hilo");
                    System.out.println(cargando);

                    lista_deportados.Apilar(cargando);

                }
            } catch (EOFException e) {
                objeto.close();
                entrada.close();
            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        Nodo tem = lista_deportados.getHead();
        int contador = 1;
        Pila aviones = new Pila();
        while (vive) {
            if (avanzar) {
                //   while (tem != null) {
                if (contador == 1) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra1.setValue(barra1.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }
                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 2) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra2.setValue(barra2.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 3) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra3.setValue(barra3.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 4) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra4.setValue(barra4.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }
                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 5) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra5.setValue(barra5.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }
                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 6) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra6.setValue(barra6.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 7) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra7.setValue(barra7.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 8) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra8.setValue(barra8.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 9) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra9.setValue(barra9.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

                if (contador == 10) {
                    int numeroAleatorio = (int) (Math.random() * 5 + 1);

                    Pila lista = new Pila();

                    for (int i = 0; i < 5; i++) {

                        if (tem != null) {

                            lista.Apilar(tem.getValor());
                            tem = tem.getNext();
                            controlDePersonas++;

                            try {
                                Thread.sleep(1000 * numeroAleatorio);
                            } catch (Exception e) {
                            }
                            barra10.setValue(barra10.getValue() + 1);
                        }
                        if (tem == null) {
                            vive = false;

                        }
                        if(i==4){
                        JOptionPane.showMessageDialog(barra1, "Se lleno el Avion");
                        }

                    }//fin for
                    Avion atemp = new Avion(lista, true);
                    aviones.Apilar(atemp);

                }//fin del if

            }
            contador++;
        }//fin del while

        for (int i = 0; i < controlDePersonas; i++) {
            lista_deportados.Desapilar();
        }
        archivo = new File("./personasDep.lu");
        archivo.delete();

        tem = lista_deportados.getHead();

        while (tem != null) {

            persona p = new persona(((persona) tem.getValor()).getNombre(), ((persona) tem.getValor()).getNacionalidad(), ((persona) tem.getValor()).getFNacimiento(), ((persona) tem.getValor()).getRaza(), ((persona) tem.getValor()).getPaisOrigen(), ((persona) tem.getValor()).isDeportado());

            archivo = new File("./personasDep.lu");
            try {
                if (!archivo.exists()) {
                    FileOutputStream salida = new FileOutputStream(archivo);
                    ObjectOutputStream objeto = new ObjectOutputStream(salida);
                    objeto.writeObject(p);
                    objeto.flush();
                    objeto.close();
                    salida.close();
                } else {
                    FileInputStream entrada = new FileInputStream(archivo);
                    ObjectInputStream objeto = new ObjectInputStream(entrada);
                    persona temp1;
                    Cola lista = new Cola();
                    try {

                        while ((temp1 = (persona) objeto.readObject()) != null) {
                            lista.queue(temp1);

                        }
                    } catch (EOFException e) {
                    }
                    objeto.close();
                    entrada.close();

                    lista.queue(p);
                    FileOutputStream salida = new FileOutputStream(archivo);
                    ObjectOutputStream objeto2 = new ObjectOutputStream(salida);
                    while (!lista.isEmpty()) {
                        objeto2.writeObject((persona) lista.Dequeue());
                    }
                    objeto2.flush();
                    objeto2.close();
                    salida.close();
                }
            } catch (Exception e) {
            }
            if (tem != null) {
                tem.getNext();
            }

        }

        Hangar p = new Hangar(aviones,true);
        archivo = new File("./Aviones_saliendo_del_Hangar.lu");
        try {
                FileOutputStream salida = new FileOutputStream(archivo);
                ObjectOutputStream objeto = new ObjectOutputStream(salida);
                objeto.writeObject(p);
                objeto.flush();
                objeto.close();
                salida.close();
            
        } catch (Exception e) {
        }

    }

}
