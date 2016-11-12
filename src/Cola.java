
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
public class Cola {
    Scanner sc=new Scanner(System.in);
    private Nodo head;
    private Nodo fondo;
  
    public Cola() {
        head=null;
        fondo=null;
    }

    public Cola(Nodo head, Nodo fondo) {
        this.head = head;
        this.fondo = fondo;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }
    void queue(Object entrada){
        Nodo nuevo=new Nodo(entrada,null);
        if (head==null&&fondo==null) {
            fondo=nuevo;
            head=fondo;
        }
        fondo.setNext(nuevo);
        fondo=fondo.getNext();
    }
    Object Dequeue(){
        Object salida=head.getValor();
        head=head.getNext();
        return salida;
    }
    boolean isEmpty(){
        if (head==null) {
            return true;
        }else{
            return false;
        }
    }
}
