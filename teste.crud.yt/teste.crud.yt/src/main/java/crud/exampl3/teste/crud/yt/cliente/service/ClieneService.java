package crud.exampl3.teste.crud.yt.cliente.service;

import crud.exampl3.teste.crud.yt.cliente.entity.Cliente;
import crud.exampl3.teste.crud.yt.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClieneService {

    @Autowired
   private ClienteRepository clienteRepository;

    //também serve para atualizar cliente
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Integer id){
        return clienteRepository.findById(id);
    }
    public void removerPorId(Integer id){
        clienteRepository.deleteById(id);
    }
}
