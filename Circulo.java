public class Circulo extends Figura implements Comparable<Figura>{
    private double radio;
    
    public Circulo(double pradio){
        radio = pradio;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        double pi = Math.PI;
        double radioele = Math.pow(radio, 2);
        return pi * radioele;
    }

    public int ladosFigura(){
        return 1;
    }

    //implementacion del metodo compareTo
    public int compareTo(Figura rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        int ladosPorComparar = rectPorComparar.ladosFigura();
        double miArea = this.calcularArea();
        int misLados = this.ladosFigura();
        if(miArea == areaPorComparar){
            if(misLados == ladosPorComparar)
                return 0;
            else if(misLados > ladosPorComparar)
                return 1;
            else
                return -1;
        }
        else if (miArea > areaPorComparar)
            return 1;
        else
            return -1;
    }
}
