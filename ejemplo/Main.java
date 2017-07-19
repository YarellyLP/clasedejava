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
      
      System.out.println("La multiplicacion de 20 y 10 es: ");
       int m = mult(20, 10);
      System.out.println(m);
      
      System.out.println("La divicion de 20 y 10 es: ");
       int d = div(20, 10);
      System.out.println(d);
    }
    
    public static int suma(int nu, int nd){
      return nu + nd;
    }
    
    public static int resta(int nu, int nd){
      return nu - nd;
    }
    
     public static int mult(int nu, int nd){
      return nu * nd;
    }
    
    public static int div(int nu, int nd){
      return nu / nd;
    }
    
  }