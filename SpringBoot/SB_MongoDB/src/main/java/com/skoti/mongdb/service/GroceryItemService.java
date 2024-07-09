package com.skoti.mongdb.service;

import com.skoti.mongdb.model.GroceryItem;
import com.skoti.mongdb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroceryItemService {

    @Autowired
    private ItemRepository itemRepository;

    public GroceryItem createGroceryItems(GroceryItem groceryItem) {
        System.out.println("Creating items");
        GroceryItem gr = itemRepository.save(groceryItem);
        System.out.println("Items created");
        return gr;
    }

    public List<String> getAllGroceryItems() {
        return itemRepository.findAll().stream().map(GroceryItem::getName).collect(Collectors.toList());
    }

    public List<GroceryItem> findGroceryByCategory(String category) {
        List<GroceryItem> groceryItems = itemRepository.findAll(category);
        groceryItems.forEach(item -> System.out.println(item.getCategory()));
        return groceryItems;
    }

    public GroceryItem findGroceryByName(String name) {
        return itemRepository.findItemByName(name);
    }

    public void deleteGroceryItem(String id) {
        itemRepository.deleteById(id);

    }


}
