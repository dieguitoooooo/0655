import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (Diego Antonio Almonte) 
 * @version (a version number or 27.02.2018)
 */
public class AnalizadorAccesosAServidor
{
    // creamos un array list de objetos acceso
    private  ArrayList<Acceso> archivoLog;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        // initialise instance variables
        archivoLog = new ArrayList<>();
    }

    /**
     * Metodo que informa del nombe del log a leer.
     * Lee el archivo log y lo analiza.
     * @param  Intoduce el nombre de el archivo log
     * @return     no devuelve nada
     */
    public void analizarArchivoDeLog(String nombreArchivo)
    {
        try{
            File log = new File(nombreArchivo + ".log");
            Scanner sc = new Scanner(log);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] arrayDeString = linea.split(" ");
                archivoLog.add(new Acceso (Integer.parseInt(arrayDeString[0]),Integer.parseInt(arrayDeString[1]),Integer.parseInt(arrayDeString[2]),Integer.parseInt(arrayDeString[3]),Integer.parseInt(arrayDeString[4])));
            }
            sc.close();
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
