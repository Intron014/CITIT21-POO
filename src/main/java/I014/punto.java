package I014;


public class punto
{
    private final double PI = 3.14159265358979323846;
    private float coordenadaX;
    private float coordenadaY;
    private static int numInstancias;
    static {
        numInstancias = 0;
    }

    public punto(float coordenadaX, float coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public String devuelveCoordenadas()
    {
        String valueX = String.valueOf(coordenadaX);
        String valueY = String.valueOf(coordenadaY);

        return "(" + valueX + ", " + valueY + ")";

    }
    public void setCoordenadas(float coordenadaX, float coordenadaY)
    {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public void setCoordenadaX(float coordenadaX)
    {
        this.coordenadaX = coordenadaX;
    }
    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
