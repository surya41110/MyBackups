package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	public HibernateTemplate ht;

	@Override
	public Integer saveOrderMethod(OrderMethod om) {
		
		return (Integer)ht.save(om);
	}

	@Override
	public void updateOrderMethod(OrderMethod om) {
		ht.update(om);
		
	}

	@Override
	public void deleteOrderMethod(Integer omId) {
		ht.delete(new OrderMethod(omId));
		
	}

	@Override
	public OrderMethod getOneOrderMethod(Integer omId) {
	
		return ht.get(OrderMethod.class, omId);
	}

	@Override
	public List<OrderMethod> getAllOrderMethods() {
		
		return ht.loadAll(OrderMethod.class);
	}
}
