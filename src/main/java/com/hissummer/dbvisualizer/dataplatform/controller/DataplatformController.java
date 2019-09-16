package com.hissummer.dbvisualizer.dataplatform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hissummer.dbvisualizer.mongodb.DataplatformRequestVo;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/api")
public class DataplatformController {

	
	@PostMapping(value = "/dataplatform/mongodbruncommand")
	@ResponseBody
	public ResponseEntity<String> runCommand(@RequestBody DataplatformRequestVo dataplatformRequestVo) {

		log.info(dataplatformRequestVo.getCommand());

		return new ResponseEntity<>(null, HttpStatus.OK);

	}
	
}
