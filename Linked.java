class Linked
{
    private Node head;
    private Node tail;
    private int size;
    Linked()
    {
        this.size=0;
    }
    public void insertFirst(int value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value)
    {
        Node newNode=new Node(value);
        if(tail==null)
        {
            insertFirst(value);
        }
        else 
        {
            tail.next=newNode;
            tail=newNode;
             size+=1;
        }
    }
    public void insertPos(int value,int pos)
    {
        Node newnNode=new Node(value);
        if (pos==0)
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
            newnNode.next=temp.next;
            temp.next=newnNode;
            size+=1;
        }
    }
    public void deletePos(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        Node del=temp.next;
        temp.next=del.next;
        size--;       
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
        System.out.println(size);
    }
    private class Node
    {
        private int value;
        private Node next;

        Node(int value)
        {
            this.value=value;
        }
    }

}