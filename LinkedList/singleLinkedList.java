package LinkedList;


public class singleLinkedList {
    public static Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void push(int data){
        if(head == null){
            head = new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static int gcd(int a, int b){
        while(b!=0){
            if(a > b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
    public static void insertGcdNodes(Node head){
        Node currentNode = head;
        Node nextNode = currentNode.next;
        while(nextNode!=null){
            int gcdNumber = gcd(currentNode.data, nextNode.data);
            Node addingNode = new Node(gcdNumber);
            currentNode.next = addingNode;
            addingNode.next = nextNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
    }

    public Node removeElements(Node head, int data) {
        if(head == null){
            return null;
        }
        Node currentNode = head;
        Node prev = null;
        while(currentNode!=null){
            if(currentNode.data == data){
                if(currentNode == head){
                    head = head.next;
                }else{
                    prev.next = currentNode.next;
                }
            }else{
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    public Node swapPairs(Node head) {
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp!=null && temp.next!=null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
        return head;
    }

    public Node doubleIt(Node head) {
        if(head.data >=5){
            Node temp = head;
            head = new Node(0);
            head.next = temp;
        }
        Node curr = head;
        while(curr!=null){
            curr.data*=2;
            curr.data%=10;
            if(curr.next!=null && curr.next.data >=5){
                curr.data+=1;
            }
            curr = curr.next;
        }
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        insertGcdNodes(head);
        printLinkedList(head);
        // int gcdNumber = gcd(4, 10);

        // System.out.println(gcdNumber);
    }
}
