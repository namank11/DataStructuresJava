import java.io.*;
import java.util.*;
public class Stackimplemetation {
    void stack_pop(Stack<Integer> stack){
        Integer p=(Integer)stack.pop();
        System.out.println("Elementwhich is popped out"+p);
    }
    void Stack_search(Stack<Integer> stack,int element){
        Integer pos=(Integer)stack.search(element);
        if(pos==-1){
            System.out.println("Elemet not Found");
        }
        else
            System.out.println("Element found at "+pos);
    }
    void stack_peek(Stack<Integer> stack){
        Integer pe=(Integer)stack.peek();
        System.out.println("Element at the top of the stack is"+pe);
    }

    public static void main(String[] args) {
        Stackimplemetation si=new Stackimplemetation();
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        System.out.println("Enter the size of the Stack");
        int ss=sc.nextInt();
        System.out.println("Enter the elements of the stack");
        for(int i=0;i<ss;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Enter the element you want to search in the stack");
        int eles=sc.nextInt();
        si.Stack_search(stack,eles);
        si.stack_pop(stack);
        si.stack_peek(stack);
    }
}
