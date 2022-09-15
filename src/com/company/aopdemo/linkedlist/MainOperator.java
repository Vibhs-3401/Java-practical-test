package com.company.aopdemo.linkedlist;

public class MainOperator {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(list, 2);
        list.insert(list, 5);
        list.insert(list, 8);
        list.insert(list, 3);
        list.insert(list, 9);
        list.insert(list, 6);

        list.printList(list);

        list.delete(list, 6);
        list.printList(list);
        list.delete(list, 7);
        list.printList(list);
        list.delete(list, 2);
        list.printList(list);
    }
}
