public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        return (base * altura) / 2;
    }

    public int ladosFigura(){
        return 3;
    }

    //implementacion del metodo compareTo
    public int compareTo(Triangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        int ladosPorComparar = rectPorComparar.ladosFigura();
        double miArea = this.calcularArea();
        int misLados = this.ladosFigura();
        if(miArea == areaPorComparar){
            if(misLados == ladosPorComparar)
                return 1;
            else if(misLados > ladosPorComparar)
                return 0;
            else
                return -1;
        }
        else if (miArea > areaPorComparar)
            return 0;
        else
            return -1;
    }
}
