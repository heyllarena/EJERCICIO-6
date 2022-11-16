package tienda;


public class Celulares extends Producto
{
    //Propiedades
    public int NumCelular;

    //Metodos

    //Constructor//
    public Celulares()
    {
        NumCelular = 0;
    }

    
    //Getters//
    public int getNumCelular()
    {
        return NumCelular;
    }

    
    //Setters//
    public void setNumCelular(int NumCelular)
    {
        this.NumCelular = NumCelular;
    }

    //Información//
    public void Info()
    {
        precio = 60;
        serie = "SKU HIU962";
        marca = "Hisense";
        fecha = "08/11/2022";
        marcador = "https://www.max.com.gt/hisense-u962-liberado-gris-hisense-hiu962";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del celular es: " + precio + " " + "dolares");
        System.out.println("La serie del celular es: " + serie);
        System.out.println("La marca del celular es: " + marca);
        System.out.println("La fecha del celular es: " + fecha);
        System.out.println("El marcador del celular es: " + marcador);
    }
    
    //Funcionalidades//
    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi celular");
    }

    public void Portable()
    {
        System.out.println("Mi celular es muy facil de transportar");
    }
}