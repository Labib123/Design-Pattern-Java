
package Observer;
public class ObserverDriver{
  public static void main(String[] args){
     Product phone = new Product("Bana phone");
     Person labib = new Person("Labib"); 
     Person khalid = new Person("khalid"); 
     Person ahmad = new Person("Ahmad"); 


    phone.addObserver(labib); 
    phone.addObserver(ahmad);
    phone.setAvailability(true);
     
  }
}