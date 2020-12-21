package proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP{
    private List<String> blockedSites = Arrays.asList("Google","facebook","twitter");
    @Override
    public String serverSite(String url) {
        logSite(url);
        if (blockedSites.contains(url)){
            return "This site is blocked";
        }
        return new Etisalat().serverSite(url);
    }

    public void logSite(String url){
        System.out.printf("[%d] %s%n",System.currentTimeMillis(),url);
    }

}
