package hus.oop.collections.mylist;

public class MyLinkedListNode {
    Object payload; 
    MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return this.payload;
    }

    public void setPayload(Object dataValue) {
        payload = dataValue;
    }

    public MyLinkedListNode getNext() {
        return this.next;
    }

    public void setNext(MyLinkedListNode nextValue) {
        next = nextValue;
    }
}
