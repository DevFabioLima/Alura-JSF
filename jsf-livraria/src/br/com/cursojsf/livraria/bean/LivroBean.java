package br.com.cursojsf.livraria.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.cursojsf.livraria.modelo.Livro;
import br.com.cursojsf.livraria.util.RedirectView;

@ManagedBean
public class LivroBean {
	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void gravarAutor() {
		System.out.println("O nome do autor eh " + this.livro.getAutor());
	}

	public void gravar() {
		System.out.println("Titulo do livro " + this.livro.getTitulo());
		if (livro.getAutor().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage("autor", new FacesMessage("Livro deve ter autor"));
		}
		this.livro = new Livro();
	}

	public void comecaComDigitoUm(FacesContext fc, UIComponent component, Object value) throws ValidatorException {
		String valor = value.toString();
		if (!valor.startsWith("1")) {
			throw new ValidatorException(new FacesMessage("Deveria come�ar com 1"));
		}

	}

	public RedirectView formAutor() {
		System.out.println("Chamando o formul�rio do Autor");
		return new RedirectView("autor");
	}

}
