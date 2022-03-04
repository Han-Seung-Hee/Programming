class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T input){
        this.data = input;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}

public class DoublyLinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void unshift(T ele){
        Node<T> newNode = new Node<>(ele);

        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size ++;
        if(head.next ==null){
            tail = head;
        }
    }

    // 앞을 지운다.
    public T shift() {

        T rtnVal = head.data;
        
        head = head.next;
        size--;

        return rtnVal;
    }

    public void push(T ele){
        Node<T> newNode = new Node<>(ele);

        newNode.prev = tail;

        if(tail != null){
            tail.next = newNode;
        }

        tail = newNode;
        size++;
        if(tail.prev == null){
            head = tail;
        }


    }

    public T pop(){
        T rtnVal = tail.data;

        tail = tail.prev;
        size--;

        return rtnVal;
    }
}