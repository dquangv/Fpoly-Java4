package com.poly.lab7.bai2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


public class UserDAO {
	private EntityManager em = JpaUtils.getEntityManager();

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		em.close();
		super.finalize();
	}

	public User3 create(User3 entity) {
		em = JpaUtils.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException();
		}
	}

	public User3 update(User3 entity) {
		em = JpaUtils.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException();
		}
	}

	public User3 remove(String id) {
		em = JpaUtils.getEntityManager();
		try {
			User3 entity = this.findById(id);
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException();
		}
	}

	public User3 findById(String id) {
		em = JpaUtils.getEntityManager();
		User3 entity = em.find(User3.class, id);
		return entity;
	}

	public List<User3> findAll() {
		em = JpaUtils.getEntityManager();
		String jpql = "SELECT o FROM User o";
		TypedQuery<User3> query = em.createQuery(jpql, User3.class);
		List<User3> list = query.getResultList();
		return list;
	}
}