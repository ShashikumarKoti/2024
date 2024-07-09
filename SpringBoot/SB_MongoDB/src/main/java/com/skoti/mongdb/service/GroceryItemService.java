package com.skoti.mongdb.service;

import com.mongodb.client.result.UpdateResult;
import com.skoti.mongdb.model.GroceryItem;
import com.skoti.mongdb.repository.CustomItemRepository;
import com.skoti.mongdb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroceryItemService implements CustomItemRepository {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

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


    @Override
    public void updateItemQuantity(String name, float quantity) {
        Query query = new Query(Criteria.where("name").is(name));
        Update update = new Update();
        update.set("quantity", quantity);
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, GroceryItem.class);
        long modifiedCount = updateResult.getModifiedCount();
        System.out.println("Item updated " + modifiedCount);
    }
}
