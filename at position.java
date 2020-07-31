
class Insert{
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
        
    }
    public Node head=null;
    public Node tail=null;
    public void insert(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    void specific(int data,int pos)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            temp=temp.next;
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void display()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        
    }
    public static void main(String[] args)
    {
        Insert i =new Insert();
        i.insert(10);
        i.insert(20);
        i.insert(30);
        i.insert(40);
        i.display();
        System.out.println();
        i.specific(25,2);
        i.display();
    }
}
