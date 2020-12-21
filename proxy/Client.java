package proxy;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
         List<String> sites = Arrays.asList("Google","facebook","twitter","youtube","spring");

         ISP internet = new InternetProxy();

         for(String site:sites){
             System.out.println( internet.serverSite(site));
         }

    }
}
