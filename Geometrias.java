import java.util.Arrays;

public class Geometrias {
    public static void main(String[] args){
        Rectangulo[] rects = new Rectangulo[4];

        rects[0] = new Rectangulo(2.5, 3.0);
        rects[1] = new Rectangulo(1.7, 2.2);
        rects[2] = new Rectangulo(2.8, 3.1);
        rects[3] = new Rectangulo(3.5, 1.2);

        Circulo[] circs = new Circulo[4];

        circs[0] = new Circulo(3.5);
        circs[1] = new Circulo(1.7);
        circs[2] = new Circulo(2.8);
        circs[3] = new Circulo(3.5);
        
        System.out.println(rects[0].compareTo(rects[3]));

        //Arrays.sort(rects);
    }
}
