package com.linkedlistimplementation;

public class MyLinkedList<K> {
    private AllNode head;
    private AllNode tail;
    private static AllNode tempNode;

    public static AllNode getTempNode() {
        return tempNode;
    }

    public AllNode getHead() {
        return head;
    }

    public AllNode getTail() {
        return tail;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }


    public void add(AllNode newNode) {
        if (tail == null)
            this.tail = newNode;
        if (head == null)
            this.head = newNode;
        else {
            tempNode = this.head;
            this.head = newNode;
            newNode.setNext(tempNode);
        }
    }

    public void append(AllNode newNode) {
        if (head == null)
            this.head = newNode;
        if (tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printMyList() {
        System.out.println("My List is :");
        StringBuffer myNodes = new StringBuffer();
        tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }


    public void insert(AllNode myNode, AllNode newNode) {
        tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
}
