//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("UC1 - Test Case 1.1 (Max at 1st position): " + new MaximumFinder<>(30, 20, 10).testMaximum());
        System.out.println("UC1 - Test Case 1.2 (Max at 2nd position): " + new MaximumFinder<>(20, 30, 10).testMaximum());
        System.out.println("UC1 - Test Case 1.3 (Max at 3rd position): " + new MaximumFinder<>(10, 20, 30).testMaximum());

        System.out.println("UC2 - Test Case 2.1 (Max at 1st position): " + new MaximumFinder<>(30.5f, 20.2f, 10.1f).testMaximum());
        System.out.println("UC2 - Test Case 2.2 (Max at 2nd position): " + new MaximumFinder<>(20.2f, 30.5f, 10.1f).testMaximum());
        System.out.println("UC2 - Test Case 2.3 (Max at 3rd position): " + new MaximumFinder<>(10.1f, 20.2f, 30.5f).testMaximum());

        System.out.println("UC3 - Test Case 3.1 (Max at 1st position): " + new MaximumFinder<>("Peach", "Apple", "Banana").testMaximum());
        System.out.println("UC3 - Test Case 3.2 (Max at 2nd position): " + new MaximumFinder<>("Apple", "Peach", "Banana").testMaximum());
        System.out.println("UC3 - Test Case 3.3 (Max at 3rd position): " + new MaximumFinder<>("Apple", "Banana", "Peach").testMaximum());

        System.out.println("UC4 - Test Case 4.1 (Max from multiple integers): " + new MaximumFinder<>(30, 20, 10, 40, 25).testMaximum());
        System.out.println("UC4 - Test Case 4.2 (Max from multiple floats): " + new MaximumFinder<>(30.5f, 20.2f, 10.1f, 35.0f).testMaximum());
        System.out.println("UC4 - Test Case 4.3 (Max from multiple strings): " + new MaximumFinder<>("Peach", "Apple", "Banana", "Mango").testMaximum());

        new MaximumFinder<>(30, 20, 10).testMaximum();
    }

}