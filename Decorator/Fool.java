
package Decorator;
public class Fool extends SandwishDecorator{
  
  public Fool(Sandwish sandwish){
    super(sandwish);
  }
@Override 
  public double getCost(){
    return super.getCost() + 3;
  }
  @Override
  public String getDescription(){
    return super.getDescription()+ " ,Fool"; 
  }
  
}