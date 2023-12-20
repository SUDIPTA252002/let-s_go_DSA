public class test2 
{
    public static void main(String[] args) 
    {
        // Linked list=new Linked();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(2);
        // list.insertLast(9);
        // list.display();
        // list.insertPos(7, 3);
        // list.display();
        // list.deletePos(3);
        // list.display();
        Doubly doubly=new Doubly();
         doubly.insertFirst(3);
         doubly.insertFirst(4);
         doubly.insertFirst(5);
         doubly.display();
        doubly.insertLast(9);
        doubly.display();
        doubly.insertPos(1, 2);
        doubly.display();
        doubly.deletePos(2);
        doubly.display();
        doubly.displayReverse();
        doubly.display();



    }
    
}
