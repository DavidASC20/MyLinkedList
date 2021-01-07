public class Node{
public Node(String value){
    data = value;
}
private String data;
private Node next,prev;
//write get/set methods for all three instance variables.
    public String getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public Node getPrev(){
        return prev;
    }

    public void setData(String s){
        data = s;
    }

    public void setNext(Node a){
        next = a;
    }

    public void setPrev(Node b){
        prev = b;
    }
}