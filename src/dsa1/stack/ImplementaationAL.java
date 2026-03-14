package dsa1.stack;

import java.util.ArrayList;

public class ImplementaationAL {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }

        public int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args){
        Implemenation.Stack stack = new Implemenation.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
