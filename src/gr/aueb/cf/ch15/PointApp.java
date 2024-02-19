package gr.aueb.cf.ch15;

public class PointApp {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();
        Point2D p4 = new Point2D();
        Point3D p5 = new Point3D(1,5,9);


        p2.movePlusOne();
        p3.movePlus10();

        //downcast p2
        ((Point2D) p2).setY(5);

        doMovePlus10(p);
        doMovePlus10(p2);
        doMovePlus10(p3);
        doMovePlus10(p4);
        doMovePlus10(p5);
        System.out.println(p.toString()+p2.toString());
        System.out.println(p4.toString() + " "+ p3.toString());
        System.out.println(p5.toString());



    }

    public static void doMovePlus10 (Point point) {
        point.movePlus10();
    }
}
