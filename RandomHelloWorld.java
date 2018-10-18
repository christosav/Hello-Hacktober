import java.io.IOException;
import java.util.Random;

public class HelloWorld {

    public static void main (String[] args) throws IOException {
        System.out.println(randomString(-229985452) + " " + randomString(-147909649));
    }
	
	public static String randomString (int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        int random;

        while ((random = rand.nextInt(27)) > 0) {
            sb.append((char) ('`' + random));
        }

        return sb.toString();
    }
}
