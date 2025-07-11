package br.edu.iftm.vitrino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.vitrino.entity.Usuario;
import br.edu.iftm.vitrino.repository.UsuarioRepository;

@RestController
@CrossOrigin(origins = "https://trabalhoppw.vercel.app/")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

}
