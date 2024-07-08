public class AltList<E>
{
   private class Node
   {
      E element;
      Node next;
      
      public Node(E element)
      {
         this.element = element;
         this.next = null;
      }
      
      public Node(E element, Node next)
      {
         this.element = element;
         this.next = next;
      }
   }
   
   private Node head;
   private Node tail;
   private int size = 0;
   
   /* TODO: This method should add the element to the beginning of 
            of the list and increase the size of the list by one. */
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
         head = node;
      }
      size++;
   }

   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one. */   
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
         tail = node;
      }
      size++;      
   }

   public E get(int index)
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
   
      return node.element;
   }   
   public int size()
   {
      return size;
   }
}