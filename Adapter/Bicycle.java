package Adapter;
//Adaptee offering the same features but exposing a different interface.
public class Bicycle {
    public void pedal(){
        System.out.println("Bicycle starts moving");
    }
    public void stop(){
        System.out.println("Bicycle stopped");
    }
    public void ringBell(){
        System.out.println("Bicycle bell is ringing ");
    }
}
