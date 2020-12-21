package proxy;

public class Etisalat implements ISP{
    private int browsingSpeed = 5;
    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com",url);
    }
}
