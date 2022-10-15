package com.softgraf.farmacia.repositorio;

import java.io.Serializable;
import java.util.List;

/*
 * pacotes para escopos
 * javax.faces.bean  -> bean JSF
 * javax.faces.view  -> bean JSF (Primefaces)
 * javax.enterprise.context -> bean CDI  (pacote Weld)
 */

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.softgraf.farmacia.entity.Cliente;

/*
 * Um repositório representa uma coleção de objetos de um tipo específico.
 * É um mediador entre a camada de negócios e o acesso a dados
 * Deve fornecer métodos para adicionar, remover, atualizar, buscar, listar, etc.
 */


@RequestScoped
public class RepositorioClientes implements Serializable {

	private static final long serialVersionUID = -5841325902476402508L;
	private EntityManager em;
	
	// todo bean necessita de um construtor padrão
	public RepositorioClientes() {
		// TODO Auto-generated constructor stub
	}
	
	public RepositorioClientes(EntityManager em) {
		this.em = em;
	}
	
	public void adicionar(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(cliente);
		tx.commit();
	}
	
	public void removerPorId(Integer id) {
		Cliente cliente = em.find(Cliente.class, id);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(cliente);
		tx.commit();
	}
	
	public Cliente buscarPorId(Integer id) {
		return em.find(Cliente.class, id);
	}
	
	public void atualizar(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(cliente);
		tx.commit();
	}
	
	public List<Cliente> todos(){
		// JPQL (JPA Query Language)
		TypedQuery<Cliente> query = em.createQuery("from cliente", Cliente.class);
		return query.getResultList();
	}
	
	// lista todas as cidades que tem o nome parecido (like) com o parâmetro passado
	public List<String> pesquisarCidades(String cidade){
		// JPL para filtar cidades
		TypedQuery<String> query = 
				em.createQuery("select distinct cidade from Cliente where upper(cidade) like upper(:cidade)", 
						String.class);
		query.setParameter("cidade", "%" + cidade + "%");
		return query.getResultList();
	}
	
	

}
