package lambda;

/**
 * Aufgabe 10 Lambda
 * @author  Stefan Nyffenegger
 * @author  Marco Wyssmann
 * @author  Benjamin Steffen
 * @version 1.0
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Before Java8, too much code for too little to do")).start();
    }
}
