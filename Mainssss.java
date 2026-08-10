
public class Mainssss 
{
    public static void main(String[] args) 
	{
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertHead(20);
        list.insertHead(10);
        list.insertTail(40);
        list.insertPosition(30, 3);

        list.display();
    }
}