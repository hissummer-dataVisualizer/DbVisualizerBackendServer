package com.hissummer.dbvisualizer.common.vo;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public  class ResponseVo {

	int status; // server status
	boolean success; // mock or upstream response status
	Object data; // business data
	String message; // message
	
	
}
