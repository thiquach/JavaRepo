import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(60);
      Iterator<Integer> it = al.iterator();
      while (it.hasNext()) {
        System.out.println(it.next());
      }
  }
}
