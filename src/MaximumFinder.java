import java.util.Arrays;

class MaximumFinder<T extends Comparable<T>> {

    private T[] values;

    public MaximumFinder(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        T max = findMaximum(values);
        printMax(max);
        return max;
    }

    public static <T extends Comparable<T>> T findMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }
}
