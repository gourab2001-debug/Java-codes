import java.util.Scanner;

class linkedlist {
    class node {
        node next; // self referencing class
        int data;

        node(int x) {
            data = x;
            next = null;
        }
    }

    public node head = null;
    public node tail = null;

    void insert(int x) {
        node newNode = new node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println(x + " inserted");
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println(x + " inserted");
        }
    }

    void insert_pos(int pos, int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println(val + " inserted");
        } else if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            node temp = head;
            while (pos > 2) {
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void delete_end() {
        int val = 0;
        if (head == null) {
            System.out.println("Nothing to delete.");
        } else if (head == tail) { // head == tail != null
            val = head.data;
            head = tail = null;
        } else {
            node temp = head;
            while ((temp.next).next != null) { // = tail.next
                temp = temp.next;
            }
            val = (temp.next).data;
            temp.next = null;
        }
        System.out.println("deleted value = " + val);

    }

    void delete_pos(int pos) {
        int val = 0;
        if (head == null) {
            System.out.println("Nothing to delete");
        } else if (pos == 1) {
            val = head.data;
            head = tail = null;
        } else {
            node temp = head;
            node temp2 = temp;
            while (pos > 2) {
                temp = temp.next;

                pos--;
            }
            val = temp.next.data;
            temp2 = temp.next.next;
            temp.next.next = null;
            temp.next = temp2;

        }
        System.out.println("deleted value = " + val);
    }

    void display() {
        node temp = head;
        System.out.println("The data in the linkedlist: ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1.Insert    2.Insert by position    3.Delete by end");
        System.out.println("4.Delete by position   5.Display    6. Exit");

        do {
            System.out.println("Enter your option: ");
            option = sc.nextInt();

            switch (option) {
            case 1:
                System.out.println("Enter the value to insert = ");
                int val = sc.nextInt();
                ll.insert(val);
                break;
            case 2:
                System.out.println("Enter the value to insert & position = ");
                val = sc.nextInt();
                int pos = sc.nextInt();
                ll.insert_pos(pos, val);
                break;
            case 3:
                ll.delete_end();
                break;
            case 4:
                pos = sc.nextInt();
                ll.delete_pos(pos);
                break;
            case 5:
                ll.display();
                break;
            default:
                System.out.println("Enter correct option");

            }
        } while (option != 6);

        sc.close();

    }
}