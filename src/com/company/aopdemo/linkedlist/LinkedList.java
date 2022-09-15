/*Linked List: Linear ds
* Contains nodes
* no contiguous memory allocation
* nodes are made of data and reference(address) of next node
* better to manipulate data i.e: insertion, deletion
* implements dequeue internally
* */

package com.company.aopdemo.linkedlist;

public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);

        if(list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }


    public static void printList(LinkedList list) {
        if(list.head == null) {
            System.out.println("The list is empty");
        } else {
            Node currentNode = list.head;
            while (currentNode != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }


    public static LinkedList delete(LinkedList list, int key) {
        Node currNode = list.head;
        Node prev = null;

        if(currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " Key found and deleted successfully...!");
            return list;
        }

        while(currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " Key found and deleted successfully...!");
        }

        if(currNode == null) {
            System.out.println(key + " Key not found...!");
        }

        return list;
    }
}


