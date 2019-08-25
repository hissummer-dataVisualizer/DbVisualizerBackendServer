package com.hissummer.dbvisualizer.datasource.mgmt.vo;

import java.util.List;

import lombok.Data;


@Data
public class Datasource {
	

	String id;
	DatasourceType datasourceType;
	Boolean isCluster;
	List<String> address;
	String userName;
	String password;
	List<String> options;
	
	
}
