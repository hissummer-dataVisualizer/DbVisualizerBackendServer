package com.hissummer.dbvisualizer.mongodb.controller;

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

import com.hissummer.dbvisualizer.mongodb.DataplatformRequestVo;
import com.hissummer.dbvisualizer.mongodb.service.MongodbServiceImpl;
import com.hissummer.dbvisualizer.mysql.requestVo.SqlRequestVo;
import com.hissummer.dbvisualizer.mysql.requestVo.SqlResponseVo;
import com.hissummer.dbvisualizer.mysql.service.SqlServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/api")
public class DataPlatformController {

	@Autowired
	SqlServiceImpl sqlServiceImpl;

	@Autowired
	MongodbServiceImpl dataplatformServiceImpl;	


	@PostMapping(value = "/dataplatform/mongodbruncommand")
	@ResponseBody
	public ResponseEntity<String> runCommand(@RequestBody DataplatformRequestVo dataplatformRequestVo) {

		log.info(dataplatformRequestVo.getCommand());
		String response = dataplatformServiceImpl.runCommand(dataplatformRequestVo.getCommand());
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
