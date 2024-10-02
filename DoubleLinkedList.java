import java.util.Iterator;

public class doubleLinkedList implements Iterable<Integer> {
    /**
     * Node
     */
    public static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head; // head sentinel
    private Node tail; // tail sentinel

    public doubleLinkedList(){
        head = new Node(null, 666, null);
        tail = new Node(null, 999, null);
        head.next = tail;
        tail.prev = head;
    }

    private Node findNode(int index){
        int i = -1;
        for(Node p = head; p != tail; p=p.next, i++){
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void insert(int index, int value){
        Node prev = findNode(index-1);
        if (prev == null) {
            return;
        }
        Node next = prev.next;
        Node newNode = new Node(prev, value, next);
        prev.next = newNode;
        next.prev = newNode;
    }

    public void removedIndex(int index){
        Node prev = findNode(index-1);
        Node removed = prev.next;
        Node next = removed.next;

        if (prev == null || removed == null) {
            return;
        }
        prev.next = next;
        next.prev = prev;
    }

    public void addLast(int value){
        Node last = tail.prev;
        Node newNode = new Node(last, value, tail);
        last.next = newNode;
        tail.prev = newNode;
    }

    public void removedLast(){
        Node removed = tail.prev;
        Node previous = removed.prev;
        
        if (removed == null) {
            return;
        }

        previous.next = tail;
        tail.prev = previous;
    }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            Node p = head.next;
            public boolean hasNaxt(){
                return p != tail;
            }

            public Integer next(){
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    public static void main(String[] args) {
        doubleLinkedList list = new doubleLinkedList();
        list.addLast(3);
        
    }
}
