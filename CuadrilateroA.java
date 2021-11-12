/**
* @author Brigada 4
*/
public class CuadrilateroA extends PoligonoA{
  private int alfa, beta;
  private float a,b,  base,altura;
  /**
  * Constructor
  */
  public CuadrilateroA(){}
  /**
  * Setter Base A
  * @param base Recibe la base del cuadrilatero A(float)
  */
  public void setBase(float base){
    this.base = base;
  }
  /**
  * Getter Base A 
  * @return base: Regresa la base del cuadrilatero A(float)
  */    
  public float getBase(){
    return base;
  }
  /**
  * Setter Altura
  * @param altura Recibe la altura del cuadrilatero A(float)
  */

  public void setAltura(float altura){
    this.altura = altura;
  }
  /**
  * Getter Altura  
  * @return altura: Regresa la altura del cuadrilatero A(float)
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
    return "CuadrilateroA{base="+base+" altura="+altura+"}";
  }
     
}