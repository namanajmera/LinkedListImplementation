package com.linkedlistimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumberWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        boolean result = firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(thirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenAddedToLinkedShouldBeAddedToTop() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);

        myLinkedList.printMyList();
        boolean result = myLinkedList.getHead().equals(thirdNode) &&
                myLinkedList.getHead().getNext().equals(secondNode) &&
                myLinkedList.getTail().equals(firstNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenAppendedToLinkedShouldBeAddedToBottom() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        myLinkedList.printMyList();

        boolean result = myLinkedList.getHead().equals(firstNode) &&
                myLinkedList.getHead().getNext().equals(secondNode) &&
                myLinkedList.getTail().equals(thirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenInsertingInBetweenShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(thirdNode);

        myLinkedList.insert(firstNode, secondNode);

        myLinkedList.printMyList();
        boolean result=myLinkedList.getHead().equals(firstNode) &&
                myLinkedList.getHead().getNext().equals(secondNode) &&
                myLinkedList.getTail().equals(thirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenDeletedFirstElementShouldReturnFirstElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        AllNode deletedNode = myLinkedList.deleteFirst();
        System.out.print("After deleting first element, ");
        myLinkedList.printMyList();
        Assertions.assertEquals(firstNode, deletedNode);
    }
}
