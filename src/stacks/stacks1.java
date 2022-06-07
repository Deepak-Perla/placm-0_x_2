package stacks;

public class stacks1 {
    private int [] arr;
    private int tos;

    public stacks1(){
        arr = new int[5];
        tos=-1;
    }
    public void add(int Cap){
        arr = new int [Cap];
        tos=-1;
    }
    public void push(int ali){
        add(ali);
    }
    public int peek(){
        return arr[tos];
    }
    public int  size(){
        return tos+1;
    }
    public boolean isFull(){
        return size()==arr.length;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void display(){
        int copy = tos;
        while(copy>=0){
            System.out.println(arr[copy]);
            copy--;
        }
    }
    public int pop(){
        int ans = arr[tos];
        tos--;
        return ans;
    }
}
