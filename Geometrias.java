import java.util.Arrays;

public class Geometrias {
    public static void main(String[] args){
        Figura[] figuras = new Figura[4];

        figuras[0] = new Triangulo(23, 8);
        figuras[1] = new Circulo(12);
        figuras[2] = new Rectangulo(85, 8);
        figuras[3] = new Triangulo(65, 30);
        
        Arrays.sort(figuras);
    }
}
