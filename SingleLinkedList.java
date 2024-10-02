public class SingleLinkedList {
    private static class Node {
        int value;
        Node next;
        
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    Node head;

    public void addFirst(int value){
        head = new Node(value, head);
    }

    public void addLast(int value){
       Node last = findLast();
       if (last == null) {
            addFirst(value);
            return;
       }
       last.next = new Node(value, null);
    }

    private Node findLast(){
        if (head==null) {
            return null;
        }

        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    public void loop(){
        Node p = head;
        while (p != null) {
            System.out.println(p.value);
            p = p.next;
        }
    }

    public Node findNode(int index){
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void insert(int index, int value){
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node previous = findNode(index-1);
        Node newNode = new Node(value, previous.next);
        previous.next = newNode;
    }

    public void deleteFirst(){
        if (head == null) {
            return;     
        }
        head = head.next;
    }

    public void deleteIndex(int index){
        if (index==0) {
            deleteFirst();
        }
        
        Node prev = findNode(index-1);
        Node removed = prev.next;
        if (prev == null || removed==null) {
            return;
        }
        prev.next = removed.next;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(3);
        list.addFirst(4);
        
        list.loop();
        Node a = list.findLast();
        System.out.println(a.value);

        list.addLast(10);
        Node b = list.findLast();
        System.out.println(b.value);

        list.loop();
        Node c = list.findNode(2);
        System.out.println(c.value);

        list.deleteFirst();
        list.loop();

    }
}

