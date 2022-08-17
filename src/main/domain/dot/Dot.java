package main.domain.dot;

public class Dot {
    private final int r;
    private final int g;
    private final int b;

    public Dot(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
