package br.com.vendas.chamado;

import org.springframework.data.repository.CrudRepository;

public interface ChamadoRepository extends CrudRepository<Chamado, Integer> {
	public Chamado findOneByCodigo(Integer codigo);
}