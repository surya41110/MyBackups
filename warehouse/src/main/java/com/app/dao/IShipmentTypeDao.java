package com.app.dao;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeDao {
	public Integer saveShipmentType(ShipmentType shmtType);

	public void updateShipmentType(ShipmentType shmtType);

	public void deleteShipmentType(Integer stid);

	public ShipmentType getOneShipmentType(Integer stid);

	public List<ShipmentType> getAllShipmentTypes();
}
