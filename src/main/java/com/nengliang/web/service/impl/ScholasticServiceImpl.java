package com.nengliang.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.ScholasticMapper;
import com.nengliang.web.entity.Scholastic;

@Service
public class ScholasticServiceImpl  implements  ScholasticService{

	@Autowired
	private  ScholasticMapper  scholasticMapper;

	/*
          查询数据库所有的信息
  	 */
	public List<Scholastic> selectAll() {
		List<Scholastic>  list = scholasticMapper.selectByExample(null);
		return list;
	}
	
	
	
}
