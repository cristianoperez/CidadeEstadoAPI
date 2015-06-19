package br.com.cristiano.estado;

import java.util.List;

import br.com.cristiano.cidade.Cidade;

public enum Estado {
	AC(1, "AC", "Acre"),
	AL(2, "AL", "Alagoas"),
	AP(3, "AP", "Amapá"),
	AM(4, "AM", "Amazonas"),
	BA(5, "BA", "Bahia"),
	CE(6, "CE", "Ceará"),
	DF(7, "DF", "Distrito Federal"),
	ES(8, "ES", "Espírito Santo"),
	GO(9, "GO", "Goiás"),
	MA(10, "MA", "Maranhão"),
	MT(11, "MT", "Mato Grosso"),
	MS(12, "MS", "Mato Grosso do Sul"),
	MG(13, "MG", "Minas Gerais"),
	PA(14, "PA", "Pará"),
	PB(15, "PB", "Paraíba"),
	PR(16, "PR", "Paraná"),
	PE(17, "PE", "Pernambuco"),
	PI(18, "PI", "Piauí"),
	RJ(19, "RJ", "Rio de Janeiro"),
	RN(20, "RN", "Rio Grande do Norte"),
	RS(21, "RS", "Rio Grande do Sul"),
	RO(22, "RO", "Rondônia"),
	RR(23, "RR", "Roraima"),
	SC(24, "SC", "Santa Catarina"),
	SP(25, "SP", "São Paulo"),
	SE(26, "SE", "Sergipe"),
	TO(27, "TO", "Tocantins");

	private Estado(int id, String sigla, String nome) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}
	
	private int id;
	private String sigla;
	private String nome;
	
	public int getId() {
		return id;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	
	public static Estado getEstado(String sigla){
		for(Estado e : Estado.values()){
			if(e.getSigla().equalsIgnoreCase(sigla)){
				return e;
			}
		}
		return null;
	}
	
}
