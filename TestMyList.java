public class TestMyList {
   public static void main(String[] args) {
      MyList<Integer> intList = new MyList<>();
      MyList<String> strList = new MyList<>();
      
      intList.add(5, 1);
      intList.add(10, 12);
      intList.add(15, 6);
      intList.add(20, 9);
      intList.add(25, 3);
      
      strList.add("Str1", 10);
      strList.add("Str2", 20);
      strList.add("Str3", 30);
      strList.add("Str4", 49);
      strList.add("Str5", 40);
      
      System.out.println("Integer List: " + intList);
      System.out.println("String List: " + strList);
 }
}