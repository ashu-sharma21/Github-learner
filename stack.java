class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize=s;
    stackArray= new int[maxSize];
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
      System.out.print("OVERFLOW");
    }
    stackArray[++top]=j;
  }
  
  public int pop() // take item from top of stack
  {
    if(isEmpty())
    {
      //System.out.print("UNDERFLOW");
      return -1;
    }
    int item=stackArray[top--];
    return item;
  }

  public boolean isEmpty() // true if stack is empty
  {
    return (top==-1);
  }

  public boolean isFull() // true if stack is full
  {
    return (top==maxSize-1);
  }
}
