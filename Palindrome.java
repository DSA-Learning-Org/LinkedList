import java.util.ArrayList;

public class Palindrome {
    public static boolean sol(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        int high = arr.size() - 1;

        for (int i = 0; i <= high; i++) {
            if (arr.get(i) != arr.get(high)) {
                return false;
            } else {
                high--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(1);

        head.next = a;
        a.next = b;
        b.next = c;

        System.out.println(sol(head));

    }
}
