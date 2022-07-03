/// Name : Soumik Deb Niloy
/// Sec : 04
/// ID : 20301207
/// LAB Assignment- 04


////////////////////////////////////////////////////////////// Task 01: Stack Using Array //////////////////////////////////////////////////////////////

public class Main {
    public static String paranthesesBalance(String s_1){
        Arraystack a_1=new Arraystack();

        for(int i=0;i<s_1.length();i++){
            char c = s_1.charAt(i);
            if (c=='[' || c=='{' || c=='('){
                a_1.push(c);
            }else if ((c==']' || c=='}' || c==')') && a_1.size!=0) {
                    if (((char) a_1.peek()=='(' && c==')') || ((char) a_1.peek()=='{' && c=='}') || ((char) a_1.peek()=='[' && c==']')){
                        a_1.pop();
                    }else {
                        return "This expression is NOT correct"+'\n'+"Error at charatcer #"+(s_1.indexOf((char)a_1.peek())+1)+". "+a_1.peek()+" not closed.";
                    }
            }else{
                if (c==']' || c=='}' || c==')' && a_1.peek()==null){
                    return "Error at character #"+(s_1.indexOf(c)+1)+". "+c+" not opened";
                }
            }

        }
        if (a_1.size==0){
            return "This expression is correct.";
        }else {
            return "This expression is NOT correct.";
        }

    }
    public static void main(String[] args){
        System.out.println("////////// OUTPUT 01 //////////");
        String s_1="1+2*(3/4)";
        System.out.println(paranthesesBalance(s_1));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 02 //////////");
        String s_2="1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        System.out.println(paranthesesBalance(s_2));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 03 //////////");
        String s_3="1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14";
        System.out.println(paranthesesBalance(s_3));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 04 //////////");
        String s_4="1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        System.out.println(paranthesesBalance(s_4));
    }
}
 class Arraystack{
    Object [] a;
    int size;
    public Arraystack(){
        a = new Object[100];
        size =0;
    }
    public void push(Object e){
        if(size==a.length){
            return;
        }
        a[size]=e;
        size++;
    }
    public Object peek(){
        if (size==0){
            return null;
        }
        Object val = a[size-1];
        return val;
    }
    public Object pop(){
        if(size!=0){
            Object val = a[size-1];
            a[size-1]=null;
            size--;
            return val;
        }else {
            return null;
        }
    }
}



////////////////////////////////////////////////////////////// Task 02: Stack Using Linked List //////////////////////////////////////////////////////////////


public class Main {
    public static String paranthesesBalance(String s_1){
        Liststack a_1=new Liststack();

        for(int i=0;i<s_1.length();i++){
            char c = s_1.charAt(i);
            if (c=='[' || c=='{' || c=='('){
                a_1.push(c);
            }else if ((c==']' || c=='}' || c==')') && a_1.head!=null) {
                    if (((char) a_1.peek()=='(' && c==')') || ((char) a_1.peek()=='{' && c=='}') || ((char) a_1.peek()=='[' && c==']')){
                        a_1.pop();
                    }else {
                        return "This expression is NOT correct"+'\n'+"Error at charatcer #"+(s_1.indexOf((char)a_1.peek())+1)+". "+a_1.peek()+" not closed.";
                    }
            }else{
                if (c==']' || c=='}' || c==')' && a_1.peek()==null){
                    return "Error at character #"+(s_1.indexOf(c)+1)+". "+c+" not opened";
                }
            }

        }
        if (a_1.head==null){
            return "This expression is correct.";
        }else {
            return "This expression is NOT correct.";
        }

    }
    public static void main(String[] args){
        System.out.println("////////// OUTPUT 01 //////////");
        String s_1="1+2*(3/4)";
        System.out.println(paranthesesBalance(s_1));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 02 //////////");
        String s_2="1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        System.out.println(paranthesesBalance(s_2));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 03 //////////");
        String s_3="1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14";
        System.out.println(paranthesesBalance(s_3));
        System.out.println("\n");

        System.out.println("////////// OUTPUT 04 //////////");
        String s_4="1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        System.out.println(paranthesesBalance(s_4));
    }
}
class Node{
    Object element;
    Node next;
    public Node (Object e, Node n){
        element = e;
        next = n;
    }
}

class Liststack{
    Node head;
    public void push(Object e){
        Node n=new Node(e,head);
        head = n;
    }
    public Object peek(){
        if (head!=null){
            return head.element;
        }else{
            return null;
        }
    }
    public Object pop(){
        if(head!=null){
            Node remove = head;
            head = head.next;
            remove.next = null;
            return remove.element;
        }else {
            return null;
        }
    }
}






























