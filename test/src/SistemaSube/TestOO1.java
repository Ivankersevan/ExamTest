package SistemaSube;

import java.time.*;

public class TestOO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaSube sistema = new SistemaSube();
		
		try {
			sistema.agregarUsuario(44444444L, "Ivan", "Kersevan", false);
			sistema.agregarUsuario(55555555L, "Lucia", "Gomez", false);
			sistema.agregarUsuario(66666666L, "Oscar", "ElRespuestas", true);
			sistema.agregarUsuario(55555555L, "Roberto", "Gonzales", true);
		}catch(Exception e){
			System.out.println("\nError: "+e.getMessage());
		}
		
		sistema.mostrarUsuarios();
		
		try {
			sistema.agregarTarjeta("1234567890", sistema.traerUsuario(44444444L));
			sistema.agregarTarjeta("1234567891", sistema.traerUsuario(55555555L));
			sistema.agregarTarjeta("1234567892", sistema.traerUsuario(66666666L));
			sistema.agregarTarjeta("1234", sistema.traerUsuario(55555555L));
		}catch(Exception e) {
			System.out.println("\nError: "+e.getMessage());
		}
		
		sistema.mostrarTarjetas();
		
		sistema.agregarViaje(sistema.traerTarjeta("1234567890"), "linea 1", "medio 1", LocalDateTime.of(LocalDate.of(2023, 9, 01), LocalTime.of(10, 0)), 50);
		sistema.agregarViaje(sistema.traerTarjeta("1234567890"), "linea 2", "medio 2", LocalDateTime.of(LocalDate.of(2023, 9, 01), LocalTime.of(10, 30)), 50);
		sistema.agregarViaje(sistema.traerTarjeta("1234567890"), "linea 3", "medio 3", LocalDateTime.of(LocalDate.of(2023, 9, 02), LocalTime.of(9, 0)), 100);
		
		sistema.agregarViaje(sistema.traerTarjeta("1234567891"), "linea 1", "medio 1", LocalDateTime.of(LocalDate.of(2023, 9, 01), LocalTime.of(10, 0)), 60);
		sistema.agregarViaje(sistema.traerTarjeta("1234567891"), "linea 2", "medio 2", LocalDateTime.of(LocalDate.of(2023, 9, 02), LocalTime.of(15, 0)), 60);
		sistema.agregarViaje(sistema.traerTarjeta("1234567891"), "linea 3", "medio 3", LocalDateTime.of(LocalDate.of(2023, 9, 03), LocalTime.of(22, 0)), 60);
		
		sistema.agregarViaje(sistema.traerTarjeta("1234567892"), "linea 1", "medio 1", LocalDateTime.of(LocalDate.of(2023, 9, 01), LocalTime.of(10, 0)), 100);
		sistema.agregarViaje(sistema.traerTarjeta("1234567892"), "linea 2", "medio 2", LocalDateTime.of(LocalDate.of(2023, 9, 02), LocalTime.of(10, 30)), 100);
		sistema.agregarViaje(sistema.traerTarjeta("1234567892"), "linea 3", "medio 3", LocalDateTime.of(LocalDate.of(2023, 9, 03), LocalTime.of(10, 0)), 100);
		
		sistema.mostrarViajes(LocalDateTime.of(LocalDate.of(2023, 9, 02), LocalTime.of(10, 30)), LocalDateTime.of(LocalDate.of(2023, 9, 03), LocalTime.of(10, 0)));
		
		sistema.mostrarTotalViajes(LocalDateTime.of(LocalDate.of(2023, 9, 02), LocalTime.of(10, 30)), LocalDateTime.of(LocalDate.of(2023, 9, 03), LocalTime.of(10, 0)));
	}

}
