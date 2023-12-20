public class Doubly 
{
    private Node head;
    private Node tail;
    private int size;
    Doubly()
    {
        this.size=0;
    }

    public void insertFirst(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            tail=head=newNode;
        }
        else
        {
            head.previous=newNode;
            newNode.next=head;
            head=newNode;     
        }
        size++;
    }
    public void insertLast(int value)
    {
        Node newnNode=new Node(value);
        if(tail==null)
        {
           insertFirst(value);
        }
        else
        {
            tail.next=newnNode;
            newnNode.previous=tail;
            tail=newnNode;
            size++;

        }
    }
    public void insertPos(int value,int pos)
    {
        Node newNode=new Node(value);
        if(pos==0)
        {
            insertFirst(value);
        }
        else if(pos==size)
        {
            insertLast(value);
        }
        else
        {
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            newNode.previous = temp;
            newNode.next = temp.next;
            temp.next.previous = newNode;
            temp.next = newNode;
            size++;
        }

    }
    public void deletePos(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        temp.next.next.previous=temp.next;
        temp.next=temp.next.next;
        size--;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        System.out.println();
        System.out.println(size);
    }
    public void displayReverse()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.value+"<->");
            temp=temp.previous;
        }
        System.out.println();
        System.out.println(size);
    }
    private class Node
    {
        private int value;
        private Node next;
        private Node previous;
    
         Node(int value)
        {
            this.value=value;
        }

    }
}
