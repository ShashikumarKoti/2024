package com.skoti.mongdb.controller;

import com.skoti.mongdb.model.GroceryItem;
import com.skoti.mongdb.service.GroceryItemService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/shopping")
public class GroceryItemController {

    @Autowired
    private GroceryItemService groceryItemService;

    @PostMapping("/grocery/create")
    public GroceryItem createGroceries(@RequestBody GroceryItem groceryItem) {
       return groceryItemService.createGroceryItems(groceryItem);
    }

    @GetMapping("/groceries")
    public List<String> getAllGroceries() {
       return groceryItemService.getAllGroceryItems();
    }

    @GetMapping("/groceries/{category}")
    public List<GroceryItem> getGroceriesByCategory(@PathVariable String category) {
        return groceryItemService.findGroceryByCategory(category);
    }

    @GetMapping("/grocery/{name}")
    public GroceryItem findGroceryByName(@PathVariable String name) {
         return groceryItemService.findGroceryByName(name);
    }

    @DeleteMapping("/grocery")
    public void deleteGroceryById(@RequestParam("id")  String id){
        groceryItemService.deleteGroceryItem(id);
    }

    @PutMapping("/grocery/update")
    public void updateItem(@RequestParam("name") String name, @RequestParam("quantity") float quantity) {
        groceryItemService.updateItemQuantity(name, quantity);
    }
}
