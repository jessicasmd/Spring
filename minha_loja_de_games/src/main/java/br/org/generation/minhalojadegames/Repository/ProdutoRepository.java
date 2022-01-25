package br.org.generation.minhalojadegames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojadegames.Model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository <Produto, Long>{
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
