package com.framework.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.framework.Dao.UsuarioDao;
import com.framework.model.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {
	private UsuarioDao usuarioDAO = new UsuarioDao();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarioListDb = new ArrayList<>();

	public UsuarioDao getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDao usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarioListDb() {
		return usuarioDAO.listarUsuarios();
	}

	public void setUsuarioListDb(List<Usuario> usuarioListDb) {
		this.usuarioListDb = usuarioListDb;
	}

}
