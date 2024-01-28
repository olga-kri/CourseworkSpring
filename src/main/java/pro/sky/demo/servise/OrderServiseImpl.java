package pro.sky.demo.servise;

import org.springframework.stereotype.Service;
import pro.sky.demo.Basket;

import java.util.List;
@Service
public class OrderServiseImpl implements OrderServise {

    private final Basket basket;

    public OrderServiseImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return basket.addItem(items);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
