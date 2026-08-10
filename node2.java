class Node2 
{
	
    int data;
    Node prev, next;

    Node(int data) 
	{
        this.data = data;
    }
}

class CircularDoublyLinkedList 
{
    Node head;

    void insertHead(int data)
	{
        Node n = new Node(data);
        if (head == null) 
		{
            head = n;
            n.next = n.prev = n;
        } else {
            Node t = head.prev;
            n.next = head;
            n.prev = t;
            t.next = n;
            head.prev = n;
            head = n;
        }
    }

    void insertTail(int data) 
	{
        Node n = new Node(data);
        if (head == null) 
		{
            head = n;
            n.next = n.prev = n;
        } else {
            Node t = head.prev;
            n.next = head;
            n.prev = t;
            t.next = n;
            head.prev = n;
        }
    }

    void insertPosition(int data, int pos) 
	{
        Node n = new Node(data), t = head;
        for (int i = 1; i < pos - 1; i++) t = t.next;
        n.next = t.next;
        n.prev = t;
        t.next.prev = n;
        t.next = n;
    }

    void display() 
	{
        Node t = head;
        do {
            System.out.print(t.data + " <-> ");
            t = t.next;
        } while (t != head);
        System.out.println("(HEAD)");
    }
}

