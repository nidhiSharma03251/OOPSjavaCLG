package Assignment2;

public class domain {
    public static void main(String args[]){
        String url = "https://www.example.com";
        System.out.println(url.indexOf("://") + 3);
        System.out.println(url.indexOf(".com"));
        String domain = url.substring(url.indexOf("://") + 3, url.indexOf(".com"));
        System.out.println("Domain: " + domain);
    }
}
