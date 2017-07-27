package com.niit.msa.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.msa.item.dao.ItemDao;
import com.niit.msa.item.data.Item;
import com.niit.msa.item.dto.ItemDTO;
import com.niit.msa.item.exception.InvalidItemRequestExpection;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao dao;
	
	@Override
	public ItemDTO addItem(ItemDTO itemdto) {
		Item item = ItemConverter.convertDTO(itemdto);
		dao.save(item);
		return ItemConverter.convertDO(item);
	}

	@Override
	public ItemDTO retrieve(Long id) {
		Item item = dao.findOne(id);
		if(item != null) {
			return ItemConverter.convertDO(item);
		}
		throw new InvalidItemRequestExpection("Item not found for id = " + id);
	}

}
