package com.iacsd.Etour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacsd.Etour.DAO.CategorysubDao;
import com.iacsd.Etour.entities.Categorysub;
@Service
public class CategorysubSeviceImpl implements CategorysubService {

	@Autowired
	private CategorysubDao catdao;
	
	@Override
	public List<Categorysub> getcategory() {
		// TODO Auto-generated method stub
		return this.catdao.catsubsave();
		
	}

	@Override
	public List<Categorysub> getsubcategory(String catName) {
		// TODO Auto-generated method stub
		return this.catdao.findByCatName(catName);
	}

}
