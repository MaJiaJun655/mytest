package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.KhtMapper;
import com.accp.dao.ShtMapper;
import com.accp.model.Kht;
import com.accp.model.Sht;

@Service
@Transactional
public class servicemain {
	@Autowired
	private KhtMapper mapper;
	@Autowired
	private ShtMapper Shtmapper;
	
	public Kht selectbykht(Integer khid) {
		return mapper.selectkybykhid(khid);
	}
	
	public Sht selectbyid(Integer shid) {
		return Shtmapper.selectByPrimaryKey(shid);
	}
	
	public Integer update(Sht info) {
		return Shtmapper.updateByPrimaryKey(info);
	}
	public Integer updatekh(Kht info) {
		return mapper.updateByPrimaryKey(info);
		
	}
	public Integer insertsh(Sht info) {
		return Shtmapper.insert(info);
	}
	public Integer insertkh(Kht info) {
		return mapper.insert(info);
	}
}
