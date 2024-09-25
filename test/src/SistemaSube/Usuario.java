package SistemaSube;

public class Usuario {

		//atributos
		private int id;
		private long dni;
		private String nombre;
		private String apellido;
		private boolean tieneDescuento;
		
		//constructor
		public Usuario(int id,long dni,String nombre,String apellido,boolean descuento) {
			this.id = id;
			this.dni = dni;;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tieneDescuento = descuento;
		}
		
		//metodos setter y getter
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public long getDni() {
			return dni;
		}

		public void setDni(long dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public boolean isTieneDescuento() {
			return tieneDescuento;
		}

		public void setTieneDescuento(boolean tieneDescuento) {
			this.tieneDescuento = tieneDescuento;
		}
		
		public String toString() {
			return "Usuario [id="+this.id+", dni="+this.dni+", nombre="+this.nombre+", apellido="+this.apellido+", tiene descuento="+this.tieneDescuento+"]";
		}
		
	
}
