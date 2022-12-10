package com.softgraf.primavera.data.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.softgraf.primavera.data.entity.Cliente;
import com.softgraf.primavera.data.projection.ClienteProjection;

/*
 * JpaRepository extends [PagingAndSortingRepository extends [CrudRepository extends Repository]
 * Logo: JPA Repository é a interface que herda mais métodos
 */

// É possível criar objetos a partir de interfaces?

// Recurso do módulo Spring Data
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

	// métodos personalizados com base no find
	// cria um método para buscar cliente por nome
	List<Cliente> findByNome(String nome);
	
	// acha qualquer nome que contenha nome
	List<Cliente> findByNomeContaining(String nome);
	
	List<Cliente> findByEmailContaining(String email);
	
	// busca com ordenação
	List<Cliente> findByNomeOrderByNomeAsc(String nome);
	List<Cliente> findByNomeContaining(String nome, Sort sort);
	
	// busca com classe aninhada (@Embedded)
	List<Cliente> findByEndereco_Cidade(String cidade);
	List<Cliente> findByEndereco_Estado(String estado);
	List<Cliente> findByEndereco_BairroContaining(String bairro);
	List<Cliente> findByEndereco_CepContaining(String cep);
	
	// busca com paginação (busca paginada)
	Page<Cliente> findAll(Pageable pageable);
	
	// Queries com JPQL
	@Query("SELECT c FROM Cliente c WHERE c.nome = :nomeCliente")
	List<Cliente> findAllByNome(@Param("nomeCliente") String nomeCliente, Pageable pageable);
	// findAllByNome("Joao da Silva", page)
	

	@Query("SELECT c FROM Cliente c WHERE c.nome = :nomeCliente")
	List<Cliente> findAllByNome(@Param("nomeCliente") String nomeCliente, Sort sort);
	
	// consulta SQL nativa
	@Query(value="SELECT c.id, c.nome, c.email FROM Cliente c", nativeQuery = true)
	List<ClienteProjection> findClienteProjecao();
	
/* Exemplos de consultas:
   - Like
   			String nome = "%maria%";
   			List<Cliente> findByNomeLike(String nome);
   			
   - Starting e Ending
   			List<Cliente> findByNomeStartingWith(String nome);
   			List<Cliente> findByNomeEndingWith(String nome);
   			
   - Null e not Null
   			List<Cliente> findByNomeIsNull();    // todos os nomes nulos
   			List<Cliente> findByNomeIsNotNull(); // todos osnomes não nulos
   			
   - Formatação data
   			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   			LocalDate data = LocalDate.parse("26/11/2022", formatador)
   			
   			@Query("SELECT c FROM Cliente c WHERE c.nome = :nome AND c.dataCadastro = :data)
   			List<Cliente> findNomeDataCadastro(@Param("nome") String nome, @Param("data") LocalDate data)
   			
   	- NativeQuery
   			@Query(value="SELECT * FROM Cliente WHERE nome=?1", nativeQuery=true)
   			List<Cliente> findByNome(String nome);
   			
   		
   
	Sites:
	 	www.baeldung.com/spring-data-jpa-query
	 	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa-query-methods
	 
*/
	

}
