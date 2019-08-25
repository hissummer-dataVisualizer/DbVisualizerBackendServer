package com.hissummer.dbvisualizer.datasource.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hissummer.dbvisualizer.datasource.mgmt.service.DatasourceMgmtService;
import com.hissummer.dbvisualizer.datasource.mgmt.vo.Datasource;
import com.hissummer.dbvisualizer.datasource.mgmt.vo.DatasourceMgmtResponseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/api")
public class DatasourceMgmtController {
	
	
	@Autowired
	DatasourceMgmtService datasourceMgmtService;
	
	
	/**
	 * 
	 * @param 
	 * @return
	 */
	@PostMapping(value = "/datasource")
	@ResponseBody
	public DatasourceMgmtResponseVo updateDatasource(
		
		@RequestBody Datasource datasource) {


		return datasourceMgmtService.update(datasource);
		
	}
	
	@PutMapping(value = "/datasource")
	@ResponseBody
	public DatasourceMgmtResponseVo addDatasource(
		
		@RequestBody Datasource datasource) {

		log.info(datasource.toString());

		// sqlResponseVo.
		return null;
		// return new ResponseEntity<>(sqlResponseVo, HttpStatus.OK);

	}
	

	@DeleteMapping(value = "/datasource")
	@ResponseBody
	public DatasourceMgmtResponseVo delDatasource(
		
		@RequestBody Datasource datasource) {

		log.info(datasource.toString());

		// sqlResponseVo.
		return null;
		// return new ResponseEntity<>(sqlResponseVo, HttpStatus.OK);

	}
	
	@GetMapping(value = "/datasource")
	@ResponseBody
	public DatasourceMgmtResponseVo getDatasources(
		
		@RequestBody Datasource datasource) {

		log.info(datasource.toString());

		// sqlResponseVo.
		return null;
		// return new ResponseEntity<>(sqlResponseVo, HttpStatus.OK);

	}	

}
