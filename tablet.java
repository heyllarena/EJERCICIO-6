package tienda;

public class Tablets extends Producto
{
    //Propiedades
    public String Enlace;

    //Metodos

    //Constructor//
    public Tablets()
    {
        Enlace = null;
    }

    //Getters//
    public String getEnlace()
    {
        return Enlace;
    }


    //Setters//
    public void setEnlace(String Enlace)
    {
        this.Enlace = Enlace;
    }

    //Información//
    public void Info()
    {
        precio = 2000;
        serie = "SKU MTFR2LZA";
        marca = "Apple";
        fecha = "08/11/2022";
        marcador = "https://www.max.com.gt/apple-ipad-pro-129-wifi-1tb-space-gray-apple-mtfr2lza";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio de la tablet es: " + precio + " " + "dolares");
        System.out.println("La serie de la tablet es: " + serie);
        System.out.println("La marca de la tablet es: " + marca);
        System.out.println("La fecha de la tablet es: " + fecha);
        System.out.println("El marcador de la tablet es: " + marcador);
    }
    
    //Funcionalidades//
    public void TomarFotos()
    {
        System.out.println("Tomando una foto desde mi tablet");
    }

    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi tablet");
    }

    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi tablet");
    }
    
    public void Portable()
    {
        System.out.println("Mi tablet es muy facil de transportar");
    }
}