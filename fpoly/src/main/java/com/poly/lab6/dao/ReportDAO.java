package com.poly.lab6.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import com.poly.lab6.bean.Report;
import com.poly.lab6.utils.JpaUtils;

public class ReportDAO {
	private EntityManager em = JpaUtils.getEntityManager();

	public void insert(Report entity) {
		// TODO Auto-generated method stub

	}

	public void update(Report entity) {
		// TODO Auto-generated method stub

	}

	public void delete(String key) {
		// TODO Auto-generated method stub

	}

	public List<Report> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Report findByID(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Report> report() {
		String sqlString = "SELECT new Report(o.video.title,count(o),max(o.likeDate),min(o.likeDate)) FROM Favorite o GROUP BY o.video.title";
		TypedQuery<Report> query = em.createQuery(sqlString, Report.class);
		List<Report> list = query.getResultList();
		return list;
	}

	public List<Report> favoriteByYear(int year) {
		StoredProcedureQuery query = em.createNamedStoredProcedureQuery("Report.favoriteByYear");
		query.setParameter("year", year);
		List<Report> list = query.getResultList();
		return list;
	}
}
