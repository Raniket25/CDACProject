package com.iacsd.Etour.services;

import java.util.List;

import com.iacsd.Etour.entities.Categorysub;

public interface CategorysubService {
	public List<Categorysub> getcategory();

	public List<Categorysub> getsubcategory(String catName);

}
