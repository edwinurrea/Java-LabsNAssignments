public class MyList<T> {
   private T[] data;
   
   @SuppressWarnings("unchecked")
   public MyList() {
      data = (T[]) new Object[50];
}

   public void add(T element, int position) {
      if(position < 0 || position > 49) {
         throw new IndexOutOfBoundsException("Position must be between 0 and 49");
}
      data[position] = element;
}

   @Override
   public String toString() {
      StringBuilder result = new StringBuilder();
      for(T element : data) {
         if(element != null) {
            result.append(element).append(", ");
 }
}
      if(result.length() > 0) {
         result.delete(result.length() - 2, result.length());
}
      return result.toString();
 }
}