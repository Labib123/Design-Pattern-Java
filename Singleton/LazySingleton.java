package Singleton;

import java.util.Collections;
import java.util.Arrays;

import java.util.List;
public class LazySingleton{
  
  private String[] LETTER = {"A","B","C","D"}; 
  private List<String> data = Arrays.asList(LETTER);
  private StringBuilder build = new  StringBuilder(); 
  private static LazySingleton instance; 

  
  private  LazySingleton(){
    Collections.shuffle(data);
  }

  public static synchronized LazySingleton getInstance(){
    if(instance == null){
      instance = new LazySingleton(); 
    }
    return instance;
  }
  public String getLetter(){
    for(String item:data){
      build.append(" " +item);
    }
    return build.toString();
  }
}