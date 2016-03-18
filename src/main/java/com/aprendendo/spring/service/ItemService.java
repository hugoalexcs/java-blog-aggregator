package com.aprendendo.spring.service;
import org.springframework.data.domain.PageRequest;
import  org.springframework.data.domain.Sort.Direction;

import java.util.List;

import javafx.print.PageRange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendo.spring.entity.Item;
import com.aprendendo.spring.repository.ItemRepository;


@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getItems(){
		return itemRepository.findAll(new PageRequest(0, 20, Direction.DESC, "publishedDate")).getContent();
	}
}
