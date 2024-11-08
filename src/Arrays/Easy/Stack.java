//package Arrays.Easy;
//
//import java.util.ArrayList;
//
//public class Stack {
//    ArrayList<Integer> stack ;
//    public Stack() {
//        stack = new ArrayList<>();
//    }
//
//    public void push(int item){
//        stack.addLast(item);
//    }
//
//    public int pop(){
//        if(stack.isEmpty()){
//            System.out.println("underflow");
//        }
//        return stack.removeLast();
//    }
//
//    public int peek(){
//        if(stack.isEmpty()){
//            System.out.println("Stack is empty");
//        }
//        return stack.getLast();
//    }
//
//    public boolean isEmpty(){
//        return stack.isEmpty();
//        }
//
//    public void size(){
//        System.out.println("Size of stack is : "+stack.size());
//    }
//
//    public void display(){
//        System.out.println(stack);
//    }
//
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//        stack.push(1);
//        stack.push(24);
//        stack.push(31);
//        stack.push(44);
//
//        System.out.println("Top element: " + stack.peek());
//
//        System.out.println("Popped element: " + stack.pop());
//
//        System.out.println("Is stack empty? " + stack.isEmpty());
//
//        stack.display();
//
//        stack.size();
//    }
//}
