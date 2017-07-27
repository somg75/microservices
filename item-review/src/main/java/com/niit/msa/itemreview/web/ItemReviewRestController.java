package com.niit.msa.itemreview.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.msa.itemreview.dto.ItemReviewDTO;
import com.niit.msa.itemreview.service.ItemReviewService;


@RestController
public class ItemReviewRestController {

	@Autowired
	private ItemReviewService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "itemreview/create")
	public ItemReviewDTO create(@RequestBody ItemReviewDTO itemdto) {
	    ItemReviewDTO saveddto = service.addItemReview(itemdto);
		return saveddto;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="itemreview/retrieve/{id}")
	public ItemReviewDTO retrieve(@PathVariable("id") long id) {
		return service.retrieve(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "itemreview/update/{id}")
	public ItemReviewDTO update(@PathVariable("id") long id, @RequestBody ItemReviewDTO itemdto) {
	    //TODO update service call
		return itemdto;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "itemreview/search/{id}")
	public List<ItemReviewDTO> search(@PathVariable("id") long itemid) {
		return service.findReviewsByItem(itemid)
				;
	}
}
