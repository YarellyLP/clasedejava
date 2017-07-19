  package ejemplo;

  public class Main {
    
    public static void main(String[] args){
      System.out.println("Hola Mundo");
      System.out.println("La suma de 20 y 30 es: ");
      int s = suma(20, 30);
      System.out.println(s);
    }
    
    public static int suma(int nu, int nd){
      return nu + nd;
    }
  }