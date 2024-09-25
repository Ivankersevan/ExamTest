package SistemaSube;

public class Tarjeta {

		//atributos
		private String codigo;
		private Usuario usuario;
		
		//constructor
		public Tarjeta(String codigo,Usuario usuario) {
			this.codigo = codigo;
			this.usuario = usuario;
		}

		//metodos getter y setter
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public String toString() {
			return "Tarjeta [codigo="+this.codigo+", usuario="+this.usuario.getDni()+"]";
		}
		
	
}

