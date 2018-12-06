package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;
import com.app.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;

	@Transactional
	public int saveWhUserType(WhUserType whuType) {

		return dao.saveWhUserType(whuType);
	}

	@Transactional
	public void updateWhUserType(WhUserType whuType) {
		dao.updateWhUserType(whuType);

	}

	@Transactional
	public void deleteWhUserType(Integer wtId) {
		dao.deleteWhUserType(wtId);

	}

	@Transactional(readOnly = true)
	public WhUserType getOneWhUserType(Integer wtId) {

		return dao.getOneWhUserType(wtId);
	}

	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserTypes() {

		return dao.getAllWhUserTypes();
	}
}
