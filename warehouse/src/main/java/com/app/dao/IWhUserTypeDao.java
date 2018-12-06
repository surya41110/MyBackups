package com.app.dao;

import java.util.List;

import com.app.model.WhUserType;

public interface IWhUserTypeDao {

	public int saveWhUserType(WhUserType whuType);

	public void updateWhUserType(WhUserType whuType);

	public void deleteWhUserType(Integer wtId);

	public WhUserType getOneWhUserType(Integer wtId);

	public List<WhUserType> getAllWhUserTypes();
}
