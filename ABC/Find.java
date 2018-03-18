import java.io.*;
import java.util.*;
import java.lang.*;

public class Find {
    public int max, min, mid;
    public Find(){

    }
    public int getMax(int x, int y, int z){
      if(x>y && x>z){
        max = x;
      }
      else if((x>y && x<z)||(x<y && y<z)){
        max = z;
      }
      else{
        max = y;
      }
      return max;
    }

    public int getMin(int x, int y, int z){
      if(x<y && x<z){
        min = x;
      }
      else if((x<y && x>z)||(x>y && y>z)){
        min = z;
      }
      else{
        min = y;
      }
      return min;
    }

    public int getMid(int x, int y, int z){
      min = getMin(x, y, z);
      max = getMax(x, y, z);
      if((x!=min) && (x!=max)){
        mid = x;
      }
      else if((y!=min) && (y!=max)){
        mid = y;
      }
      else{
        mid = z;
      }
      return mid;
    }

}
