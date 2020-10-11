import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lab3 {
    public static void main(String[] args) {
        String hostname = "Unknown";

        try
        {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Hostname can not be resolved");
        }

        System.out.println("\nАндрусь Микита Сергійович\n");
        System.out.println(hostname);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
    }
}
