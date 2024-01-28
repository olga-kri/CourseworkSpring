package pro.sky.demo.servise;

import java.util.List;

public interface OrderServise {
    List<Integer> addItems(List<Integer> ids);

    List<Integer> getItems();
}
