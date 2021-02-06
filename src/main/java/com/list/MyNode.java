package com.list;

public class MyNode <K>{
    private  MyNode next;
    private  K Key;
    public  MyNode(K key){
        this.Key=null;
        this.next=null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}