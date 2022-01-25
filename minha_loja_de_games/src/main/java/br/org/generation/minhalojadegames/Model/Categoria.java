package br.org.generation.minhalojadegames.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


    @Entity
	@Table(name="tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)

		private Long id;
		
		@NotBlank(message = "O atributo tipo é Obrigatório")
		@Size (min=10, max=2000, message= "O atributo tipo deve conter no mínimo 10 e no máximo 2000 caracteres" )
		private String tipo; 
		
		@NotBlank(message = "O atributo console é Obrigatório")
		@Size (min=10, max=200, message= "O atributo console deve conter no mínimo 10 e no máximo 200 caracteres")
		private String console;
		
		@OneToMany (mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List <Produto> produto;
		public Long getId() {
			return id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getConsole() {
			return console;
		}
		public void setConsole(String console) {
			this.console = console;
		}
		public List<Produto> getProduto() {
			return produto;
		}
		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		public void setId(Long id) {
			this.id = id;
		}
					
}

