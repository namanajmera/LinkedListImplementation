package com.linkedlistimplementation;

public class MyLinkedList<K> {
    private AllNode head;
    private AllNode tail;

    public AllNode getHead() {
        return head;
    }

    public AllNode getTail() {
        return tail;
    }

    public MyLinkedList() {
        this.head = head;
        this.tail = tail;
    }

    public void add(AllNode newNode) {
        if (tail == null)
            this.tail = newNode;
        if (head == null)
            this.head = newNode;
        else {
            AllNode tempNode = this.head;
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
        System.out.print("My List is : ");
        StringBuffer myList = new StringBuffer();
        AllNode tempNode = head;
        while (!tempNode.equals(tail)) {
            myList.append(tempNode.getKey());
            myList.append("->");
            tempNode = tempNode.getNext();
        }
        myList.append(tempNode.getKey());
        System.out.println(myList);
    }

    public void insert(AllNode myNode, AllNode newNode) {
        AllNode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public AllNode deleteFirst() {
        AllNode tempNode = this.head;
        this.head = head.getNext();
        System.out.println("Deleted element is :" + tempNode.getKey());
        return tempNode;
    }

    public AllNode deleteLast() {
        AllNode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        System.out.println("Deleted element is :" + tempNode.getKey());
        return tempNode;
    }

    public AllNode search(K key) {
        AllNode tempNode = head;
        while (!tempNode.equals(tail)) {
            if (tempNode.getKey() == key) {
                System.out.println("Element is present");
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        if (tempNode.getKey() == key) {
            System.out.println("Element is present");
            return tempNode;
        } else {
            System.out.println("Element is not present");
            return null;
        }
    }

    public void insertAfter(K myKey, K newKey) {
        AllNode myNode = search(myKey);
        if (myNode != null) {
            insert(myNode, new MyNode(newKey));
            System.out.println("Element inserted");
        } else
            System.out.println("Element not inserted");
    }
}
