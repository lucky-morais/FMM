public class Cliente {

  public boolean toma(Cafe cafe) throws CafeQuenteException,
                                        CafeFrioException,
                                        CafeException {
    int decisao = 1 + (int) (random()*100);
    if(decisao < 10) 
      throw new CafeException("Mal tirado!");
    
    int temp = cafe.getTemp();
    if(temp > quente)
      throw new CafeQuenteException("Quente + " (temp-quente));
    if(temp < frio)
      throw new CafeQuenteException("Frio - " (temp-frio));      
      
    return true;
  }
}