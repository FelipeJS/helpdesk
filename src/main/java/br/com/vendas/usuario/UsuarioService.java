package br.com.vendas.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario registrarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public Usuario obterUsuario(Integer codigo) {
    return usuarioRepository.findOne(codigo);
  }

  public Iterable<Usuario> obterTodos() {
    return usuarioRepository.findAll();
  }
}
