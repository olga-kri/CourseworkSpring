package pro.sky.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.demo.servise.OrderServise;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemsController {
    public final OrderServise orderServise;
    public ItemsController (OrderServise orderServise){
        this.orderServise = orderServise;
    }
@GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items){
        return orderServise.addItems(items);
}
    @GetMapping("/get")
    public List<Integer> getItems(){
        return orderServise.getItems();
    }
}
