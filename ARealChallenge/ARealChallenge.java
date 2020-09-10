import java.io.*;
import java.util.*;
import java.lang.Math.*;
import java.math.BigDecimal;

public class ARealChallenge {
    public static void main(String[] args) {
      double givenArea;
      double root;


      Scanner reader = new Scanner(System.in);  // Reading from System.in
      System.out.println("Area: ");
      givenArea =reader.nextDouble();

      // DecimalFormat df = new DecimalFormat();
      // df.setMaximumFractionDigits(16);

      root = Math.sqrt(givenArea);
      root = root*4;
      // System.out.println(df.format(root));
      System.out.println(root);

    }

}
