import java.io.*;
import java.util.*;
import java.lang.*;

public class ADifferentProblem {
    public static void main(String[] args) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      ArrayList<Integer> initial = new ArrayList<Integer>();
      int pairs;

      Scanner reader = new Scanner(System.in);  // Reading from System.in
      pairs =reader.nextInt();
      for(int i = 0; i < pairs*2; i++){
        initial.add(reader.nextInt());
      }

      for(int i = 0; i < initial.size(); i+=2){
        result.add(Math.abs(initial.get(i) - initial.get(i+1)));
      }

      for(int i = 0; i < result.size(); i++){
        System.out.println(result.get(i));
      }
    }
}
