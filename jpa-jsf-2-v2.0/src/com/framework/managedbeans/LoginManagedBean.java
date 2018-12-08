package com.framework.managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.framework.Dao.UsuarioDao;
import com.framework.model.Usuario;

@ManagedBean(name ="loginMB")
@ViewScoped
public class LoginManagedBean {

	private UsuarioDao usuarioDAO = new UsuarioDao();
	private Usuario usuario = new Usuario();
	
	
	public String enviar() {
		usuario = usuarioDAO.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		if(usuario == null) {
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Usuario não encontrado!","Erro no Login!"));
			return null;
		}else {
			return "/listagemUsuarios";
		}
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario() {
		this.usuario = usuario;
	}
}
