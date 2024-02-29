package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Usuario;
import co.edu.icesi.viajes.icesiviajes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer aInteger) {
        return usuarioRepository.findById(aInteger);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public void delete(Usuario entity) throws Exception {
        usuarioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer aInteger) throws Exception {
        usuarioRepository.deleteById(aInteger);
    }

    @Override
    public void validate(Usuario entity) throws Exception {

    }

    @Override
    public Long count() {
        return usuarioRepository.count();
    }
}
