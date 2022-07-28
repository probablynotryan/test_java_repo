import java.util.Scanner; // import the scanner class

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Who's the fanciest bear around?");
            
            String bearAnswer = myObj.nextLine();
            System.out.println(bearAnswer + ", that's who!");
        }
    } //testpush
}
