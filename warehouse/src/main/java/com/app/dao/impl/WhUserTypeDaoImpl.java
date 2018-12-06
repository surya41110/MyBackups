package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveWhUserType(WhUserType whuType) {

		return (Integer) ht.save(whuType);
	}

	@Override
	public void updateWhUserType(WhUserType whuType) {

		ht.update(whuType);

	}

	@Override
	public void deleteWhUserType(Integer wtId) {
		ht.delete(new WhUserType(wtId));

	}

	@Override
	public WhUserType getOneWhUserType(Integer wtId) {

		return ht.get(WhUserType.class, wtId);
	}

	@Override
	public List<WhUserType> getAllWhUserTypes() {

		return ht.loadAll(WhUserType.class);
	}

}
