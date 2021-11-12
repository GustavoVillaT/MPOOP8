public class Triangulo extends Poligono{
  private int alfa, beta, gama;
  private float a,b,c;
  private float base, altura;
  /**
  * Constructor
  */
  public Triangulo(){}
  /**
  * Setter Base 
  * @param base Recibe la base del triangulo(float)
  */
  public void setBase(float base){
    this.base = base;
  }
  /**
  * Getter Base 
  * @return base: Regresa la base del triangulo(float)
  */    
  public float getBase(){
    return base;
  }
  /**
  * Setter Altura 
  * @param altura Recibe la altura del triangulo(float)
  */
  public void setAltura(float altura){
    this.altura=altura;
  }
  /**
  * Getter Altura 
  * @return altura: Regresa la altura del triangulo(float)
  */    
  public float getAltura(){
    return altura;
  }

  @Override
  public double area(){
    return base*altura/2;
  }

  @Override
  public double perimetro(){
    return a+b+c;
  }

  @Override
  public String toString(){
    return "Triangulo{base="+base+" altura="+altura+"}";
  }

  
}