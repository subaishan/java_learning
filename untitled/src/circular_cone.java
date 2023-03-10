public class circular_cone {
    double high = 0;
    circle cir;
    circular_cone(double high, double bottom_line){
        cir = new circle(bottom_line);
        this.high = high;
    }
    double SetVolume(){
        return cir.SetArea()*this.high/3;
    }
}
