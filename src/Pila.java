
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luigy
 */
public class Pila {
    private Nodo head;

    public Pila(Nodo head) {
        this.head = head;
    }

    public Pila() {
        head=null;
    }
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    void Apilar(Object entrada) {
        if (head == null) {
            head = new Nodo(entrada, null);
        } else {
            head = new Nodo(entrada, head);
        }
    }

    Object Desapilar() {
       Nodo salida=head;
       head=head.getNext();
       return salida.getValor();
    }
    int getSize(){
        int salida=1;
        Nodo tem=head;
        while(tem!=null){
            salida++;
        }
        return salida;
    }
    boolean IsEmpty(){
        if (head==null) {
            return true;
        }else{
            return false;
        }
    }
    void listar() {
        Nodo tem = head;
        while (tem != null) {
            System.out.print("[" + tem.getValor() + "]");
            tem = tem.getNext();
        }
        System.out.println();
    }
    
}
