/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luigy
 */
public class Lista {
    private Nodo head;

    public Lista() {
        head=null;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public void Insert(int valor){
        Nodo nuevo=new Nodo(valor,null);
        if (head==null) {
            head=nuevo;
        }else{
            Nodo tem=head;
            while(tem.getNext()!=null){
                tem=tem.getNext();
            }
            tem.setNext(nuevo);
        }
    }
}
