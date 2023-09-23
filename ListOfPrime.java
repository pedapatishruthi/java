import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) {

    int low = 23,high = 99;
    for(int i = low;i<= high;i++)
    {
        boolean flag=false;
        for(int j= 2;j<= i/2;j++){
            if(i%j==0){
                flag=true;
            }
        }
    if (!flag)
      System.out.println(i + " is a prime number.");
    else
      System.out.println(i + " is not a prime number.");
  }
}
}
