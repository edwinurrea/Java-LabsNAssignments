public class FullList<E>
{
   private class Node
   {
      E element;
      Node next;
      Node prev;
            
      public Node(E element)
      {
         this.element = element;
      }
   }
   
   private Node head;
   private Node tail;
   private int size = 0;
   
   public FullList()
   {
      head = null;
      tail = null;
   }
   
   /* TODO: This method should add the element to the beginning of 
            of the list and increase the size of the list by one. The 
            head and tail variables should be set correctly. */
   public void addBeginning(E element)
   {
      Node node = new Node(element);
      if(size == 0)
      {
         head = node;
         tail = node;  
      } 
      else
      {
         node.next = head;
         head.prev = node;
         head = node;
      }
      size++;
   }
   
   /* TODO: This method should insert the element at the given index.
            The size of the should increase by one.  The head and tail
            variables should be set correctly. */
   public void addMiddle(int index, E element)
   {
      if(index == 0)
      {
         addBeginning(element);
      } 
      else if(index == size)
      {
         addEnd(element);
      } 
      else
      {
         Node node = new Node(element);
         Node currentNode = getNode(index - 1);
         node.next = currentNode.next;
         node.prev = currentNode;
         node.next.prev = node;
         currentNode.next = node;
         size++;
      }
   }
   
   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one.
            The head and tail variables should be set correctly. */   
   public void addEnd(E element)
   {
      Node node = new Node(element);
      if(size == 0)
      {
         head = node;  
         tail = node;
      } 
      else
      {
         tail.next = node;
         node.prev = tail;
         tail = node;
      }
      size++;
   }

   public Node getNode(int index)
   {
      if(index < 0 || index > size - 1)
      {
         throw new IndexOutOfBoundsException();
      }
      
      Node node = head;
      for(int i = 0; i < index; i++)
      {
         node = node.next;
      }
      
      return node;      
   }
   
   public E get(int index)
   {      
      return getNode(index).element;
   }
      
   public int size()
   {
      return size;
   }
   
   public boolean isHeadNull()
   {
      return head == null;
   }
   
   public boolean isTailNull()
   {
      return tail == null;
   }
}