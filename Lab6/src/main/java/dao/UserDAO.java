package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import bean.User;
import utils.JpaUtils;

public class UserDAO {
	private EntityManager em = JpaUtils.getEntityManager();

//	public static void main(String[] args) {
//		UserDAO dao = new UserDAO();
//		User u = dao.findByID("Quang");
//		System.out.println(u.getId());
//	}
	
	public void insert(User entity) {
	}

	public void update(User entity) {

	}

	public void delete(String key) {

	}

	public List<User> findAll() {
		String jpql = "SELECT o FROM User o";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		List<User> list = query.getResultList();
		return list;
	}

	public User findByID(String key) {
		User entity = em.find(User.class, key);
		return entity;
	}

	public List<User> findUserLikeVideo(String id) {
		String jpql = "SELECT o.user FROM Favorite o WHERE o.video.id=:vid";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		query.setParameter("vid", id);
		List<User> list = query.getResultList();
		return list;
	}
}
