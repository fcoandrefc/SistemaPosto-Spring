package com.serasa.transforme.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serasa.transforme.modelo.Cliente;

@Repository
public interface RepositorioClientes extends JpaRepository<Cliente, Long> {

}
	