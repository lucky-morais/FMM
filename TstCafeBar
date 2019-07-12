import static java.lang.System.out;

public class TstCafeBar {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Rui", 60, 75);
    Cafe cafe = new Cafe(67);
    try {
      cliente1.tomaCafe(cafe);
    } catch(CafeException ce) { out.println(ce.getMessage());   }
      catch(CafeQuenteException ce) { out.println(ce.getMessage());   }
       catch(CafeFrioException ce) { out.println(ce.getMessage());   }
  }
}
