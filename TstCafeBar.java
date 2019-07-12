import static java.lang.System.out;

public class TstCafeBar {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Rui", 60, 75);
    Cliente cliente2 = new Cliente("Ana", 65, 77);
    Cliente cliente3 = new Cliente("João", 66, 80);    
    Cafe cafe1 = new Cafe(80);
    Cafe cafe2 = new Cafe(64);
    Cafe cafe3 = new Cafe(78);
    
    try {
      out.print("A servir café ao cliente #1 : "); cliente1.toma(cafe1);
      out.print("A servir café ao cliente #2 : "); cliente2.toma(cafe2);
      out.print("A servir café ao cliente #3 : "); cliente3.toma(cafe3);      
    } 
      catch(CafeQuenteException ece2) { out.println(ece2.getMessage());   }
       catch(CafeFrioException ece3) { out.println(ece3.getMessage());   }
       catch(CafeException ece1) { out.println(ece1.getMessage());   }
  }
}
