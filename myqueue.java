class queue {
    static int MAX = 5;
    int[] arr = new int[MAX];
    int front, rear;

    queue(){
        front = rear = -1;
    }

    boolean isFull(){
        if(rear == MAX-1)
            return true;
        else
            return false;
    }

    boolean isEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }

    void enqueue(int num){
        if(this.isFull()){
            System.out.println("Queue is Full!");
        }
        else{
            if(front == -1){
                front++;
            }
            arr[++rear] = num;
            System.out.println(num + " inserted");
        }
    }
    void dequeue(){
        int del_num;
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
        }
        else{
            del_num = arr[front];
            front++;
            System.out.println(del_num + " deleted from queue");
        }
    }
    void display(){
        if(isEmpty())
            System.out.println("Queue is Empty!");
        else{
            for(int i = front; i <= rear; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
public class myqueue{
    public static void main(String[] args){
        queue q1 = new queue();

        q1.enqueue(12);
        q1.enqueue(11);
        q1.enqueue(19);
        q1.enqueue(10);
        q1.enqueue(16);

        q1.display();

        q1.dequeue();
        q1.dequeue();

        q1.display();
    }
}
