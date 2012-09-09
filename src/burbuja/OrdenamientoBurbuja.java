// Ordenamiento de los valores de un arreglo en orden ascendente.
package burbuja;

import java.awt.*;
import javax.swing.*;


public class OrdenamientoBurbuja extends JApplet {
	// inicializar subprograma 
	   public void init()
	   {
	      JTextArea areaSalida = new JTextArea();
	      Container contenedor = getContentPane();
	      contenedor.add( areaSalida );

	      int arreglo[] = { 2, 6, 4, 8, 10, 12, 89, 68, 45, 37 };

	      String salida = "Elementos de datos en su orden original\n";

	      // anexar los valores originales al String salida
	      for ( int contador = 0; contador < arreglo.length; contador++ )
	         salida += "   " + arreglo[ contador ];
	 
	      ordenamBurbuja( arreglo );  // ordenar arreglo

	      salida += "\n\nElementos de datos en orden ascendente\n";

	      // anexar los valores ordenados del arreglo al String salida
	      for ( int contador = 0; contador < arreglo.length; contador++ ) 
	         salida += "   " + arreglo[ contador ];

	      areaSalida.setText( salida );

	   } // fin del m�todo init

	   // ordenar elementos del arreglo con el m�todo burbuja
	   public void ordenamBurbuja( int arreglo2[] )
	   {   
	      // ciclo para controlar n�mero de pasadas
	      for ( int pasada = 1; pasada < arreglo2.length; pasada++ ) { 

	         // ciclo para controlar n�mero de comparaciones
	         for ( int elemento = 0; 
	               elemento < arreglo2.length - 1; 
	               elemento++ ) {

	            // comparar elementos uno a uno e intercambiarlos si 
	            // el primer elemento es mayor que el segundo
	            if ( arreglo2[ elemento ] > arreglo2[ elemento + 1 ] )
	               intercambiar( arreglo2, elemento, elemento + 1 );

	         } // fin del ciclo para controlar las comparaciones

	      } // fin del ciclo para controlar las pasadas

	   } // fin del m�todo ordenamBurbuja

	   // intercambiar dos elementos de un arreglo
	   public void intercambiar( int arreglo3[], int primero, int segundo )
	   {
	      int almacen;  // �rea temporal de almacenamiento para intercambiar

	      almacen = arreglo3[ primero ];         
	      arreglo3[ primero ] = arreglo3[ segundo ];  
	      arreglo3[ segundo ] = almacen;
	   }
}
