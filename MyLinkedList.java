public class MyLinkedList{
    private int size;
    private Node start,end;  
    public MyLinkedList(){
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(String value){
        Node x = new Node(value);
        if(size == 0){
            start = x;
            end = x;
        }else{
            end.setNext(x);
            x.setPrev(end);
            end = x;
        }
    }
    public boolean add(int index, String value){
        Node x = new Node(value);
        if(index == 0){
            start.setPrev(x);
            x.setNext(start);
            start = x;
        }else if(index ==)
    }
    // public String get(int index);
    // public String set(int index, String value);
    // public String toString();
    //Any helper method that returns a Node object MUST BE PRIVATE!
   }