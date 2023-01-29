package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[]args){
        Queue<String> queue=new PriorityQueue(Collections.reverseOrder());
        queue.offer("D");
        queue.offer("E");
        queue.offer("A");
        queue.offer("Z");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
//reverseOrder method reverse the order i.e. if ascending it converts it to descending
//In priority queue the element are arranged in order i.e. in ascending or descending