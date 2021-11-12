public class Flauta extends InstrumentoViento{
  //Podemos sobreescribir algun metodo y agragar funcionalidad

  public Flauta(){

  }
  /**
  * limpiar
  * @return String "Limpiando la flauta"
  */
  public void limpiar(){
    System.out.println("Limpiando la flauta");
  }

  @Override
  public String tipoInstrumento(){
    return "Flauta";
  }

  @Override
  public String toString(){
    return "Flauta{}";
  }
}