import java.util.ArrayList;

public class SortList {
    public static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static Node sol(Node head) {
        Node temp = head;

        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;
        int[] arr = new int[length];
        int pos = 0;
        while (temp != null) {
            arr[pos] = temp.data;
            pos++;
            temp = temp.next;
        }

        mergeSort(arr, 0, arr.length - 1);

        temp = head;

        int count = 0;
        while (temp != null) {
            temp.data = arr[count];
            count++;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);

        head.next = a;
        a.next = b;
        b.next = c;

        Node ans = sol(head);
        while (ans != null) {
            System.out.print(ans.data + " --> ");
            ans = ans.next;
        }
        System.out.println("NULL");

    }
}
