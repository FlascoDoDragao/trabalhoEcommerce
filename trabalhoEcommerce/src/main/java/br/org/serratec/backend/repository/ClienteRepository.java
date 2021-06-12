package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.backend.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public Cliente findByEmail(String email);
}
