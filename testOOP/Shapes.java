package testOOP;

public abstract class Shapes {

    public abstract double surface();

    public abstract double perimeter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (this instanceof Circle && obj instanceof Circle) {
            Circle c1 = (Circle) this;
            Circle c2 = (Circle) obj;
            if (c1.getRadius() == c2.getRadius())
                return true;

        } else if (this instanceof Rectangle && obj instanceof Rectangle) {
            Rectangle r1 = (Rectangle) this;
            Rectangle r2 = (Rectangle) obj;
            if(r1.getLength() == r2.getLength() && r1.getWidth() == r2.getWidth())
                return true;

        } else if (this instanceof Square && obj instanceof Square) {
            Square s1 = (Square) this;
            Square s2 = (Square) obj;
            if(s1.getSide() == s2.getSide())
                return true;

        } else if (this instanceof Triangle && obj instanceof Triangle) {
            Triangle t1 = (Triangle) this;
            Triangle t2 = (Triangle) obj;
            if(t1.getA() == t2.getA() && t1.getB() == t2.getB() && t1.getC() == t2.getC())
                return true;

        }
        return false;
    }
}
