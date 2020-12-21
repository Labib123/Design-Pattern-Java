package Decorator;
public class Salt extends SandwishDecorator{
  
  public Salt(Sandwish sandwish){
      super(sandwish); 
  }

  @Override 
  public double getCost(){
    return super.getCost() + 0.2;
  }
  @Override
  public String getDescription(){
    return super.getDescription()+ " ,salt"; 
  }
} 