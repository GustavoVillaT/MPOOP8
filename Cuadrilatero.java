/**
* @author Brigada 4
*/
public class Cuadrilatero extends Poligono{
  private int alfa, beta;
  private float a,b,  base,altura;
  /**
  * Constructor
  */
  public Cuadrilatero(){}
  /**
  * Setter Base
  * @param base Recibe la base del cuadrilatero(float)
  */
  public void setBase(float base){
    this.base = base;
  }
  /**
  * Getter Base  
  * @return base: Regresa la base del cuadrilatero A(float)
  */  
  public float getBase(){
    return base;
  }
  /**
  * Setter Altura
  * @param altura Recibe la altura del cuadrilatero(float)
  */
  public void setAltura(float altura){
    this.altura = altura;
  }
  /**
  * Getter Altura  
  * @return altura: Regresa la altura del cuadrilatero(float)
  */  
  public float getAltura(){
    return altura;
  }

  @Override
  public double area(){ 
    return base*altura;
  }

  @Override
  public double perimetro(){
    return 2*(a+b);
  }

  @Override
  public String toString(){
    return "Cuadrilatero{base="+base+" altura="+altura+"}";
  }
     
}