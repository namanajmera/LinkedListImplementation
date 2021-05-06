package com.linkedlistimplementation;

public class MyNode<K> implements AllNode<K> {
    private K key;
    private AllNode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public AllNode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(AllNode next) {
        this.next = (AllNode<K>) next;
    }
}