class Main{
    class Insertbeg{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
        
    }
    public Node head=null;
    public void push(int data)
    {
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
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
        Insertbeg i =new Insertbeg();
        i.push(10);
        i.push(20);
        i.push(30);
        i.push(40);
        i.display();
    }
}
