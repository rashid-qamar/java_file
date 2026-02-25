import java.util.*;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    
    private class Node {
        private int data;
        private Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    public void insert_head(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;

        if(tail == null)
            tail = head;

        System.out.println(new_data + " inserted at Start");
    }

    public void insert_pos(int pos, int new_data) {
        if(pos == 0) {
            System.out.println("Invalid Position");
            return;
        }

        if(pos == 1) {
            insert_head(new_data);
            return;
        }

        Node temp = head;
        for(int i=1; temp != null && i<pos-1; i++) {        //Traversing
            temp = temp.next;
        }

        Node new_Node = new Node(new_data);
        new_Node.next = temp.next;
        temp.next = new_Node;
        System.out.println(new_data + " inserted at position " + pos);
    }

    public void insert_tail(int new_data) {
        Node new_Node = new Node(new_data);
        tail.next = new_Node;
        tail = new_Node;

        System.out.println(new_data + " inserted at Tail");
    }

    public void delete_head() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println(head.data + " deleted");
        head = head.next;
    }

    public void delete_tail() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println(head.data + " deleted");
        head = head.next;
    }

    public void print() {
        Node temp = head;
        int count=1;

        System.out.println("List: ");
        while(temp != null) {
            System.out.print(temp.data + "(" + count + ")" + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList LL = new SinglyLinkedList();
        int choice = 0;
        int value;
        int position;

        while(choice != 8) {
            System.out.println("\nOptions --");
            System.out.println("--------------");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at a position");
            System.out.println("3. Insert at Tail");
            System.out.println("4. Delete at Start");
            System.out.println("5. Delete at a position");
            System.out.println("6. Delete at Tail");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    value = sc.nextInt();
                    LL.insert_head(value);
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    System.out.print("Enter data: ");
                    value = sc.nextInt();
                    LL.insert_pos(position, value);
                    break;

                case 3:
                    System.out.print("Enter data: ");
                    value = sc.nextInt();
                    LL.insert_tail(value);
                    break;

                case 4:
                    LL.delete_head();
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    LL.delete_pos(position);
                    break;

                case 6:
                    LL.delete_tail();
                    break;

                case 7:
                    LL.print();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input !");
                    break;
            }
        }
        sc.close();
    }
}
