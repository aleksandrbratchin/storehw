package ru.bratchin.storehw.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import ru.bratchin.storehw.repository.api.ShoppingCartRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
@SessionScope
public class ShoppingCartListRepository implements ShoppingCartRepository<Integer> {

    private List<Integer> shoppingCarts = new ArrayList<>();

    @Override
    public void add(Collection<Integer> ids) {
        shoppingCarts.addAll(ids);
    }

    @Override
    public Collection<Integer> get() {
        return shoppingCarts;
    }

}
