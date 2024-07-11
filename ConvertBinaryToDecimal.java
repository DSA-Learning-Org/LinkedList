import java.util.Stack;

public class ConvertBinaryToDecimal {
    public static int solution1(Node head) {
        Node temp = head;
        Node temp2 = head;

        int total = -1;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            total++;
            temp = temp.next;
        }

        System.out.print("NULL");
        System.out.println();
        System.out.println("Total elements are :- " + total);

        int op = 0;
        int lastElement = 0;
        while (temp2.next != null) {
            switch (temp2.data) {
                case 1:
                    op = op + (int) Math.pow(2, total);
                    total--;
                    temp2 = temp2.next;
                    break;
                case 0:
                    total--;
                    temp2 = temp2.next;
                    break;
            }
        }
        if (temp2.next == null) {
            lastElement = (temp2.data == 1) ? 1 : 0;
        }

        return op + lastElement;
    }

    public static int solution2(Node head) {

        Stack<Integer> st = new Stack<>();

        Node temp = head;

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st);
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(0);
        Node e = new Node(1);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Your answer is :- " + solution2(head));
    }
}