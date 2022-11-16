package tienda;

public class Smartphone extends Producto{
    //Propiedades
    public int NumCelular;
    public String Enlace;

    //Metodos

    //Constructor//
    public Smartphone()
    {
        NumCelular = 0;
        Enlace = null;
    }

    //Getters//
    public int getNumCelular()
    {
        return NumCelular;
    }

    public String getEnlace()
    {
        return Enlace;
    }


    //Setters//
    public void setNumCelular(int NumCelular)
    {
        this.NumCelular = NumCelular;
    }

    public void setEnlace(String Enlace)
    {
        this.Enlace = Enlace;
    }

    //Información//

    public void Info()
    {
        precio = 1500;
        serie = "SKU IPHONE1264BL";
        marca = "Apple";
        fecha = "08/11/2022";
        marcador = "https://www.max.com.gt/apple-iphone-12-64gb-liberado-azul-apple-iphone1264bl";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del Smartphone es: " + precio + " " + "dolares");
        System.out.println("La serie del Smartphone es: " + serie);
        System.out.println("La marca del Smartphone es: " + marca);
        System.out.println("La fecha del Smartphone es: " + fecha);
        System.out.println("El marcador del Smartphone es: " + marcador);
    }
    
    //Funcionalidades//
    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi iPhone");
    }
    
    public void TomarFotos()
    {
        System.out.println("Se tomo una foto desde mi iPhone");
    }

    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi iPhone");
    }

    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi iPhone");
    }

    public void Portable()
    {
        System.out.println("Mi iPhone es muy facil de transportar");
    }
}