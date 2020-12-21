package Singleton;
public class SingletonDriver{
  public static void main(String[] args){
    LazySingleton inst1 = LazySingleton.getInstance();
    System.out.println(inst1.hashCode());
    System.out.println(inst1.getLetter());  
    LazySingleton inst2= LazySingleton.getInstance();
    System.out.println(inst2.hashCode());
    System.out.println(inst2.getLetter());

  }
}