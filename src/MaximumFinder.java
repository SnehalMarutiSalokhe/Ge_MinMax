import java.util.Arrays;

class MaximumFinder<T extends Comparable<T>> {

    private T[] values;


    public MaximumFinder(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        return findMaximum(values);
    }

    public static <T extends Comparable<T>> T findMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
