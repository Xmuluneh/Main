package Muluneh;

public class StackArray {
    private int[] data;
    private int top;

    public StackArray(int n) {
        this.data = new int[n];
        this.top = 0;

    }

    public int length() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == data.length;
    }

    public void push(int e) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        } else {
            data[top++] = e;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int e = data[top-1];
            top--;
            return e;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return -1;
        } else {
            return data[top-1];

        }
    }
    public void display(){
        for(int i=0;i<top;i++) {
            System.out.print(data[i]+",");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(10);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);
        stackArray.push(7);
        stackArray.push(8);
        stackArray.push(9);
        stackArray.push(10);
        System.out.print("The stack before any operation:");
        stackArray.display();
        System.out.println("The length of the stack is :"+stackArray.length());
        stackArray.pop() ;
        stackArray.display();
        System.out.println(stackArray.peek());
       


    }

}
