package model;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box<T> other) {
        return value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}