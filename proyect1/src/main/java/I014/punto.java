package I014;


public class punto
{
    private float coordenadaX;
    private float coordenadaY;

    public punto(float coordenadaX, float coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String devuelveCoordenadas()
    {
        String valueX = String.valueOf(coordenadaX);
        String valueY = String.valueOf(coordenadaY);

        return valueX + " " + valueY;

    }
}
