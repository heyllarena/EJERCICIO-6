package tienda;

public class Desktop extends Laptop{
    //Información//
    public void Info()
    {
        precio = 1000;
        serie = "SKU 47B78LA";
        marca = "HP";
        fecha = "08/11/2022";
        marcador = "https://www.max.com.gt/desktop-hp-pavilion-gaming-tg01-1508lam-ryzen-5-4600g-ram-8gb-256-gb-ssd-hewlet-packard-47b78la";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del Desktop es: " + precio + " " + "dolares");
        System.out.println("La serie del Desktop es: " + serie);
        System.out.println("La marca del Desktop es: " + marca);
        System.out.println("La fecha del Desktop es: " + fecha);
        System.out.println("El marcador del Desktop es: " + marcador);
    }
    
    //Funcionalidades//
    public void EjecutarJuego()
    {
        System.out.println("Se esta ejecutando un juego en mi Desktop");
    }

    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi Desktop");
    }

    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi Desktop");
    }
}