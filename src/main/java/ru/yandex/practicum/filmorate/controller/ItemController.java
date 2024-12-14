package ru.yandex.practicum.filmorate.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.model.Item;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
@CrossOrigin(origins = "*")
@Slf4j
@RequiredArgsConstructor
public class ItemController {
   private final String title = "Title";
    @PostMapping
    public  void createItem (@RequestBody Item Item) {
        log.info("Получена сущность Item");

        //return ItemService.createItem(Item);
    }

    @GetMapping
    public List<Item> getItems() {
        //return ItemService.getItems();
        return List.of();
    }
}
