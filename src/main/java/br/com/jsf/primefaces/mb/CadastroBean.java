package br.com.jsf.primefaces.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean (name = "cadastro")
@ViewScoped
public class CadastroBean {
	 
	private String mensagem;
	
	public void cadastrar() {
		this.mensagem = "Cadastrado com sucesso";
		System.out.println(this.mensagem);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
