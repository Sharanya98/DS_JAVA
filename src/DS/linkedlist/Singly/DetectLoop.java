package DS.linkedlist.Singly;

public class DetectLoop {
    static Node head;
    static int count =0;

    public static void main(String[] args) {

        DetectLoop dl = new DetectLoop();
        dl.push(1);
        dl.push(2);
        dl.push(3);
        dl.push(4);
        dl.push(5);

        head.next.next.next.next.next = head.next.next;
        boolean res = dl.detect(head);
        boolean res2 = dl.floydDetectLoop(head);
        if (res2) {
            System.out.println("loop found");
            System.out.println("count"+count);
        } else {
            System.out.println("loop not found");
        }

        //dl.printlinkedlist();
    }

    //traversal -TC(worst)-search-O(n),Insertion-O(1),Deletion-O(1)
    public void printlinkedlist() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " " + "->");
            System.out.println(n.flag + " " + "->");
            n = n.next;
        }
    }


    //insertion@first -TC(worst)-Insertion-O(1),
    // Auxiliary space-O(1)
    public void push(int new_node) {

        Node newNode = new Node(new_node);
        newNode.data = new_node;
        newNode.flag = 0;
        newNode.next = head;
        head = newNode;
    }

    //Time complexity: O(N), Only one traversal of the loop is needed.
    //Auxiliary Space: O(1)
    public boolean detect(Node head) {

//        Node temp = head;
        while (head != null) {

            if (head.flag == 1) {
                return true;
            }
            head.flag = 1;
            head = head.next;

//            System.out.println("temp: "+temp.data+"flag: "+flag);
        }

        return false;


    }

    //Traverse linked list using two pointers.
    //Move one pointer(slow_p) by one and another pointer(fast_p) by two.
    //If these pointers meet at the same node then there is a loop. If pointers do not meet then the linked list doesn’t have a loop.
    //Time complexity: O(N), Only one traversal of the loop is needed.
    //Auxiliary Space: O(1).
    public boolean floydDetectLoop(Node h) {
        Node slow = h;
        Node fast = h;


        while (slow != null && fast != null && fast.next != null) {

            count++;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                return true;
            }
        }
        return false;
    }

    public static class Node {
        int data;
        Node next;
        int flag;


        //constructor to crate new node
        Node(int d) {
            this.data = d;
            this.flag = 0;
            next = null;
        }

    }

}
