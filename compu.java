package tienda;

public class Laptop extends Producto{
    //Propiedades
    public String Enlace;

    //Metodos

    //Constructor//
    public Laptop()
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
        precio = 1000;
        serie = "SKU 95FJ2";
        marca = "Dell";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/laptop-dell-5415-amd-ryzen-5-14-8gb-ram-512gb-ssd-dell-95fj2";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio de la laptop es: " + precio + " " + "dolares");
        System.out.println("La serie de la laptop es: " + serie);
        System.out.println("La marca de la laptop es: " + marca);
        System.out.println("La fecha de la laptop es: " + fecha);
        System.out.println("El marcador de la laptop es: " + marcador);
    }
    
    //Funcionalidades//
    public void EjecutarJuego()
    {
        System.out.println("Se esta ejecutando un juego en mi laptop");
    }

    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi laptop");
    }

    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi laptop");
    }
    
    public void Portable()
    {
        System.out.println("Mi laptop es muy facil de transportar");
    }
}