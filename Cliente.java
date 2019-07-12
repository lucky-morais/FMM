import java.lang.Math;

public class Cliente {
    private String nome;
    private int quente;
    private int frio;
    
    public Cliente(String nome, int quente, int frio) {
        this.nome = nome;
        this.quente = quente;
        this.frio = frio;
    }

    public boolean toma(Cafe cafe) throws CafeQuenteException,
                                        CafeFrioException,
                                        CafeException {
    int decisao = 1 + (int) (Math.random()*100);
    if(decisao < 10) 
      throw new CafeException("Mal tirado!");
    
    int temp = cafe.getTemp();
    if(temp > quente)
      throw new CafeQuenteException("Quente + " + (temp - quente));
    if(temp < frio)
      throw new CafeQuenteException("Frio - " + (frio - temp));      
      
    return true;
  }
}
