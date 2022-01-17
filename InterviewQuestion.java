public class MyClass {
    public static void main(String args[]) {
      int max = 100;
      for (int i=7; i<10; i++){
          int j = 1;
          while (i*j < max){
              System.out.println(i*j);
              j++;
          }
          max+=100;
      }
    }
}