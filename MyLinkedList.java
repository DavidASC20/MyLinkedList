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
        }size++;
        return true;
    }
    public boolean add(int index, String value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node x = new Node(value);
        if(index == 0){
            start.setPrev(x);
            x.setNext(start);
            start = x;
            size++;
        }else if(index == size){
            add(value);
        }else{
            Node lol = getIndex(index);
            Node lol2 = lol.getPrev();
            lol2.setNext(x);
            x.setPrev(lol2);
            lol.setPrev(x);
            x.setNext(lol);
            size++;
        }return true;
    }
    public String get(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node x = getIndex(index);
        String lol = x.getData();
        return lol;
    }
    public String set(int index, String value){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node x = getIndex(index);
        x.setData(value);
        return value;
    }
    // public String toString();
    private Node getIndex(int index){
        Node x = start;
        for(int i = 0; i < index; i++){
            x = x.getNext();
        }
        return x;
    }
}