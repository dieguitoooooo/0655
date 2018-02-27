
/**
 * Esta clase representa un único acceso al servidor.
 * 
 * @author (Diego Antonio Almonte Zarzuela) 
 * @version (a version number or 27.02.2018)
 */
public class Acceso
{
    // variables de instancia
    private int dia;
    private int mes;
    private int anno;
    private int hora;
    private int minutos;

    /**
     * Constructor de la clase Acceso
     * @param devuelve el dia, mes, anno, hora y minutos cuando accedemos. 
     */
    public Acceso(int dia, int mes, int anno, int hora, int minutos)
    {
        // inicializacion de las variables
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.hora = hora;
        this.minutos = minutos;
    }

    /**
     * Este metodo devuelve la hora
     * @param no hay
     * @return     devuelve la hora 
     */
    public int getHora()
    {
        return hora;
    }
}
