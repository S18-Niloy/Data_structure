package com.company;

                                           ///Name-Soumik Deb Niloy
                                           ///CSE 220 Section-04
                                           ///Lab 02///
                                 ///==================================///


public class Main {
    //////////////////////////////////// Task 01 ////////////////////////////////////
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};

        System.out.println("///////////Creating list from array/////////////");
        Mylist m1 = new Mylist(arr1);
        for (Node i = m1.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

        System.out.println("\n\n/////////// Showlist////////");
        m1.ShowList();

        System.out.println("\n/////////// isEmpty?////////");
        m1.isempty();

        System.out.println("\n/////////// Clear////////");
        m1.clear();


        System.out.println("\n/////////// Insert////////");
        int[] arr2 = {1,2,3,4};
        Mylist m2 = new Mylist(arr2);
        m2.insert(new Node(12,null));
        for (Node i = m2.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

        System.out.println("\n\n/////////// InsertIndex////////");
        int[] arr3 = {1,2,3,4};
        Mylist m3 = new Mylist(arr3);
        m3.insertindex(new Node(12,null),3);
        for (Node i = m3.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

        System.out.println("\n\n/////////// Remove////////");
        int[] arr4 = {1,2,3,4};
        Mylist m4 = new Mylist(arr4);
        m4.remove(2);
        for (Node i = m4.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }
        //////////////////////////////////// Task 03 ////////////////////////////////////
        System.out.println("\n\n/////////// Even Number////////");
        int[] arr5={1,2,5,3,8};
        Mylist m5 = new Mylist(arr5);
        m5.evennumbers();

        System.out.println("\n\n/////////// Element in the list////////");
        int[] arr6={101,102,25,91,87,1};
        Mylist m6=new Mylist(arr6);
        m6.availablity(87);

        System.out.println("\n\n/////////// Reverse////////");
        int[] arr7={1,2,5,3,8};
        Mylist m7=new Mylist(arr7);
        m7.reverselist();
        for (Node i = m7.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

        System.out.println("\n\n/////////// Sorting////////");
        int[] arr8={1,2,5,3,8};
        Mylist m8=new Mylist(arr8);
        m8.sorting();
        for (Node i = m8.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

        System.out.println("\n\n/////////// Addition////////");
        int[] arr9={1,2,3,5,8};
        Mylist m9=new Mylist(arr9);
        m8.addition();

        System.out.println("\n/////////// Rotation ////////");
        int[] arr10={3,2,5,1,8};
        Mylist m10=new Mylist(arr10);
        m9.rotation(2);
        for (Node i = m10.head; i!=null; i=i.next) {
            System.out.print(i.value+"->");
        }

    }
}
class Node {
    int value;
    Node next;

    public Node(int v, Node n) {
        value = v;
        next = n;
    }
}

class Mylist {
    Node head = null;
    //////////////////////////////////// Task 02 ////////////////////////////////////
    public Mylist(int[] a) {
        Node tail = null;
        if (a.length == 0) {
            System.out.println("Array cannot be empty");

        } else {
            for (int i = 0; i < a.length; i++) {
                boolean result = true;
                Node n = head;
                while (n != null) {
                    if (n.value == a[i]) {
                        result = false;
                        break;
                    }
                    n = n.next;
                }
                if (result == true) {
                    Node temp = new Node(a[i], null);
                    if (head == null) {
                        head = temp;
                        tail = temp;
                    } else {
                        tail.next = temp;
                        tail = temp;
                    }
                }


            }


        }

    }

    void ShowList() {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
            System.out.println(n.value);

        }
        if (count == 0) {
            System.out.println("Empty list");
        }
    }

    void isempty() {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;

        }
        boolean isempty;
        if (count == 0) {
            isempty = true;
        } else {
            isempty = false;
        }
        System.out.println(isempty);
    }

    void clear() {
        int count = 0;
        int count_2 = 0;
        for (Node n = head; n != null; n = n.next) {
            count_2++;
            if (head != null) {
                head = null;
                for (Node j = head; j != null; j = j.next) {
                    count++;
                }
            }

        }
        if (count_2 == 0) {
            System.out.println("List is empty");
        } else {
            if (count == 0) {
                System.out.println("Elements removed");
            }
        }

    }

    void insert(Node newelement) {
        int count = 0;
        Node result = null;
        for (Node n = head; n != null; n = n.next) {
            result = n;
            count++;
        }
        Node tail = result;
        int index = count;
        Node newNode = new Node(newelement.value, null);
        if (index == count) {
            tail.next = newNode;
            tail = newNode;
        }

    }
    void insertindex(Node newelement,int index){
        Node newnode=new Node(newelement.value,null);
        if(head!=null) {
            Node temp = head;
            int step =1;
            while (temp!=null && step<index){
                temp=temp.next;
                step++;
            }
            newnode.next=temp.next;
            temp.next=newnode;

        }
    }

    void remove(int deletekey){
        if(head==null){
            System.out.println("Empty list");
        }
        else {
            if(deletekey==head.value){
                head=head.next;
            }
        }
        Node pred=head;
        while (pred.next!=null){
            if(deletekey==pred.next.value){
                break;
            }
            pred=pred.next;
        }
        if(pred.next==null){
            System.out.println("Null");
        }
        else {
            pred.next=pred.next.next;
        }
    }
    //////////////////////////////////// Task 03 ////////////////////////////////////
    void evennumbers(){
        for(Node n =head;n!=null;n=n.next){
            if(n.value%2==0){
                System.out.println(n.value);
            }
        }

    }

    void availablity(int c){
        Node current = head;
        while (current!=null){
            if (current.value==c){
                System.out.println(true);
            }
            current=current.next;
        }
    }

    void reverselist(){
        Node prev=null;
        Node current = head;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    void sorting(){
        Node current = head;
        Node serial=null;
        int temp;
        while(current != null) {
            serial = current.next;
            while(serial != null) {
                if(current.value > serial.value) {
                    temp = current.value;
                    current.value = serial.value;
                    serial.value = temp;
                }
                serial = serial.next;
            }
            current = current.next;
        }

    }

    void addition(){
        int sum=0;
        for(Node n =head;n!=null;n=n.next){
            sum+=n.value;
        }
        System.out.println(sum);

    }
    void rotation(int k){
        int step  = 1;
        Node current = head;
        while (k>step){
            current=current.next;
            step++;
        }
        Node temp=current;
        while (current.next!=null){
            current=current.next;
        }
        current.next=head;
        head=temp.next;
        temp.next=null;
    }
}
