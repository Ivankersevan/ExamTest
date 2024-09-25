package SistemaSube;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class SistemaSube {

	//atributos
	private List <Usuario> usuarios;
	private List <Tarjeta> tarjetas;
	private List <Viaje> viajes;

	//constructor
	public SistemaSube() {
		this.tarjetas = new ArrayList <Tarjeta>();
		this.usuarios = new ArrayList <Usuario>();
		this.viajes = new ArrayList <Viaje>();
	}

	//metodos getter y setter
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	public Usuario traerUsuario(long dni) {
		for(int i = 0;i<this.usuarios.size();i++) {
			if(this.usuarios.get(i).getDni()==dni) {
				return this.usuarios.get(i);
			}
			
		}
		return null;
	}
	
	public boolean agregarUsuario(Long dni,String nombre,String apellido,boolean descuento)throws Exception {
		
		if(this.traerUsuario(dni)!=null) {
			throw new Exception("Ya existe un usuario con este dni");
		}
		int id=1;
		
		if(!this.usuarios.isEmpty()) {
			id=this.usuarios.size()+1;
		}
		
		Usuario aux = new Usuario(id,dni,nombre,apellido,descuento);
		
		this.usuarios.add(aux);
		
		return true;
	}
	
	public boolean agregarTarjeta(String codigo,Usuario usuario)throws Exception {
		
		if(codigo.length()<10) {
			throw new Exception("El codigo tiene menos de 10 digitos");
		}
		
		if(!this.tarjetas.isEmpty()) {
			if(this.traerTarjeta(codigo) != null) {
				throw new Exception("Ya existe una tarjeta con este codigo");
			}
		}
		
		Tarjeta aux = new Tarjeta(codigo,usuario);
		
		this.tarjetas.add(aux);
		
		return true;
	}
	
	public Tarjeta traerTarjeta(String codigo) {
		for(int i = 0;i<this.tarjetas.size();i++) {
			if(this.tarjetas.get(i).getCodigo()==codigo) {
				return this.tarjetas.get(i);
			}
			
		}
		
		return null;
	}
	
	public boolean agregarViaje(Tarjeta tarjeta,String linea,String medio,LocalDateTime tiempo,double precio) {
		
		Viaje aux = new Viaje(tarjeta,linea,medio,tiempo,precio);
		
		this.viajes.add(aux);
		
		return true;
	}
	
	public List <Viaje> traerViaje(LocalDateTime desde,LocalDateTime hasta) {
		List <Viaje> aux = new ArrayList <Viaje>();
		System.out.println();
		for(int i = 0;i<this.viajes.size();i++) {
			if((this.viajes.get(i).getFechaHoraViaje().isEqual(desde) || this.viajes.get(i).getFechaHoraViaje().isAfter(desde)) && (this.viajes.get(i).getFechaHoraViaje().isEqual(hasta) || this.viajes.get(i).getFechaHoraViaje().isBefore(hasta))) {
				aux.add(this.viajes.get(i));
			}
		}
		
		return aux;
	}
	
	public double calcularTotalFacturadoEntreFechas(LocalDateTime desde,LocalDateTime hasta) {
	
		List <Viaje> aux = this.traerViaje(desde, hasta);
		double suma = 0;
		
		for(int i = 0; i<aux.size();i++) {
			suma += aux.get(i).totalAPagar();
		}
		
		return suma;
	}
	
	public void mostrarUsuarios() {
		for(int i = 0;i<this.usuarios.size();i++) {
			System.out.println(this.usuarios.get(i).toString()); 
		}
	}
	
	public void mostrarTarjetas() {
		for(int i = 0;i<this.tarjetas.size();i++) {
			System.out.println(this.tarjetas.get(i).toString()); 
		}
	}
	
	public void mostrarViajes(LocalDateTime desde,LocalDateTime hasta) {
		List <Viaje> aux = this.traerViaje(desde, hasta);
		for(int i = 0;i<aux.size();i++) {
			System.out.println(aux.get(i).toString());
		}
	}
	
	public void mostrarTotalViajes(LocalDateTime desde,LocalDateTime hasta) {
		System.out.println("\nEl total entre las fechas es: $"+this.calcularTotalFacturadoEntreFechas(desde, hasta));
	}
}
