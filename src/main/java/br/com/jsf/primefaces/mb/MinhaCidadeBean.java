package br.com.jsf.primefaces.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MinhaCidadeBean {
	private String cidadeNatal;
	private List<String> todasCidades;
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public List<String> getTodasCidades() {
		return todasCidades;
	}

	public void setTodasCidades(List<String> todasCidades) {
		this.todasCidades = todasCidades;
	}

	public MinhaCidadeBean() {
		this.todasCidades = new ArrayList<String>();
		this.todasCidades.add("Uberlândia-MG");
		this.todasCidades.add("Uberaba-MG");
		this.todasCidades.add("Belo Horizonte-MG");
		this.todasCidades.add("São Paulo-SP");
		this.todasCidades.add("Campinas-SP");
		this.todasCidades.add("São José dos Campos-SP");
		this.todasCidades.add("Rio de Janeiro-RJ");
		this.todasCidades.add("Goiânia-GO");
		this.todasCidades.add("Fortaleza-CE");
		this.todasCidades.add("Porto Velho-RO");
	}
}
