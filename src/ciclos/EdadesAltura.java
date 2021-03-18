package ciclos;

import javax.swing.JOptionPane;

public class EdadesAltura {

	public static void main(String[] args) {
		
		int edad, mayores = 0, suma_edad = 0, contador=0;
		float altura, altos = 0, suma_altura= 0, promedio_altura, promedio_edad;
		
		for(int i=1; i<=5; i++) {
			
			edad=Integer.parseInt(JOptionPane.showInputDialog("Digita la edad del alumno: "+i+".-"));
			altura=Float.parseFloat(JOptionPane.showInputDialog("Digita la altura del alumno: "+i+".-"));
			
			if(edad>18) {
				mayores++;
			}
			if(altura>1.75) {
				altos++;
			}
			
			suma_edad+=edad;
			suma_altura+=altura;
			
			contador++;
			
		}
		
		promedio_edad= (float) suma_edad/contador;
		promedio_altura=suma_altura/contador;
		
		System.out.println("El promedio de la edad de los alumnos es: "+promedio_edad);
		System.out.println("El promedio de la altura es: "+promedio_altura);
		System.out.println("La cantidad de alumnos mayores a 18 años es: "+ mayores);
		System.out.println("La cantidad de alumnos mayores a 1.75 mts es: "+altos);
		
		
		
		
		

	}

}
