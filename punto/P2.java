package punto;

/**
 * Esta clase representa un punto en 2D, con las coordenadas "x" y "y".
 * @author Jorge Stiven Pachón García.
 */
public class P2 {
    //Atributos
    private int x;
    private  int y;

    /**
     * Crea una instancia en el objeto P2.
     */
    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia en el objeto P2.
     * @param x Coordenada en X
     * @param y Coordenada en Y
     */

    public P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia en el objeto P2.
     * @param p2 Es un objeto de punto de dos dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getY();

    }

    /**
     * Retorna el valor de x
     * @return Coordenada x
     */
    public int getX(){
        return this.x;

    }

    /**
     * Asigna el valor de la coordenada x
     * @param x coordenada x
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Retorna el valor de la coordenada y
     * @return coordenada y.
     */
    public int getY(){
        return this.y;
    }

    /**
     * Asigna el valor de la coordenada y
     * @param y coordenada y
     */
    public void getY(int y){
        this.y = y;
    }

    /**
     * Calcula la distqancia entre 2 puntos.
     * @param x coordenada x del otro punto.
     * @param y coordenada y del otro punto.
     * @return distancias.
     */
    public double calcularDistancia(int x, int y){
        double distancia;
        double diferenciaCuadradosX = Math.pow(this.x -x, 2);
        double diferenciaCuadradosY = Math.pow(this.y -y, 2);

        distancia = Math.sqrt(diferenciaCuadradosX+diferenciaCuadradosY);
        return  distancia;
    }

    /**
     * Calcula la distancia de los 2 puntos de un objeto
     * @param p2 objeto de tipo P2
     * @return distancia.
     */
    public double calcularDistancia(P2 p2){
        return this.calcularDistancia(p2.getX(),p2.getY());
    }

    /**
     *
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("x: ").append(this.x).append(" y: ").append(this.y);
        return sb.toString();
    }
}
