package exercicio1;

public class Rectangle {

    double width;
    double height;

    public double Area(){
        return this.width * this.height;
    }

    public double Perimeter(){
        return 2*(this.height + this.width);
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

}
