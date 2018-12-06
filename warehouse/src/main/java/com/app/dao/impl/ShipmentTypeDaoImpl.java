package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveShipmentType(ShipmentType shmtType) {
		return (Integer)ht.save(shmtType);
	}

	@Override
	public void updateShipmentType(ShipmentType shmtType) {
		ht.update(shmtType);
		
	}

	@Override
	public void deleteShipmentType(Integer stId) {
		ht.delete(new ShipmentType(stId));
		
	}

	@Override
	public ShipmentType getOneShipmentType(Integer stId) {
		
		return ht.get(ShipmentType.class, stId);
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		
		return ht.loadAll(ShipmentType.class);
	}

}
