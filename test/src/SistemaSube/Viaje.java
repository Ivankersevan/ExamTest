package SistemaSube;

import java.time.*;

public class Viaje {
	
		//atributos
		private Tarjeta tarjeta;
		private String linea;
		private String medio;
		private LocalDateTime fechaHoraViaje;
		private double precio;
		
		//constructor
		public Viaje(Tarjeta tarjeta,String linea,String medio,LocalDateTime tiempo,double precio) {
			this.fechaHoraViaje = tiempo;
			this.linea = linea;
			this.medio = medio;
			this.precio = precio;
			this.tarjeta = tarjeta;
		}

		//metodos getter y setter
		public Tarjeta getTarjeta() {
			return tarjeta;
		}

		public void setTarjeta(Tarjeta tarjeta) {
			this.tarjeta = tarjeta;
		}

		public String getLinea() {
			return linea;
		}

		public void setLinea(String linea) {
			this.linea = linea;
		}

		public String getMedio() {
			return medio;
		}

		public void setMedio(String medio) {
			this.medio = medio;
		}

		public LocalDateTime getFechaHoraViaje() {
			return fechaHoraViaje;
		}

		public void setFechaHoraViaje(LocalDateTime fechaHoraViaje) {
			this.fechaHoraViaje = fechaHoraViaje;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public String toString() {
			return "Viaje [tarjeta="+this.tarjeta.getCodigo()+", linea="+this.linea+", medio="+this.medio+", fechaHoraViaje="+this.fechaHoraViaje+", precio=$"+this.precio+"]";
		}
		
		public double totalAPagar() {
			if(this.tarjeta.getUsuario().isTieneDescuento()==true){
				return this.precio - ((this.precio/100)*15);
			}
			return this.precio;
		}
}

