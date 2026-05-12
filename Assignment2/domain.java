package Assignment2;

public class domain {
    public static void main(String args[]){
        String url = "https://www.example.com";
        String domain = url.substring(url.indexOf("://") + 3, url.indexOf(".com"));
        System.out.println("Domain: " + domain);
    }
}
