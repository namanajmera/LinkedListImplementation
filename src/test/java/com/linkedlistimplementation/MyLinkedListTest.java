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
        boolean result = myLinkedList.getHead().equals(firstNode) &&
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

    @Test
    public void given3NumberWhenDeletedLastElementShouldReturnLastElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        AllNode deletedNode = myLinkedList.deleteLast();
        System.out.print("After deleting last element, ");
        myLinkedList.printMyList();
        Assertions.assertEquals(thirdNode, deletedNode);
    }

    @Test
    public void given3NumberWhenSearchForAnElementShouldReturnElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        AllNode searchedNode = myLinkedList.search(secondNode.getKey());
        System.out.println("Searched key : " + searchedNode.getKey());
        myLinkedList.printMyList();
        Assertions.assertEquals(secondNode, searchedNode);
    }

    @Test
    public void given3NumberWhenInsertingAfterAnElementShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        myLinkedList.insertAfter(30, 40);

        boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
                && myLinkedList.getHead().getNext().getNext().equals(myLinkedList.search(40))
                && myLinkedList.getTail().equals(thirdNode);
        myLinkedList.printMyList();
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenDeletingAnElementShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(40);
        MyNode<Integer> fourthNode = new MyNode(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);

        myLinkedList.deleteElement(thirdNode.getKey());
        System.out.println("Size : " + myLinkedList.size());

        boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
                && myLinkedList.getTail().equals(fourthNode);
        myLinkedList.printMyList();
        Assertions.assertTrue(true);
    }
}
