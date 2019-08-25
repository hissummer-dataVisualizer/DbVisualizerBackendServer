package com.hissummer.dbvisualizer.datasource.mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.hissummer.dbvisualizer.datasource.mgmt.vo.Datasource;
import com.hissummer.dbvisualizer.datasource.mgmt.vo.DatasourceMgmtResponseVo;
import com.hissummer.dbvisualizer.datasource.mgmt.vo.DatasourceQueryRequestVo;

@Service
public class DatasourceMgmtService {

	@Autowired
	DatasourceRepository datasourceRepository;

	public DatasourceMgmtResponseVo update(Datasource datasource) {

		DatasourceMgmtResponseVo response = null;

		try {

			Datasource saveResult = datasourceRepository.save(datasource);

			if (saveResult == null) {
				response = DatasourceMgmtResponseVo.builder().status(0).success(false).message("save error occured!")
						.build();
			} else {

				response = DatasourceMgmtResponseVo.builder().status(0).success(true).message("success")
						.data(saveResult).build();

			}

		} catch (Exception e) {

			response = DatasourceMgmtResponseVo.builder().status(-1).success(false).message("unknown server errors!")
					.build();

		}

		return response;

	}

	public DatasourceMgmtResponseVo insert(Datasource datasource) {
		// TODO Auto-generated method stub

		DatasourceMgmtResponseVo response = null;

		try {

			Datasource insertResult = datasourceRepository.insert(datasource);

			if (insertResult == null) {
				response = DatasourceMgmtResponseVo.builder().status(0).success(false).message("insert error occured!")
						.build();
			} else {

				response = DatasourceMgmtResponseVo.builder().status(0).success(true).message("success")
						.data(insertResult).build();

			}

		} catch (Exception e) {

			response = DatasourceMgmtResponseVo.builder().status(-1).success(false).message("unknown server errors!")
					.build();

		}

		return response;

	}

	public DatasourceMgmtResponseVo delete(Datasource datasource) {
		// TODO Auto-generated method stub

		DatasourceMgmtResponseVo response = null;

		try {

			datasourceRepository.deleteById(datasource.getId());

			response = DatasourceMgmtResponseVo.builder().status(0).success(true).message("success").data(datasource.getId())
					.build();

		} catch (Exception e) {

			response = DatasourceMgmtResponseVo.builder().status(-1).success(false).message("unknown server errors!")
					.build();

		}

		return response;

	}
	

	
	public DatasourceMgmtResponseVo query(DatasourceQueryRequestVo query) {
		// TODO Auto-generated method stub

		DatasourceMgmtResponseVo response = null;

		Page<Datasource> dataSources = null;
		
		int pageNumber = query.getPageNumber() < 2 ? 0 : query.getPageNumber()-1;
		int pageSize = query.getPageSize() <= 0 ? 20 : query.getPageSize();

		PageRequest page = PageRequest.of(pageNumber, pageSize);
		
	    Example queryExample = Example.of(query.getExample());
		
		try {

			dataSources = datasourceRepository.findAll(queryExample, page);

			if(dataSources != null && dataSources.getContent() != null)
			{
				response = DatasourceMgmtResponseVo.builder().status(0).success(true).message("success.").data(dataSources.getContent())
						.build();
			}
			else {
				response = DatasourceMgmtResponseVo.builder().status(0).success(false).message("query errors!")
						.build();
			}


		} catch (Exception e) {

			response = DatasourceMgmtResponseVo.builder().status(-1).success(false).message("unknown server errors!")
					.build();

		}

		return response;

	}
	
	
	
	

}
