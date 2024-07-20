// import java.util.ArrayList;
// import java.util.List;

// public class ArrayListDemo {
//    public static void main(String[] args) {
//       List<String> al = new ArrayList<String>();
//       al.add("A");
//       al.add("B");
//       al.add("A");
//       al.add(null);
//       System.out.println(al);
//    }

// }

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
   public static void main(String[] args) {

     List<String> al1 = new ArrayList<String>();
     al1.add("A");
     al1.add("B");
     
     List<String> al2 = new ArrayList<String>();
     al2.add("P");
     al2.add("Q");
     
     al1.addAll(al2);
     System.out.println(al1);
   }
}
