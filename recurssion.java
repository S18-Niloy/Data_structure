public class Main {
    public static void main(String[] args){
        System.out.println("////////////////// Number 01 //////////////////");

        recurssion r1 = new recurssion();
        System.out.println("----------(a) Finding factorial----------");
        System.out.println(r1.factorial(4));

        recurssion r2 = new recurssion();
        System.out.println("----------(b) Finding fibonacci number----------");
        System.out.println(r2.fibonacci(4));

        recurssion r3 = new recurssion();
        int[] arr_1 = {1,2,3,4,5};
        System.out.println("----------(c) Printing array elements----------");
        r3.printelements(arr_1,arr_1.length-1);

        recurssion r4 = new recurssion();
        System.out.println("----------(d) Printing power----------");
        System.out.println(r4.powerN(4,3));

        System.out.println("////////////////// Number 02 //////////////////");

        recurssion r5 = new recurssion();
        System.out.println("----------(a) Binary----------");
        System.out.println(r5.binary(8));

        int[] arr_2={1,2,3};
        list r6 = new list(arr_2);
        System.out.println("----------(b) Linked list addition----------");
        System.out.println(r6.addition(r6.head));

        int[] arr_3={10,20,30,40};
        list r7 = new list(arr_3);
        System.out.println("----------(b) Linked list elements reverse----------");
        r7.printNodevalues(r7.head);

        recurssion r8 = new recurssion();
        System.out.println("----------Number 03----------");
        System.out.println(r8.hocBuilder(2));

        recurssion r9 = new recurssion();
        System.out.println("----------Number 04(a)----------");
        r9.pattern_0(3);

        recurssion r10 = new recurssion();
        System.out.println("----------Number 04(b)----------");
        r10.pattern(3);

        recurssion r11 = new recurssion();
        int[] arr_4={25000,100000,250000,350000};
        System.out.println("----------Number 05----------");
        r11.result(arr_4,0);


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

class list {
    Node head = null;

    //////////////////////////////////// Task 02(b&c) ////////////////////////////////////
    public list(int[] a) {
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
    int addition(Node n){
        if (n.next==null) return n.value;
        else return n.value+addition(n.next);
    }
    void printNodevalues(Node n){
        if (n.next==null) {
            System.out.println(n.value);
        }
        else{
            printNodevalues(n.next);
            System.out.println(n.value);
        }
    }

}
class recurssion {
    //////////////////////////////////////////Task 01///////////////////////////////////
    int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * (factorial(n - 1));
    }

    int fibonacci(int count) {
        if (count == 1) return 0;
        if (count == 2) return 1;
        else return fibonacci(count - 1) + fibonacci(count - 2);
    }

    void printelements(int[] arr, int size) {

        if (size !=-1) {
            printelements(arr, size - 1);
            System.out.println(arr[size]);
        }
    }

    int powerN(int base, int power){
        if (power==0) return 1;
        if (power==1) return base;
        else return base*powerN(base,power-1);
    }
    //////////////////////////////////////////////Task 02 (a) ////////////////////////////////
    int binary(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        else return n%2+10*(binary(n/2));
    }

    ///////////////////////////////Task 03//////////////////////////////////////
    public int hocBuilder(int height){
        if (height==0) return 0;
        if (height==1) return 8;
        else return 5+hocBuilder(height-1);
    }
    ////////////////////////////////Task 04///////////////////////////////////
    void position(int n){
        if (n>0){
            position(n-1);
            System.out.print(n+" ");
        }
    }
    static int position_2(int d, int num)
    {
        if (num == 0)
            return d;
        System.out.print(d+" ");
        return position_2(d -1, num -1);
    }
    void pattern_0(int n){

        if (n>1){
            pattern_0(n-1);
        }
        position(n);
        System.out.println();
    }
    void pattern(int n){

        if (n>1){
            pattern(n-1);


        }
        position_2(n,n);
        System.out.println();
    }
   
    float calcprofit(int investment){
        float profit = 0;
        if (investment<=25000){
            return 0;
        }
        if (investment>100000){
            profit=profit+(investment-100000)*0.08f;
            profit=profit+(75000*0.045f);
        }
        else{
            profit=profit+(investment-25000)*0.045f;

        }
        return profit;
    }
    void result(int[]s,int index){
        if(index<s.length){
            float profit = calcprofit(s[index]);
            index+=1;
            System.out.println("Investment: "+s[index-1]+" Profit:"+profit);
            result(s,index);
        }
    }

}

