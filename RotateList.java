public class RotateList {

    public static Node solution(Node head, int k) {
        System.out.println(k % 5);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        int k = 2;

        System.out.println(solution(head, k));
    }
}
