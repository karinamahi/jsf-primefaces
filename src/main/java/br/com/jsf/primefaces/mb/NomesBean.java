package br.com.jsf.primefaces.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;


@ManagedBean
@SessionScoped
public class NomesBean {
	 private String nome;
	 private List<String> nomes = new ArrayList<>();
	 
	 private HtmlInputText inputNome;
	 private HtmlCommandButton botaoAdicionar;
		
	public void adicionar() {
		this.nomes.add(nome);
		
		//desativa campo e botão quando mais que três nomes forem adicionados
		if (this.nomes.size() > 3 ) {
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Muitos nomes adicionados");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	
}
