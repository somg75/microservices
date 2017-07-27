package com.niit.msa.item.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.msa.item.dto.ItemDTO;
import com.niit.msa.item.service.ItemService;

@RestController
public class ItemRestController {

	@Autowired
	private ItemService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "item/create")
	public ItemDTO create(@RequestBody ItemDTO itemdto) {
	    ItemDTO saveddto = service.addItem(itemdto);
		return saveddto;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="item/retrieve/{id}")
	public ItemDTO retrieve(@PathVariable("id") long id) {
		return service.retrieve(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "item/update/{id}")
	public ItemDTO update(@PathVariable("id") long id, @RequestBody ItemDTO itemdto) {
	    //TODO update service call
		return itemdto;
	}
}
