package com.epam.rd.autotasks.intersection;

public class Line {
    private int k;
    private int b;
    public Line(int k, int b) {
    this.k = k;
    this.b = b;

    }

    public Point intersection(Line other) {
        int x_intercept = 0;
        int y_intercept = 0;
        Point intersection;

//        int xFirst = (0 - this.b)/this.k;
//        int yFirst = this.b;
//        int xOther = (0 - other.b)/other.k;
//        int yOther = other.b;
        if((other.k - this.k) != 0){
            x_intercept = (this.b - other.b)/(other.k - this.k);
            y_intercept = (other.k * this.b - this.k * other.b) / (other.k - this.k);
            intersection = new Point(x_intercept,y_intercept);
        }
        else{
            intersection = null;
        }
        return intersection;
    }

}
