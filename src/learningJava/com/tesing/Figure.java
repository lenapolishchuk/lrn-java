package learningJava.com.tesing;

public class Figure {

    private int lengthFigure;
    private int widthFigure;

    public void setFigure(int a, int b) {
        lengthFigure = a;
        widthFigure = b;
    }

    public void setFigure(int a) {
        lengthFigure = a;
        widthFigure = lengthFigure;
    }

    public int squareSquare() {
        int square;
        return square = lengthFigure * widthFigure ;
    }
}

class Square {
    public static void main(String[]args){

        Figure squareSmall = new Figure();
        squareSmall.setFigure(14);
        int  squareSquare = squareSmall.squareSquare();
        System.out.println("Площадь квадрата: "+ squareSquare);

        Figure rectangle = new Figure();
        rectangle.setFigure(10, 4);
        int squareRectangle = rectangle.squareSquare();
        System.out.println("Площадь прямоугольника "+  squareRectangle);
    }


}
