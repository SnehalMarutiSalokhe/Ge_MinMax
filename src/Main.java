//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("UC1 - Test Case 1.1 (Max at 1st position): " + MaximumFinder.findMaximum(30, 20, 10));
        System.out.println("UC1 - Test Case 1.2 (Max at 2nd position): " + MaximumFinder.findMaximum(20, 30, 10));
        System.out.println("UC1 - Test Case 1.3 (Max at 3rd position): " + MaximumFinder.findMaximum(10, 20, 30));

        System.out.println("UC2 - Test Case 2.1 (Max at 1st position): " + MaximumFinder.findMaximum(30.5f, 20.2f, 10.1f));
        System.out.println("UC2 - Test Case 2.2 (Max at 2nd position): " + MaximumFinder.findMaximum(20.2f, 30.5f, 10.1f));
        System.out.println("UC2 - Test Case 2.3 (Max at 3rd position): " + MaximumFinder.findMaximum(10.1f, 20.2f, 30.5f));

        System.out.println("UC3 - Test Case 3.1 (Max at 1st position): " + MaximumFinder.findMaximum("Peach", "Apple", "Banana"));
        System.out.println("UC3 - Test Case 3.2 (Max at 2nd position): " + MaximumFinder.findMaximum("Apple", "Peach", "Banana"));
        System.out.println("UC3 - Test Case 3.3 (Max at 3rd position): " + MaximumFinder.findMaximum("Apple", "Banana", "Peach"));
    }
}