package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.model.Kht;
import com.accp.model.Sht;
import com.accp.service.servicemain;

@Controller
@RequestMapping("main")
public class main {
	@Autowired
	private servicemain service;

	@GetMapping("index")
	public String index() {
		return "index";
	}
	@GetMapping("getbykhid")		//根据客户ID进行一对多查询
	@ResponseBody
	public Kht selectbykhid(Integer khid) {
		System.out.println("进来了");
		return service.selectbykht(khid);		
	}
	@GetMapping("getbyshid")		//根据送货ID进行查询
	@ResponseBody
	public Sht selectbyshid(Integer shid) {
		return service.selectbyid(shid);
	}
	@PutMapping("updatesht")		//修改送货信息
	public Integer updatesht(@RequestBody Sht info) {
		return service.update(info);
	}
	@PutMapping("updatekht")		//修改客户信息
	public Integer updatesht(@RequestBody Kht info) {
		return service.updatekh(info);
	}
	@PostMapping("insertsh")		//新增送货信息
	public Integer insertsh(@RequestBody Sht info) {
		info.setShid(0);
		return service.insertsh(info);
	}
	@PostMapping("insertkh")		//新增客户信息
	public Integer insertkh(@RequestBody Kht info) {
		System.out.println("已进入新增客户"+info.getKhid()+info.getKhname());
		info.setKhid(0);
		return service.insertkh(info);
	}


}
