package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import bean.User;
import utils.JpaUtils;


public class UserDAO {
	private static EntityManager em;

	@Override
	protected void finalize() throws Throwable {
		em.close();
//		super.finalize();
	}

	public static User create(User entity) {
		em = JpaUtils.getEntityManager();
		
		try {
			// Bắt đầu Transaction
			em.getTransaction().begin();

			// Insert vào CSDL
			em.persist(entity);

			em.getTransaction().commit();// Chap nhận kết quả thao tác
			System.out.println("Thêm thành công");
			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback(); // Hủy thao tác
			e.printStackTrace();
			System.out.println("Action fail");
			return null;
		} finally {
			em.close();
		}

	}

	public static User update(User entity) {
		em = JpaUtils.getEntityManager();
		
		try {
			em.getTransaction().begin(); // Bắt đầu Transaction

			// Cập nhật thực thể
			em.merge(entity);

			em.getTransaction().commit();// Chấp nhận kết quả thao tác
			System.out.println("Cập nhật thành công");

			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback(); // Hủy thao tác
			System.out.println("Action fail");

			return null;
		} finally {
			em.close();
		}

	}

	public User remove(String id) {
		em = JpaUtils.getEntityManager();
		User entity = this.findById(id);
		
		try {
			em.getTransaction().begin(); // Bắt đầu Transaction

			em.remove(entity);
			em.getTransaction().commit();// Chấp nhận kết quả thao tác
			System.out.println("Xóa thành công");

			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback(); // Hủy thao tác
			System.out.println("Action fail");

			return null;
		} finally {
			em.close();
		}

	}

	public List<User> findAll() {
		em = JpaUtils.getEntityManager();
		List<User> list = null;

		try {
			// Câu lệnh truy vấn JPQL
			String jpql = "SELECT o FROM User o";

			// Tạo đối tượng truy vấn
			TypedQuery<User> query = em.createQuery(jpql, User.class);

			// Truy vấn
			list = query.getResultList();

			// Hiển thị kết quả truy vấn
			for (User user : list) {
				System.out.println(">>Fullname: " + user.getFullname());
				System.out.println(">>IsAdmin? " + user.getAdmin());
			}

			return list;
		} catch (Exception e) {
			System.out.println("Action fail");

			return null;
		} finally {
			em.close();
		}

	}

	public User findById(String id) {
		em = JpaUtils.getEntityManager();
		User entity = em.find(User.class, id);

		return entity;
	}
	
	public List<User> findPage(int page, int size) {
        EntityManager em = JpaUtils.getEntityManager();
        try {
            String jpql = "SELECT u FROM User u";
            TypedQuery<User> query = em.createQuery(jpql, User.class);
            query.setFirstResult(page * size);
            query.setMaxResults(size);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public long count() {
        EntityManager em = JpaUtils.getEntityManager();
        try {
            String jpql = "SELECT COUNT(u) FROM User u";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }

}
