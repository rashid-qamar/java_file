import java.util.*;

class LinkedList {

    public Node head;
    int top;

    LinkedList() {
        top = -1;
    }

    public class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    boolean isEmpty() {
        return (top == - 1);
    }

    void ins_head(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
        System.out.println(new_data + " pushed");
        top++;
    }

    void del_head() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data + " poped");
        head = head.next;
        top--;
    }

    void display() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.println("List:");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList LL = new LinkedList();
        int choice = 0;
        int data;

        while(choice != 4) {
            System.out.println("\nOptions:");
            System.out.println("------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    LL.ins_head(data);
                    break;

                case 2:
                    LL.del_head();
                    break;

                case 3:
                    LL.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}
