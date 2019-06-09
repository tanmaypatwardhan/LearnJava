

public class factorial {
  public static void main(String[] args) {
    System.out.println(calcFactorial(4));
  }


  public static int calcFactorial(int n){

    if(n == 1 || n == 0){
      return 1;
    }

    return n * calcFactorial(n - 1);
  }
}
