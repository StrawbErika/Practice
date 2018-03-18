import java.io.*;
import java.util.*;
import java.lang.*;

public class Ahh {
    public static void main(String[] args) {
      String screm;
      String reqScrem;
      Boolean go = true;

      Scanner reader = new Scanner(System.in);  // Reading from System.in
      screm =reader.nextLine();
      reqScrem =reader.nextLine();

      char[] cScrem = screm.toCharArray();
      char[] cReqScrem = reqScrem.toCharArray();
      int j = 0;
      for (int i = 0; i < cScrem.length-1; i++){
        if(cScrem[i] == 'h'){
          go = false;
        }
      }

      for (int i = 0; i < cReqScrem.length-1; i++){
        if(cReqScrem[i] == 'h'){
          go = false;
        }
      }


      if((cScrem[cScrem.length-1] == 'h') && go == true){
        if(cScrem.length < cReqScrem.length){
          go = false;
        }
      }

      if(go == true){
        System.out.println("go");
      }
      else{
        System.out.println("no");
      }
    }
}
