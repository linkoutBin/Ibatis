package com.bin.dao.impl;

import com.bin.dao.Dao;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

public class DaoImpl extends SqlMapDaoTemplate implements Dao {

	public DaoImpl(DaoManager daoManager) {
		super(daoManager);
	}

	@Override
	public String findById(String id) {
		// TODO Auto-generated method stub
		return (String) queryForObject("T.S", id);
	}

}
