package com.nengliang.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.nengliang.web.entity.Scholastic;
import com.nengliang.web.service.impl.ScholasticService;


/**
 * 实现用户表的CRUD
 * mvc+mybatis generetor + layui
 * @author Dell
 *@Data 20190612
 */
@Controller
@RequestMapping("/scholastic")
public class ScholasticController {
    
	//日志打印
	private  static final Logger logger = LoggerFactory.getLogger(ScholasticController.class);
	
	@Autowired
	private ScholasticService scholasticService;
	
	
	/*
	 *查询出数据库表中的所有信息 
	 *http://localhost:8080/ssmgenerator
	 *20190613 目前项目只做到所有数据返回前端
	 *http://localhost:8080/ssmgenerator/scholastic/selectAll
	 */
	
	@RequestMapping("/listAll")
	public String   selectList() {
		return	"list";	
	}
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<Scholastic>   selectAllPerson() {
		List<Scholastic>  scholasticList =  scholasticService.selectAll();
		return	scholasticList;	
	}
	
	
	
	
}
