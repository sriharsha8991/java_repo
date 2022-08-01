package com.java1;

public class new_area {
    //Implement the following:
    //i. Create a class Shape with radius, length, width, base, height as member data.
    static class shape {
        int radius;
        int length;
        int width;
        int base;
        int height;

        //ii. Write Method area() that finds area of Sphere.
        public void areaOfSphere(int radius) {
            double pie = 3.14;
            System.out.println(4 * pie * (radius * radius)); //4*pie*r^2 pie = 3.142
        }

        // iii. Write Method area() that finds area of Rectangle.
        public void areaOfRectangle(int w, int h) {
            double area = (w * h);
            System.out.println("area of rectangle=" + area); //area = w*h;
        }

        //iv. Write Method area() that finds area of Triangle.
        public void areaOfTriangle(int b, int h) {
            float area = (b * h) / 2;
            System.out.println("area of triangle =" + area);
        }

        //v. Create Main class to call the methods.
        class Mainclass {
            public static void main(String args[]) {
                int radius = 10;
                int length = 4;
                int width = 5;
                int base = 6;
                int height = 10;
                shape s = new shape();
                s.areaOfSphere(radius);
                s.areaOfRectangle(width, height);

                s.areaOfTriangle(base, height);
            }
        }

    }
}
