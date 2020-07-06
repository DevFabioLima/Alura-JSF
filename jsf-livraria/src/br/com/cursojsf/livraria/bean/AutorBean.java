package br.com.cursojsf.livraria.bean;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.cursojsf.livraria.modelo.Autor;
import br.com.cursojsf.livraria.util.RedirectView;

@ManagedBean
public class AutorBean {

	private Autor autor = new Autor();
	

	
	public Autor getAutor() {
		return autor;
	}

	public RedirectView gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		this.autor = new Autor();

		return new RedirectView("livro");

	}
}
