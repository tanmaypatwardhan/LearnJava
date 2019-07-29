import java.util.*;
public class Fibonnaci {
  public static void main(String[] args){
    int n = 4;
    System.out.println(n - 1);
  }


  static int fib(int n){
    if(n == 1 || n == 0) return 1;
    else return (fib(n - 2) + fib(n - 1));
  }
}
