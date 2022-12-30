package DS.linkedlist.Singly;

import DS.linkedlist.Singly.SinglyLinkedList;

public class SLmain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new SinglyLinkedList.Node(1);
        SinglyLinkedList.Node second = new SinglyLinkedList.Node(2);
        SinglyLinkedList.Node third = new SinglyLinkedList.Node(3);

        list.head.next = second;
        second.next = third;
        list.push(4);
        list.insertAfter(second,6);
        list.insertEnd(7);
        list.insertAtKey(2,5);
        //list.deletefirst();
        //list.deleteLast();
        //list.deletePosition(5);
        list.countNode();

        list.printlinkedlist();


    }
}
