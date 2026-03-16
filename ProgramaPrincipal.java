package Hundir_la_flota;
import java.util.*;
public class Hundir_la_flota_version4 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		char[][] tablero = {
				{'~', '~', '~', '~', '~'},
				{'~', '~', '~', '~', '~'},
				{'~', '~', '~', '~', '~'},
				{'~', '~', '~', '~', '~'},
				{'~', '~', '~', '~', '~'}
		};
		
		int contadorBarco = 0;
		
		int filaBarco;
		int columnaBarco;
		
			char barco1;
		
			System.out.println("Coloca el barco");
			
			System.out.println("Introduce la fila del primer barco: ");
			filaBarco = sc.nextInt();
			
			System.out.println("Introduce la columna del primer barco: ");
			columnaBarco = sc.nextInt();
			
			barco1 = 'B';
	
			tablero[filaBarco][columnaBarco] = barco1;
			
			contadorBarco++;
		
		
			
			char barco2;
			
			System.out.println("Coloca el barco");
			
			System.out.println("Introduce la fila del segundo barco: ");
			filaBarco = sc.nextInt();
			
			System.out.println("Introduce la columna del segundo barco: ");
			columnaBarco = sc.nextInt();
			
			barco2 = 'B';
	
			tablero[filaBarco][columnaBarco] = barco2;
			
			contadorBarco++;
			
		char barco3;
			
			System.out.println("Coloca el barco");
			
			System.out.println("Introduce la fila del tercer barco: ");
			filaBarco = sc.nextInt();
			
			System.out.println("Introduce la columna del tercer barco: ");
			columnaBarco = sc.nextInt();
			
			barco3 = 'B';
	
			tablero[filaBarco][columnaBarco] = barco3;
			
			contadorBarco++;
			
			char barco4;
			
			System.out.println("Coloca el barco");
			
			System.out.println("Introduce la fila del cuarto barco: ");
			filaBarco = sc.nextInt();
			
			System.out.println("Introduce la columna del cuarto barco: ");
			columnaBarco = sc.nextInt();
			
			barco4 = 'B';
	
			tablero[filaBarco][columnaBarco] = barco4;
			
			contadorBarco++;
			
			char barco5;
			
			System.out.println("Coloca el barco");
			
			System.out.println("Introduce la fila del quinto barco: ");
			filaBarco = sc.nextInt();
			
			System.out.println("Introduce la columna del quinto barco: ");
			columnaBarco = sc.nextInt();
			
			barco5 = 'B';
	
			tablero[filaBarco][columnaBarco] = barco5;
			
			contadorBarco++;
		
		int fila = 0;
		int columna = 0;
		boolean hundido = false;
		int intentos = 8;
		
		do {			
			System.out.println("Introduce una fila");
			fila = sc.nextInt();
			
			System.out.println("Introduce una columna");
			columna = sc.nextInt();
			
			if(barco1 != tablero[fila][columna] || barco2 != tablero[fila][columna] || barco3 != tablero[fila][columna] || barco4 != tablero[fila][columna] || barco5 != tablero[fila][columna]) {
				System.out.println("AGUA");
				
				char fallo = 'O';
				tablero[fila][columna] = fallo;
				intentos--;
				
			} else {
				System.out.println("HUNDIDO");
				
				char disparo = 'X';
				tablero[fila][columna] = disparo;
				
				contadorBarco--;
				
			}
			
			for(int i = 0; i < tablero.length; i++) {
				for(int j = 0; j < tablero[i].length; j++) {
					System.out.print(tablero[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Numero de intentos: " + intentos);	
			System.out.println("Te quedan " + contadorBarco + " barcos");
			
		
		} while(intentos > 0 && contadorBarco > 0);
		
		System.out.println();
		
		if(contadorBarco == 0) {
			System.out.println("Has ganado, felicidades");
		} else {
			System.out.println("Has perdido");
		}
	}
}
