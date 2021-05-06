package com.linkedlistimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode= new MyNode<>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        boolean result=firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(thirdNode);

        Assertions.assertTrue(result);
    }
}
