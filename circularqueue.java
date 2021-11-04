import java.io.*;
class queue{
  int MAX = 3;
  int[] arr = new int[MAX];
  int front, rear;

  queue(){
    front = rear = -1;
  }

  boolean isFull(){
    if((front == 0 && rear == MAX-1) || (front == rear+1)){
      return true;
    }
    return false;
  }

  boolean isEmpty(){
    if(front == -1 && rear == -1){
      return true;
    }
    return false;
  }

  void insert(int num){
    if(isFull()){
      System.out.println("Overflow");
    }
    else{
      if(front == -1){
        front++;
      }
      rear = (rear+1) % MAX;
      arr[rear] = num;
      System.out.println(num + " inserted");
    }
  }

  void delete(){
    int del_num;
    if(isEmpty()){
      System.out.println("UnderFlow");
    }
    else{
      del_num = arr[front];
      if(front == rear){
        front = rear = -1;
      }
      front = (front+1)%MAX;
      System.out.println(del_num + " deleted");
    }
  }

  void display(){
    if(isEmpty()){
      System.out.println("Nothing to display");
    }
    else{
      if(front <= rear){
        for(int i = front; i<= rear; i++){
          System.out.println(arr[i]);
        }
      }
      else{
        for(int i = front; i<MAX; i++){
          System.out.println(arr[i]);
        }
        for(int i = 0; i<=rear; i++){
          System.out.println(arr[i]);
        }
      }
    }
  }
}
public class circularqueue{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    queue q1 = new queue();

    int option, val;
    System.out.println("Menu");
    System.out.println("1. insert");
    System.out.println("2. delete");
    System.out.println("3. display");
    System.out.println("4. exit");

    do{
      System.out.println("Enter your choice: ");
      option = Integer.parseInt(br.readLine());
      switch(option){
        case 1 :
        if(q1.isFull()){
          System.out.println("Overflow");
        }
        else{
          System.out.println("Enter value to insert: ");
          val = Integer.parseInt(br.readLine());
          q1.insert(val);
        }
        break;
        case 2:
        q1.delete();
        break;
        case 3:
        q1.display();
        break;
        default:
        System.out.println("Enter valid option");
      }
    }while(option != 4);

  }
}
