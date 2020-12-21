package Observer;

import java.util.*;
public class Product implements Subject{
  private String name;
  private String availability; 
  private List<Observer> observerList; 
  
  public Product(String name){
    this.name = name ; 
    this.observerList = new ArrayList<>(); 
  }
  
  public String getName(){
    return this.name; 
  }
  @Override
  public void addObserver(Observer observer){
    this.observerList.add(observer);
  }
  @Override

  public void removeObserver(Observer observer){
    this.observerList.remove(observer);
  }
  @Override

  public void notifyAllObservers(){
    for(Observer observer: observerList){
        observer.update(availability);
    } 
  }
  public void setAvailability(boolean availabile){
    availability = this.name+ (availabile? " Availabile" : " Not availabile"); 
    notifyAllObservers();
  }
}