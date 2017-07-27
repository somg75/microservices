package com.niit.msa.item.dao;

import org.springframework.data.repository.CrudRepository;

import com.niit.msa.item.data.Item;

public interface ItemDao extends CrudRepository<Item, Long>  {

}
