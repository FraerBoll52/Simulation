package Entitys;

import java.util.Objects;

public class Coordinates {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }



    public int getY() {
        return y;
    }



    public boolean isAt(int x, int y) {
        return this.x == x && this.y == y;
    }
    //для отладки


    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
