 //figura es bastract porque tiene al menos un metodo abstracto
 public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;
    
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        return base * altura;
    }

    public int ladosFigura(){
        return 4;
    }

    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar){
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