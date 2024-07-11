public class RemoveDuplicate {

    public static Node sol(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node first = head;
        Node sec = first.next;

        while (sec != null) {
            if (first.data == sec.data) {
                first.next = sec.next;
                sec = first.next;
            } else {
                first = first.next;
                sec = sec.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(1);
        Node b = new Node(2);

        head.next = a;
        a.next = b;

        Node ans = sol(head);

        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }

    }
}
