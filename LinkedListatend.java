class Insertend{
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
    public void end(int data)
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
        Insertend i =new Insertend();
        i.specific(10);
        i.specific(20);
        i.specific(30);
        i.specific(40);
        i.display();
    }
}
