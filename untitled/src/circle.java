public class circle {
    double bottom_line = 0;

    circle(double i){
        this.bottom_line = i;
    }
    double SetArea(){
        return 3.14*this.bottom_line*this.bottom_line;
    }
    double SetDiameter(){
        return 2*this.bottom_line;
    }
}