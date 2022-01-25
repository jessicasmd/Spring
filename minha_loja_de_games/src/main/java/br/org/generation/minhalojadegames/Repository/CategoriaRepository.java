package br.org.generation.minhalojadegames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojadegames.Model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

			List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
