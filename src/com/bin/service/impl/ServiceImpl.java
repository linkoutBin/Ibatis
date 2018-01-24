package com.bin.service.impl;

import com.bin.dao.Dao;
import com.bin.db.DaoConfig;
import com.bin.service.Service;
import com.ibatis.dao.client.DaoManager;

public class ServiceImpl implements Service {

	@Override
	public String find(String id) {
		// TODO Auto-generated method stub
		DaoManager dm = DaoConfig.getDaoManager();
		Dao dao = (Dao)dm.getDao(Dao.class);
		String pseid = dao.findById(id);
		return pseid;
	}

}
