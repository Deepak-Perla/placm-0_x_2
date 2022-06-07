package stacks;

public class stacks2 {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }

    public void show(){
        for(int i:stack){
            System.out.print(i+" ");
        }
    }

    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.print("Dude EMPTY STACK!!!");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }
}
