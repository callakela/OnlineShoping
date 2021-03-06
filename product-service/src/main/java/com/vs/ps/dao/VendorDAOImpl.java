package com.vs.ps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vs.ps.model.Vendor;

@Repository
@Transactional
public class VendorDAOImpl extends AbstractDAO implements VendorDAO {

	@Override
	public void create(Vendor vendor) {

		entityManager.persist(vendor);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vendor> getAllVendorList() {
		return entityManager.createQuery(" from Vendor").getResultList();
	}

}
