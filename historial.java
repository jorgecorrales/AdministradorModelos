public class usuario { 
	
	private int usuarioId = 0;
	private int modeloId = null;
	private String  que = null;
	private int  historia_id = null; 
	private Date cuando = null;
	
	
	// setters

	public void setUsuarioId (int usuarioId){
		
		this.usuarioId = usuarioId;
	}
	
	public void setModeloId(String modeloId){
		this.nombre = nombre;		
	
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;		
	
	}
	
	public void setLogin(String login){
		this.login = login;		
	
	}
	
	public void setPassword(String password){
		this.password = password;		
	
	}
	
	//getters
	
	public int getUsuarioId(){
		
		return usuario_id;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public String getApellido(){
		
		return apellido;
	}
	
	public String getLogin(){
		
		return login;
	}
	
	public String getPassword(){
		
		return password;
	}
	
	public String getStatus(){
		
		return status;
	}
	
	public String getTipoUsuario(){
		
		return tipoUsuario;
	}
	
		
	
}
