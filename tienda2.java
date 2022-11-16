package tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public static void main(String[] args)
    {
        //Propiedades//
		Vista vista = new Vista();
		vista.bienvenida();
                Sucursal tienda = new Sucursal();
                Factura factura = new Factura();
		Carrito carrito = new Carrito();
                int opcion = 0;
                
        while (opcion != 6)
		{
			opcion = vista.MenuOpciones();
			
			if (opcion == 1)
			{
				//Ver Productos
				vista.VerInfo();
			}

			else if (opcion == 2)
			{
				//Hacer Compras
				vista.funcionalidades();
			}
            
            else if (opcion == 3)
			{
				//Ver Carrito
                                carrito.Compras();
			}

            else if (opcion == 4)
			{
                                factura.Datos();
				//Ver Factura
			}

            else if (opcion == 5)
			{
                                tienda.CrearSucursales();
				//Ver Sucursales
			}

            else if (opcion == 6)
			{
				//Salir
				vista.despedida();
			}
			
			else
			{
				vista.opcionInvalida();
			}	
		}
    }
}
