package Array;

import java.util.ArrayList;

public class Example {

    public static void main(String[]args){
        Dynamic dynamic=new Dynamic();
        dynamic.add("A");
        dynamic.insert(1,"B");
        dynamic.add("V");
        dynamic.add("E");
        dynamic.add("G");
        dynamic.delete("v");
        System.out.println("Size of array:"+dynamic.size);
        System.out.println("Capacity of array:"+dynamic.capacity);
        System.out.println("Data at index 3 is:"+dynamic.get(3));
        System.out.println("Index of A is:"+dynamic.search("A"));
        System.out.println("Is array is Empty:"+dynamic.isEmpty());
        System.out.println("Element in array are:"+dynamic);
    }
}
//static array and dynamic array
//In static array the capacity of array is fixed
//In dynamic array capacity of array can be changed according to requirements
//ArrayList<String> array = new ArrayList<>();
//Arraylist is class used for dynamic array but here to understand  how it works. we have defined our own
//class to achieve dynamic array
//dynamicarray is called List in python vector in c++ and array in js