package br.com.jsf.primefaces.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CadastroTorcedorBean {
	
	private String timeFavorito;
	private String[] timesFavoritos;


	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}
	
	public String[] getTimesFavoritos() {
		return timesFavoritos;
	}
	
	public void setTimesFavoritos(String[] timesFavoritos) {
		this.timesFavoritos = timesFavoritos;
	}
}
