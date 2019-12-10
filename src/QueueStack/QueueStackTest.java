package QueueStack;

import sun.awt.image.ImageWatched;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackTest {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);

        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());


        Deque<String> stack = new LinkedList<>();

        stack.push("a");
        stack.push("b");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}

class MyQueue{
    Deque<Integer> in = new LinkedList<>();
    Deque<Integer> out = new LinkedList<>();


    public void offer(int value){
        in.push(value);
    }

    private void reshuffleIfNecessary(){
        if (out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }

    public Integer poll() {
        reshuffleIfNecessary();
        if (out.isEmpty()) {
            return null;
        }
        return out.pop();
    }

    public Integer peek(){
        reshuffleIfNecessary();
        if (out.isEmpty()){
            return null;
        }
        return out.peek();
    }

    public int size(){
        return in.size() + out.size();
    }

    public boolean isEmpty(){
        return in.isEmpty() && out.isEmpty();
    }

}



class Mystack{
    private Deque<Integer> stack = new LinkedList<>();
    private Deque<Integer> minStack = new LinkedList<>();


    public void push(int value){
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek());
            minStack.push(value);
    }

    public Integer pop(){
        if (stack.isEmpty()){
            return null;
        }
        int result = stack.pop();
        if (result == minStack.peek()){
            minStack.pop();
        }
        return result;

    }

    public Integer peek(){
        if (stack.isEmpty()){
            return null;
        }
        return stack.peek();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Integer min(){
        if (minStack.isEmpty()){
            return null;
        }
        return minStack.peek();
    }

}