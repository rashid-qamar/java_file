import java.util.*;

class Node {
        int data;
        Node next;

        Node(int val, Node top) {
            this.data = val;
            this.next = top;
        }
    }

class LinkedListStack {

    private Node top;

    LinkedListStack() {
        top = null;
    }

    void push(int data) {
        top = new Node(data, top);
        System.out.println(data + " pushed !!");
    }

    boolean isEmpty() {
        return (top == null);
    }

    void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty !!");
            return;
        }
        System.out.println(top.data + " popped !!");
        top = top.next;
    }

    void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty !!");
            return;
        }
        System.out.println(top.data + " peek element ");
    }

    void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty !!");
            return;
        }
        Node temp = top;
        System.out.println("List:");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class StackConstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedListStack LL = new LinkedListStack();
        int choice = 0;
        int data;

        while(choice != 5) {
            System.out.println("\nOptions:");
            System.out.println("------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    LL.push(data);
                    break;

                case 2:
                    LL.pop();
                    break;

                case 3:
                    LL.peek();
                    break;

                case 4:
                    LL.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}
