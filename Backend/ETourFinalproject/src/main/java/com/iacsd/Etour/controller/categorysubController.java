package com.iacsd.Etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.Categorysub;
import com.iacsd.Etour.services.CategorysubService;

@CrossOrigin("http://localhost:4200")
@RestController
public class categorysubController {
	
	@Autowired
	private CategorysubService castserv;
	
	@GetMapping("/category")
	public List<Categorysub> getcategory()
	{
		return this.castserv.getcategory();
	}
	
	@GetMapping("/subcategory/{catName}")
	public List<Categorysub> getsubcategory(@PathVariable String catName)
	{
		return this.castserv.getsubcategory(catName);
	}
}
