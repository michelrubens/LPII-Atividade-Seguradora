package classes;

public abstract class Seguro {

	public Seguro() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected int numApolice;
	protected String nome;
	protected Endereco endereco;
	protected float valor;
	protected float premio;
	
	public int getNumApolice() {
		return numApolice;
	}
	public void setNumApolice(int numApolice) {
		this.numApolice = numApolice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getPremio() {
		return premio;
	}
	public void setPremio(float premio) {
		this.premio = premio;
	}
	
	public void imprimirSeguro() {}
}
