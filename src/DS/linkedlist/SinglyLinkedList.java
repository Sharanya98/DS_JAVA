package DS.linkedlist;

import java.util.LinkedList;

class SinglyLinkedList {

    //head node which is a starting node
    Node head;

    public static class Node{
        int data;
        Node next;


        //constructor to crate new node
        Node(int d){
            this.data = d;
            next = null;
        }
    }

   //traversal -TC(worst)-search-O(n),Insertion-O(1),Deletion-O(1)
    public void printlinkedlist(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " "+"->");
            n=n.next;
        }
    }


    //insertion@first -TC(worst)-Insertion-O(1),
    // Auxiliary space-O(1)
    public void push(int new_node){

        Node newNode = new Node(new_node);
        newNode.next =head;
        head = newNode;
    }

    //Time complexity: O(1), since prev_node is already given as argument in a method, no need to iterate over list to find prev_node
    //Auxiliary Space: O(1) since using constant space to modify pointers
    public void insertAfter(Node prevNode,int value){
        /* 1. Check if the given Node is null */
        if (prevNode == null) {
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void insertAtKey(int key,int value){
        Node newNode = new Node(value);

        Node n = head;
        while(n.data !=key){
            n = n.next;
            if(n.next == null){
                return;
            }
        }
        newNode.next = n.next;
        n.next=newNode;

    }

    //Time complexity: O(N), where N is the number of nodes in the linked list. Since there is a loop from head to end, the function does O(n) work.
    //This method can also be optimized to work in O(1) by keeping an extra pointer to the tail of the linked list/
    //Auxiliary Space: O(1)
    public void insertEnd(int value){

        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = newNode;

    }

    //Time complexity: O(1)
    //Space complexity: O(1)
    public void deletefirst(){
        Node temp1 = head;

        if(temp1!=null){
            head = temp1.next;
        }

    }


    //Time complexity: O(n)
    //Space complexity: O(1) using constant space
    public void deleteLast(){
        Node temp2 = head;
        Node prev = head;
        while(temp2.next!=null){
            prev=temp2;
            temp2=temp2.next;
        }
        prev.next = null;
    }

    //Best Case : O(1) if given position is 1
    //Average  & Worst Case : O(N)  if position given is size-1 then need to traverse till position not found.
    //Space Complexity : O(1) no extra any space is required
    public void deletePosition(int val){
        Node temp3 = head;
        Node prev3=head;
        while(temp3.next!=null){
            if( head.data==val){
                head=temp3.next;
            }
            prev3 = temp3;
            temp3 = temp3.next;

            if(temp3.data==val){
                //temp.next=null;
                prev3.next=temp3.next;
            }
        }
    }
}
