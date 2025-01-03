class MaximumFinder<T extends Comparable<T>> {

    private T a;
    private T b;
    private T c;

    public MaximumFinder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return findMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
}
