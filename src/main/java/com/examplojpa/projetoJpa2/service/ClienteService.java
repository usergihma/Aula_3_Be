package com.examplojpa.projetoJpa2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examplojpa.projetoJpa2.entity.Cliente;
import com.examplojpa.projetoJpa2.repository.ClienteRepository;

@Service
public class ClienteService {

	    private final ClienteRepository clienteRepository;

	    //construtor que recebe a dependencia
	    @Autowired
	    public ClienteService(ClienteRepository ClienteRepository) {
	        this.clienteRepository = ClienteRepository;
	    }

	    public Cliente saveCliente (Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    public Cliente getClienteById(Long id) {
	        return clienteRepository.findById(id).orElse(null);
	    }

	    public List<Cliente> getAllClientes() {
	        return clienteRepository.findAll();
	    }

	    public void deleteCliente(Long id) {
	    	clienteRepository.deleteById(id);
	    }
	}


