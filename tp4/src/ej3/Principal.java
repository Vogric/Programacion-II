//3 - Sueldos

//Una empresa de inform�tica posee tres tipos de empleados. 

//Los empleados contratados reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. 
//Los empleados por horas extras reciben un monto fijo semanal m�s un monto extra por cada hora trabajada.
//Los empleados por comisi�n reciben un sueldo fijo, m�s un porcentaje por la cantidad de ventas realizadas.

//Implementar un sistema que permita saber cu�nto se le debe pagar a un empleado al finalizar la semana.

package ej3;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado(40);
		EmpleadoHoraExtra empleadoHE = new EmpleadoHoraExtra(40, 2, 7);
		EmpleadoComision empleadoCom = new EmpleadoComision(40, 5, 20);

		System.out.println("Empleado 1: " + empleado1.getSalarioSemanal());
		System.out.println("\nEmpleado Hora extra: " + empleadoHE.getSalarioSemanal());
		System.out.println("\nEmpleado Comision: " + empleadoCom.getSalarioSemanal());

	}

}
