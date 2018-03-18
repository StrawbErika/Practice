import java.io.*;
import java.util.*;
import java.lang.*;

public class Apaxians {
    public static void main(String[] args) {
      String givenName;

      Scanner reader = new Scanner(System.in);  // Reading from System.in
      System.out.println("Word: ");
      givenName =reader.nextLine();

      char[] name = givenName.toCharArray();
      ArrayList<Character> result = new ArrayList<Character>();
      int j = 0;
      for (int i = 0; i < name.length; i++){
        if(j == 0){
          result.add(name[i]);
        }
        else if(name[i] != result.get(result.size()-1)){
          result.add(name[i]);
        }
        else{
        }
        j++;
      }
      System.out.println(result);
    }
}
