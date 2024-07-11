
import java.util.HashMap;
import java.util.Map;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = null;
    }

    Node() {
    }
}

public class FrequencyCheck {

    static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static Node solution(Node head) {

        Map<Integer, Integer> hmap = new HashMap<>();

        for (; head != null; head = head.next) {
            hmap.merge(head.data, 1, Integer::sum);
        }

        Node dummy = new Node();

        for (int val : hmap.values()) {
            dummy.next = new Node(val, dummy.next);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(3);
        Node a = new Node(2);
        Node d = new Node(3);
        Node c = new Node(1);
        Node e = new Node(3);
        Node f = new Node(3);
        Node g = new Node(0);
        Node h = new Node(8);
        Node i = new Node(0);
        Node j = new Node(4);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        traverse(head);
        solution(head);
    }
}
