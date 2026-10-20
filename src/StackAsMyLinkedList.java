
public class StackAsMyLinkedList<E> 
{   
    MyLinkedList<E> theStack;
    MyLinkedList<E> redoStack; // Stack to keep track of popped elements
    
    public StackAsMyLinkedList()
    {  theStack = new MyLinkedList<E>();
        redoStack = new MyLinkedList<E>();
        
    }
    
    public void push(E newElement) //insert at head
    {  
           theStack.prepend(newElement);
           redoStack.clear();
    }
    
    public E pop() //remove from head
    {  
        E temp = null;
        boolean isDone = false;
        
        temp = theStack.getFirst();
        if (temp != null)
        {
            isDone=theStack.delete(temp);
            redoStack.prepend(temp);
        }
        if (isDone)
            return temp;
        else
            return null;
    }
    public String toString()
    {
        return theStack.toString();
    }
    //Redo Implementation
    public E redo() // Undo the last pop (unpop)
    {  
        E temp = redoStack.getFirst();
        if (temp != null)
        {
            redoStack.delete(temp);
            theStack.prepend(temp); // Push the element back to the main stack
        }
        return temp;
    }
  
}//end class
