package Decorator;
public class DecoratorDriver{
  public static void main(String[] args){
    
    Sandwish basicSandwish = new Fool(new Salt(new BasicSandwish())); 

    System.out.printf("Desription %s",basicSandwish.getDescription()); 

    System.out.printf("Cost %s",basicSandwish.getCost()); 
  }
}