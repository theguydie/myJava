public class Triple<T> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T min() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            Comparable min = (Comparable) first;
            if (min.compareTo(second) > 0) {
                min = (Comparable) second;
            }
            if (min.compareTo(third) > 0) {
                min = (Comparable) third;
            }
            return (T) min;
        } else {
            throw new IllegalArgumentException("Elements are not comparable");
        }
    }

    public T max() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            Comparable max = (Comparable) first;
            if (max.compareTo(second) < 0) {
                max = (Comparable) second;
            }
            if (max.compareTo(third) < 0) {
                max = (Comparable) third;
            }
            return (T) max;
        } else {
            throw new IllegalArgumentException("Elements are not comparable");
        }
    }

    public double mean() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
            return sum / 3;
        } else {
            throw new IllegalArgumentException("Elements are not numbers");
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(1, 10, 100);
        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());
    }
}
