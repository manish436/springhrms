package com.springhrms.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhrms.dao.JobDAO;
import com.springhrms.model.Employee;
import com.springhrms.model.Job;

@Repository
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long createJob(Job job) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Job updateJob(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJob(String jobId) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJobs() {
		return (List<Job>) sessionFactory.getCurrentSession().createQuery("from Job").list();
	}

	@Override
	public Job getJob(String jobId) {
		return (Job) sessionFactory.getCurrentSession().createQuery("from Job where jobId='"+jobId+"'").uniqueResult();
	}

}