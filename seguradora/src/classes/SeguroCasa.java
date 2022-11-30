package classes;

public class SeguroCasa extends Seguro {

	public SeguroCasa(int numApolice, String nome, Endereco endereco, float valor, float premio,
			int deducaoCasa, int anoConstrucao) {
		super();
		// TODO Auto-generated constructor stub
		this.numApolice = numApolice;
		this.nome = nome;
		this.endereco = endereco;
		this.valor = valor;
		this.premio = premio;
		this.deducaoCasa = deducaoCasa;
		this.anoConstrucao = anoConstrucao;
	}
	private int deducaoCasa;
	private int anoConstrucao;
	
	public int getDeducaoCasa() {
		return deducaoCasa;
	}
	public void setDeducaoCasa(int deducaoCasa) {
		this.deducaoCasa = deducaoCasa;
	}
	public int getAnoConstrucao() {
		return anoConstrucao;
	}
	public void setAnoConstrucao(int anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}
	
	public void imprimirSeguro() {
		System.out.println("\nSeguro: " + getNome() + 
		   		   		   "\nApólice: " + getNumApolice() +
		   		   		   "\nDedução: " + getDeducaoCasa() +
		   		   		   "\nAno de Construção:" + getAnoConstrucao());
	}
	@Override
	public String toString() {
		return "SeguroCasa [deducaoCasa=" + deducaoCasa + ", anoConstrucao=" + anoConstrucao + ", numApolice="
				+ numApolice + ", nome=" + nome + ", endereco=" + endereco + ", valor=" + valor + ", premio=" + premio
				+ "]";
	}
	
}
