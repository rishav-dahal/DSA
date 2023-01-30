package Linkedlist;

import java.util.LinkedList;

public class Single {
    public static void main(String[]args){
        LinkedList<String> linkedlist = new LinkedList<>();
        //we can use linked list both as queue and stack so

        linkedlist.push("A");
        linkedlist.offer("B");
        linkedlist.pop();
        linkedlist.poll();
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.addLast("v");

        System.out.println(linkedlist.indexOf("D"));
        System.out.println(linkedlist.peek());
        System.out.println(linkedlist.contains("C"));
        System.out.println(linkedlist.get(1));
        System.out.println(linkedlist);
    }
}

// *******************************************************
// LinkedList =  Nodes are in 2 parts (data + address)
//                        Nodes are in non-consecutive memory locations
//                        Elements are linked using pointers

//    advantages?
//    1. Dynamic Data Structure (allocates needed memory while running)
//    2. Insertion and Deletion of Nodes is easy. O(1)
//    3. No/Low memory waste

//    disadvantages?
//    1. Greater memory usage (additional pointer)
//    2. No random access of elements (no index [i])
//    3. Accessing/searching elements is more time consuming. O(n)

//    uses?
//    1. implement Stacks/Queues
//    2. GPS navigation
//    3. music playlist

//more at https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
// *******************************************************