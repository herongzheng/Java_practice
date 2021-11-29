package code;

/**
 * This is my first JavaDoc
 *
 * @author he, rongzheng
 */
public class JavaDocExample {
    /**
     * This is the main function of JavaDocExample class
     * @param args
     */
    public static void main(String[] args) {
        JavaDocExample.des();
        for (int i = 15; i <= 20; ++i) {
            System.out.println(i);
        }
        }
    /**
     * This print out something to the console
     *
     * @param There is no parameter for this des() method
     * @return It will print out "This is a JavaDoc practice." to the console
     */
    public static void des() {
        System.out.println("This is a JavaDoc practice example.");
    }


}
