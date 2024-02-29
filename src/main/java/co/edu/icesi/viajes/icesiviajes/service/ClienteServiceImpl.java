package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Cliente;
import co.edu.icesi.viajes.icesiviajes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer aInteger) {
        return clienteRepository.findById(aInteger);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void delete(Cliente entity) throws Exception {
        clienteRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer aInteger) throws Exception {
        clienteRepository.deleteById(aInteger);
    }

    @Override
    public void validate(Cliente entity) throws Exception {

    }

    @Override
    public Long count() {
        return clienteRepository.count();
    }
}
