package pro.sky.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket(List<Integer> items) {
        this.items = new ArrayList<>();
    }
    public List<Integer> addItem(List<Integer> idList){
        items.addAll(idList);
        return idList;
    }
    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
