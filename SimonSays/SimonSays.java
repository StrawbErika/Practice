import java.io.*;
import java.util.*;
import java.lang.*;

public class SimonSays {
    public static void main(String[] args) {
      ArrayList<String> result = new ArrayList<String>();
      ArrayList<String> initial = new ArrayList<String>();
      final CharSequence SIMON_SAYS = "simon says ";
      final int MAX_TEST = 20;
      final int MAX_CHARS = 1000;
      final int AFTER_SS = 11;
      int cases;
      String input, don;
      Boolean check = true;



      Scanner reader = new Scanner(System.in);  // Reading from System.in
      don = reader.nextLine();
      cases = Integer.parseInt(don);
      if(cases>21){
        check = false;
      }

      if(check){
       for(int i = 1; i < cases+1; i++){
          input = reader.nextLine();
          if(input.matches("^[a-z ]+$")){
            char[] in = input.toCharArray();
            if(in.length < 1000){
              for(int j = 0; j < in.length; j++){
                if(j+1 < in.length){
                  if((in[j]==' ') && (in[j+1]==' ')){
                    check = false;
                  }
                }
              }
              if(check){
                initial.add(input);
              }
              else{
                System.out.println("error");
              }
            }
            else{
              System.out.println("error");
            }
          }
        }

        for(int i = 0; i < initial.size(); i++){
          if(initial.get(i).contains(SIMON_SAYS)){
            String order = initial.get(i).substring(AFTER_SS,initial.get(i).length());
            result.add(order);
          }
          else{
            String empty = "\n";
            result.add(empty);
          }
        }
        System.out.println(result);
      }
      else{
        System.out.println("error");
      }
    }
}
