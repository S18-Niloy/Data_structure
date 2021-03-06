package com.company;

                                           ///Name-Soumik Deb Niloy///
                                           ///CSE 220 Section-04///
                                                ///Lab 03///
                                 ///==================================///


public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        DoublyList D1 = new DoublyList(arr1);
        for (Node i = D1.headnext; i!= D1.head; i=i.next) {
            System.out.print(i.value+"->");
        }
        System.out.println("\n");
        for (Node i = D1.tail; i!= D1.head; i=i.prev) {
            System.out.print(i.value+"->");
        }
        System.out.println("\n");

        System.out.println("///////////Showlist///////////");
        D1.ShowList();

        System.out.println("///////////Insert///////////");
        int[] arr2={1,2,3};
        DoublyList D2 = new DoublyList(arr2);
        D2.insert(new Node(4,null,null));

        System.out.println("///////////InsertIndex///////////");
        int[] arr3={1,2,3};
        DoublyList D3 = new DoublyList(arr3);
        D3.insert(4,2);
        for (Node i = D3.headnext; i!= D3.head; i=i.next) {
            System.out.println(i.value);
        }

        System.out.println("///////////Remove///////////");
        int[] arr4={1,2,3,4,5,6,7};
        DoublyList D4 = new DoublyList(arr4);
        D4.remove(3);
        for (Node i = D4.headnext; i!= D4.head; i=i.next) {
            System.out.println(i.value);
        }

        System.out.println("///////////RemoveKey///////////");
        int[] arr5={1,2,3,4,5,6,7};
        DoublyList D5 = new DoublyList(arr5);
        D5.removeKey(3);

    }
}

//////////////////// Task01 ////////////////////

class Node {
    int value;
    Node next;
    Node prev;

    public Node(int v, Node n, Node p) {
        value = v;
        next = n;
        prev = p;
    }
}

class DoublyList{
    Node head = new Node(0,null,null);
    Node headnext = null;
    Node tail = null;
    public DoublyList(int[]a){
        for(int i = 0;i<a.length;i++){
            Node temp = new Node(a[i],null,null);
            if(headnext==null){
                headnext=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
            headnext.prev=head;
            head.prev=tail;
            tail.next=head;
            head.next=headnext;
        }

    }
    ///////////////////////////////Showlist///////////////////////////////
    void ShowList() {
        int count = 0;
        for (Node n = head.next; n != head; n = n.next) {
            count++;
            System.out.println(n.value);

        }
        if (count == 0) {
            System.out.println("Empty list");
        }
    }

    ///////////////////////////////Insert///////////////////////////////
    void insert(Node newElement) {
        for(Node n=head.next;n!=head;n=n.next){
            tail.next=newElement;
            newElement.prev=tail;
            newElement.next=head;
            head.prev=newElement;
            System.out.println(n.value);
        }

    }

    ///////////////////////////////InsertIndex///////////////////////////////
    void insert(int newElement,int index){
        Node newNode=new Node(newElement,null,null);
        Node temp = head;
        int step = 1;
        while (step<index){
            temp=temp.next;
            step++;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next = newNode;
        newNode.prev=temp;
    }

    ///////////////////////////////Remove///////////////////////////////
    void remove(int index){
        Node temp = head;
        int step = 0;

        while (step<index){
            temp=temp.next;
            step++;
        }
        Node rest = temp.next;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        rest = null; /// removing the node from memory

    }

    ///////////////////////////////RemoveKey///////////////////////////////
    void removeKey(int Deletekey){
        Node temp = head;
        int step = 1;

        while (step<Deletekey){
            temp=temp.next;
            step++;
        }
        Node rest = temp.next;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        rest = null; /// removing the node from memory
        System.out.println(temp.next.value);
    }
}
