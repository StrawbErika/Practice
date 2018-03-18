import java.io.*;
import java.util.*;
import java.lang.*;

public class ABC {
    public static void main(String[] args) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      String abc;
      int first, second, third, max, min, mid;
      Find find = new Find();

      Scanner reader = new Scanner(System.in);  // Reading from System.in
      first =reader.nextInt();
      second =reader.nextInt();
      third =reader.nextInt();
      abc =reader.next();

      char[] cABC = abc.toCharArray();

      max = find.getMax(first, second, third);
      min = find.getMin(first, second, third);
      mid = find.getMid(first, second, third);

      for(int i = 0; i < cABC.length; i++){
        if(cABC[i] == 'A'){
          result.add(i,min);
        }
        if(cABC[i] == 'B'){
          result.add(i,mid);
        }
        if(cABC[i] == 'C'){
          result.add(i,max);
        }
      }
      System.out.println(result);
    }
}
