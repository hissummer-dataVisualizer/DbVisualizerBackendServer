package com.hissummer.dbvisualizer.datasource.mgmt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hissummer.dbvisualizer.testasist.requestVo.SqlRequestVo;
import com.hissummer.dbvisualizer.testasist.requestVo.SqlResponseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/api")
public class DatasourceMgmtController {
	
	
	/**
	 * 
	 * @param 
	 * @return
	 */
	@PostMapping(value = "/datasource")
	@ResponseBody
	public Object updateDatasource(
		
		@RequestBody Datasource datasource) {

		log.info(datasource.toString());

		// sqlResponseVo.
		return null;
		// return new ResponseEntity<>(sqlResponseVo, HttpStatus.OK);

	}
	

}
