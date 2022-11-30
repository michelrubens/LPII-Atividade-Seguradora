package classes;

public class Endereco {

	public Endereco(String enderecoCompleto, String cidade, String estado, String cep) {
		super();
		// TODO Auto-generated constructor stub
		this.enderecoCompleto = enderecoCompleto;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	private String enderecoCompleto;
	private String cidade;
	private String estado;
	private String cep;
	
	// Getters and Setters
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	// Métodos
	public void imprimirEndereco() {
		System.out.println(getEnderecoCompleto());
	}
	

}
