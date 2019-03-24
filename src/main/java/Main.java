import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println(Base64.getEncoder().encodeToString("Hello, hard core space!".getBytes()));
    }
}
