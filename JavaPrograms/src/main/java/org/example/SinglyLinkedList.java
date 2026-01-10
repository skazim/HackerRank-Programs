package org.example;

class SinglyLinkedListNode{
    public int data;

    public SinglyLinkedListNode next;
    public SinglyLinkedListNode(int nodeData){
        this.data = nodeData;
        this.next = null;
    }
}
class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
    }
}
class RemoveConsecutiveDuplicates{

    public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head){

        if(head==null){
            return head;
        }
        SinglyLinkedListNode current = new SinglyLinkedListNode(head.data);

        skipDuplicates(current,head.next);
        return current;
    }

    public static void skipDuplicates(SinglyLinkedListNode current, SinglyLinkedListNode next){
        if(next != null){
            if(current.data!= next.data){
                current.next = new SinglyLinkedListNode(next.data);
                skipDuplicates(current.next,next.next);
            }else {
                skipDuplicates(current,next.next);
            }
        }
    }
}
