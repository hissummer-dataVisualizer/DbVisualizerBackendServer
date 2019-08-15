package com.hissummer.dbvisualizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hissummer.dbvisualizer.dataplatform.DataplatformRequestVo;
import com.hissummer.dbvisualizer.dataplatform.service.DataplatformServiceImpl;
import com.hissummer.dbvisualizer.testasist.requestVo.SqlRequestVo;
import com.hissummer.dbvisualizer.testasist.requestVo.SqlResponseVo;
import com.hissummer.dbvisualizer.testasist.service.SqlServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/api")
public class DataPlatformController {

	@Autowired
	SqlServiceImpl sqlServiceImpl;

	@Autowired
	DataplatformServiceImpl dataplatformServiceImpl;	
	
	@PostMapping(value = "/sql/{env}/{service}")
	@ResponseBody
	public SqlResponseVo sql(@PathVariable("env") String env, @PathVariable("service") String service,
			@RequestBody SqlRequestVo sqlRequestVo) {

		log.info(sqlRequestVo.getEnv());
		log.info(env);

		log.info(sqlRequestVo.toString());

		SqlResponseVo sqlResponseVo = sqlServiceImpl.runSql(env, service, sqlRequestVo.getSql());
		log.info(sqlResponseVo.toString());
		// sqlResponseVo.
		return sqlResponseVo;
		// return new ResponseEntity<>(sqlResponseVo, HttpStatus.OK);

	}


	@PostMapping(value = "/dataplatform/mongodbruncommand")
	@ResponseBody
	public ResponseEntity<String> runCommand(@RequestBody DataplatformRequestVo dataplatformRequestVo) {

		log.info(dataplatformRequestVo.getCommand());
		String response = dataplatformServiceImpl.runCommand(dataplatformRequestVo.getCommand());
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
