package com.skoti.mongdb.repository;

import com.skoti.mongdb.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    @Query(value = "{category:'?0'}", fields = "{'name':1,'quantity':1,'category':1}")
    List<GroceryItem> findAll(String category);

    @Query(value = "{name: '?0'}")
    GroceryItem findItemByName(String name);

}
