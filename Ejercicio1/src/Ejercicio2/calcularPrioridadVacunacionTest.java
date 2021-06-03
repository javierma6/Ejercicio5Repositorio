package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calcularPrioridadVacunacionTest {

	@Test
	public void testCalcularPrioridadVacunacion() {
		calcularPrioridadVacunacion testCalcular= new calcularPrioridadVacunacion();
		int CalcularPrioridad= testCalcular.calcularPrioridadVacunacion(60,1 );
		int resultado= 2;
		Assertions.assertEquals(CalcularPrioridad,resultado);
	}
				
			
	@Test
	public void testCalcularPrioridadVacunacion2() {
		calcularPrioridadVacunacion testCalcular= new calcularPrioridadVacunacion();
		int CalcularPrioridad= testCalcular.calcularPrioridadVacunacion();
		int resultado= 2;
		Assertions.assertEquals(CalcularPrioridad,resultado);
		
		
	}
	


}
