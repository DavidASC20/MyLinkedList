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
        }else if(index == size - 1){
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
        String lol = x.getData();
        x.setData(value);
        return lol;
    }
    public String toString(){
        String temp = "";
        Node x = start;
        for(int i = 0; i < size; i++){
            temp += x.getData();
            x = x.getNext();
        }
        return temp;
    }
    public String remove(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node x = getIndex(index);
        if(size == 1){
            start = null;
            end = null;
        }
        else if(index == 0){
            start = x.getNext();
            start.setPrev(null);
        }else if(index == size - 1){
            end = x.getPrev();
            end.setNext(null);
        }else{
            Node a = x.getPrev();
            Node b = x.getNext();
            a.setNext(b);
            b.setPrev(a);
        }size--;
        return x.getData();
    }
    public void extend(MyLinkedList other){

    }
    private Node getIndex(int index){
        Node x = start;
        for(int i = 0; i < index; i++){
            x = x.getNext();
        }
        return x;
    }
    
}