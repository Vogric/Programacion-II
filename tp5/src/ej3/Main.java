//3 - 
//Cooperativa de Agricultores
//Una cooperativa de agricultores requiere un sistema que le aconseje cu�les son los cereales
//que puede sembrar en un determinado lote y qu� lotes pueden ser utilizados para sembrar un
//determinado cereal. 
//Para poder sembrar un cereal en un lote, �ste debe contener determinados
//minerales. Los cereales se clasifican en granos de cosecha gruesa (como girasol, ma�z,...),
//granos de cosecha fina (como trigo, avena,..) y pasturas (como alfalfa, tr�bol subterr�neo,..).
//Un lote satisface los requerimientos de un cereal si contiene todos los minerales que requiere
//ese cereal. Para el caso de las pasturas, poseen la restricci�n adicional de no poder sembrarse
//en lotes menores a una superficie de 50 hect�reas.

//Adicionalmente, los lotes son clasificados como �especiales� cuando contienen ciertos
//minerales de inter�s primario para la cooperativa, y �comunes� cuando contienen s�lo
//minerales secundarios en la composici�n de la tierra. La cooperativa debe poder consultar si
//un lote es com�n o especial.
//Implementar una soluci�n orientada a objetos para este problema que permita determinar:
//1) qu� cereales pueden sembrarse en un determinado lote
//2) en qu� lotes se puede sembrar un determinado cereal
//3) determinar si un lote dado es �especial� o �com�n�.

package ej3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CooperativaAgricultores coop = new CooperativaAgricultores();
		Cereal cereal1 = new Cereal("Maiz");
		Lote lote1 = new Lote("PrimerLote", 90);
		Cereal pastura = new Pastura("Trebol");
		cereal1.agregarMinerales("Sodio");
		lote1.agregarMinerales("Sodio");
		pastura.agregarMinerales("Sodio");
		coop.agregarMineralesEsp("Sodio");
		System.out.println(coop.aptoSiembra(lote1, cereal1));
		System.out.println(coop.aptoSiembra(lote1, pastura));
		System.out.println(coop.esEspecial(lote1));

	}

}
