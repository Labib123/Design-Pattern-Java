package Decorator;
public class BasicSandwish implements Sandwish{
  
  @Override 
  public double getCost(){
    return 10.0;
  }
  @Override
  public String getDescription(){
    return "Bread"; 
  }
}