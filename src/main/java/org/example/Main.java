import org.example.VideoConverter;

public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        String mp4 = converter.convert("funny-cats.ogg", "mp4");
        System.out.println("Result: " + mp4);
        System.out.println();
        String ogg = converter.convert("tutorial.mp4", "ogg");
        System.out.println("Result: " + ogg);
    }
}