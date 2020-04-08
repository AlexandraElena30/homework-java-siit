package testOOP;

import java.util.ArrayList;

public class DrawingTool {
    private ArrayList<Shapes> listShapes;

    public DrawingTool() {
        this.listShapes = new ArrayList<Shapes>();
    }


    public void addShape(Shapes s){
        if(this.listShapes.contains(s))
    /*
        for (Shapes shape: this.listShapes) {
            if (shape instanceof Circle && )
                c++;
            if (shape instanceof Rectangle)
                r++;
            if (shape instanceof Square)
                s++;
            if (shape instanceof Triangle)
                t++;


     */
            System.out.println("Tried to add duplicate");
        else
            this.listShapes.add(s);
        }
        public void printAll(){
        for(Shapes s:this.listShapes)
            System.out.println(s.getClass()+" "+s.toString());

        }


    double sumPerimeter() {
        double value = 0;
       // int c = 0, r = 0, s = 0, t = 0;
        for (Shapes shape : this.listShapes) {
            /*
            if (shape instanceof Circle) {
                c++;
                if (c >= 2)
                    continue;
            }
            if (shape instanceof Rectangle) {
                r++;
                if (r >= 2)
                    continue;
            }
            if (shape instanceof Square) {
                s++;
                if (s >= 2)
                    continue;
            }
            if (shape instanceof Triangle) {
                t++;
                if (t >= 2)
                    continue;
            }

             */
            value = value + shape.perimeter();
        }
        /*
        if (c > 1 || s > 1 || t > 1 || r > 1) {
            System.out.println("We have at least two shapes of the same type ");
        }
        */
        return value;
    }

     double sumArea() {
        double value = 0;
       // int c = 0, r = 0, s = 0, t = 0;
        for (Shapes shape : this.listShapes) {
            /*
            if (shape instanceof Circle) {
                c++;
                if (c >= 2)
                    continue;
            }
            if (shape instanceof Rectangle) {
                r++;
                if (r >= 2)
                    continue;
            }
            if (shape instanceof Square) {
                s++;
                if (s >= 2)
                    continue;
            }
            if (shape instanceof Triangle) {
                t++;
                if (t >= 2)
                    continue;
            }


             */
            value = value + shape.surface();
        }
        /*
        if (c > 1 || s > 1 || t > 1 || r > 1) {
            System.out.println("We have at least two shapes of the same type ");
        }

         */

        return value;
    }

    /*
    public static void main(String[] args) {
        DrawingTool t = new DrawingTool();
        t.addShape(new Circle(2));
        t.addShape(new Circle(3));
        t.addShape(new Circle(2));
        t.addShape(new Square(4));
        System.out.println(t.sumArea());
        System.out.println(t.sumPerimeter());
        /*
        System.out.println("The surface sum of distinct shapes is " + String.format("%.2f",
                (t.sumArea(new Circle(3),new Triangle(2,3,4), new Circle(7)))));

        System.out.println("The perimeter sum of distinct shapes is " + String.format("%.2f",
                (t.sumPerimeter(new Circle(3),new Rectangle(2,3), new Circle(2), new Triangle(1,2,3)))));

        System.out.println(new Circle(3).equals(new Circle(5)));


    }
    */


}
