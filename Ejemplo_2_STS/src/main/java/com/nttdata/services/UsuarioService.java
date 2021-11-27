package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public void insertarUsuario(@Valid Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	public List<Usuario> obtenerListaUsuarios() {
		return usuarioRepository.findAllUsuarios();
	}
	
	public List<String> obtenerNombresUsuarios(){
		return usuarioRepository.findAllUsuariosNombres();
	}
	
	public List<Object> obtenerNombresApellidosUsuarios(){
		return usuarioRepository.findAllUsuariosNombresApellidos();
	}
	
	public Usuario encontrarUsuario(Long id) {
		return usuarioRepository.findById(id).get();
	}
	public void eliminarUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
}
