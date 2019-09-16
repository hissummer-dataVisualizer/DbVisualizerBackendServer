package com.hissummer.dbvisualizer.mysql.requestVo;

import lombok.Data;

@Data
public class SqlRequestVo {

	String env;
	String service;
	String sql;

}
