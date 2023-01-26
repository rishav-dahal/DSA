package Stack;
import java.util.Stack;
public class Basic {
    public static void main(String[]args){
        //Using stack class and using string data type to make a stack object
        Stack<String> stack = new Stack<>();

        /*Stack class has push() pop() empty() peek() search() methods
        learn more at https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
         */
        System.out.println(stack.empty());

        stack.push("Rishav");
        stack.push("Shrayash");
        stack.push("Jenisha");
        stack.push("Sandhya");

        System.out.println(stack.empty());
        System.out.println(stack);

        String pop= stack.pop();
        System.out.println(stack);
        System.out.println(pop);


    }
}
