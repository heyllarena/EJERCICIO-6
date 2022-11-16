package tienda;


public class Smartwatch  extends Producto
{
    //Propiedades
    public int NumCelular;

    //Metodos

    //Constructor//
    public Smartwatch()
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
        precio = 350;
        serie = "SKU MYDP2LZA";
        marca = "Apple";
        fecha = "08/11/2022";
        marcador = "https://www.max.com.gt/marcas/productos-apple/prendas-electronicas-apple/apple-watch-se-gps-40mm-negro-apple-mydp2lza";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del Smartwatch es: " + precio + " " + "dolares");
        System.out.println("La serie del Smartwatch es: " + serie);
        System.out.println("La marca del Smartwatch es: " + marca);
        System.out.println("La fecha del Smartwatch es: " + fecha);
        System.out.println("El marcador del Smartwatch es: " + marcador);
    }
    
    //Funcionalidades//

    public void TomarFotos()
    {
        System.out.println("Se tomo una foto desde mi Smartwatch");
    }

    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi Smartwatch");
    }

    public void Portable()
    {
        System.out.println("Mi Smartwatch es muy facil de transportar");   
    }
}