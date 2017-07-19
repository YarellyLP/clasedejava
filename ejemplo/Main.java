  package ejemplo;

  public class Main {
    
    public static void main(String[] args){
      System.out.println("Hola Mundo");
      System.out.println("La suma de 20 y 30 es: ");
      int s = suma(20, 30);
      System.out.println(s);
      System.out.println("La resta de 20 y 10 es: ");
       int r = resta(20, 10);
      System.out.println(r);
    }
    
    public static int suma(int nu, int nd){
      return nu + nd;
    }
    
    public static int resta(int n1, int n2){
      return n1 - n2;
    }
  }