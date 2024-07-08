import java.nio.file.*;
import java.io.*;
public class ReadFile {
   public static void main(String[] args) throws IOException {
      Path file = Paths.get("Data.txt");
      String line;
      try {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         line = reader.readLine();
         
         while(line != null) {
            System.out.println(line);
            line = reader.readLine();
}
      reader.close();
}
   catch(IOException e) {
      System.out.println("File not found");
}
   catch(Exception e) {
      System.out.println("Something went wrong");
  }
 }
}