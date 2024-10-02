public class CricleLinkedList {
    private static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node sentinel = new Node(null, -1, null);

    public CricleLinkedList(){
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(int value){
        Node a = sentinel;
        Node b = sentinel.next;
        Node newNode = new Node(a, value, b);
        a.next = newNode;
        b.prev = newNode;
    }

    public void addLast(int value){
        Node a = sentinel.prev;
        Node b = sentinel;
        Node newNode = new Node(a, value, b);

        a.next = newNode;
        b.prev = newNode;
    }

    public void deleteFirst(){
        Node deleted = sentinel.next;
        Node a = sentinel;
        Node b = deleted.next;

        if (deleted == sentinel) {
            return;
        }

        a.next = b;
        b.prev = a;
    }

    public void deleteLast(){
        Node deleted = sentinel.prev;
        Node a = sentinel;
        Node b = deleted.prev;
        
        if (deleted == sentinel) {
            return;
        }

        a.prev = b;
        b.next = a;
    }

    private Node findByValue(int value){
        Node p = sentinel.next;
        while (p!=sentinel) {
            if (p.value == value) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public void removedIndex(int value){
        Node removed = findByValue(value);

        if (removed == null) {
            return;
        }

        removed.prev.next = removed.next;
        removed.next.prev = removed.prev;
    }

}
