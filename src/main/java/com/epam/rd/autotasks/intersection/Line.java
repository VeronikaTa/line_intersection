package com.epam.training.student_veronika_tarasova.line_intersection.src.main.java.com.epam.rd.autotasks.intersection;
import com.epam.rd.autotasks.intersection.Point;
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
