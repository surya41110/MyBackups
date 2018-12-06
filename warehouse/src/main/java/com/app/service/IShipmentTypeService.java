package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType shmtType);

	public void updateShipmentType(ShipmentType shmtType);

	public void deleteShipmentType(Integer stid);

	public ShipmentType getOneShipmentType(Integer stid);

	public List<ShipmentType> getAllShipmentTypes();
}
