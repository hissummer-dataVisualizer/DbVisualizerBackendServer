package com.hissummer.dbvisualizer.datasource.mgmt.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hissummer.dbvisualizer.datasource.mgmt.vo.Datasource;


public interface DatasourceRepository extends MongoRepository<Datasource, String>{

}
