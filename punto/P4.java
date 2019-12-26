package punto;

/**
 * Esta clase representa un punto en 4D.
 * @author Jorge Stiven Pachón García.
 */
public class P4 extends P3 {

    //Atributos
    private int w;

    /**
     * Crea un objeto de tipo P4
     */
    public P4(){
        super();
        this.w = 0;
    }

    /**
     * Crea un objeto de tipo P3
     * @param x coordenada x
     * @param y coordenada y
     * @param z coordenada z
     * @param w coordenada w
     */
    public P4(int x, int y, int z, int w){
        super(x,y,z);
        this.w = w;
    }

    /**
     * crea un objeto de tipo P4
     * @param p3 objeto tipo p3
     * @param z coordenada z
     * @param w coordenada w
     */
    public P4(P3 p3, int w){
        super(p3);
        this.w = w;
    }

    /**Crea un objeto de tipo P4
     * @param p4 un objeto de 4 coordenadas
     */
    public P4(punto.P4 p4){
        this(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    public int getW(){
        return w;
    }

    /**
     * Asigna un valor a la coordenada w
     * @param w
     */
    public void setW(int w){
        this.w = w;
    }

    /**
     * Calcula la distancia entre 2 puntos de 4 dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @param w coordenada Z del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z, int w) {
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(getZ() - z, 2);
        double diferenciaCuadradosW = Math.pow(this.w - w, 2);

        distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY + diferenciaCuadradosZ + diferenciaCuadradosW);
        return distancia;
    }

    /**
     * Calcula la distancia entre 2 puntos en 4 dimensiones
     * @param p3 objeto de tipo P3
     * @param w coordenada w
     * @return distancia
     */
    public double calcularDistancia( P3 p3, int w){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ(), w);

    }

    /**
     * Calcular distancia entre 2 puntos en 4 dimensiones
     * @param p4 objeto de tipo P4
     * @return distancia
     */
    public double calcularDistancia (punto.P4 p4){
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    public String toString(){
        String s = super.toString() + " W: " + this.w;
        return s;
    }
}
