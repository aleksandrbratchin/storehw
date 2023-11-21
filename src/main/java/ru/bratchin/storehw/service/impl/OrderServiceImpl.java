package ru.bratchin.storehw.service.impl;

import org.springframework.stereotype.Service;
import ru.bratchin.storehw.repository.api.ShoppingCartRepository;
import ru.bratchin.storehw.service.api.OrderService;

import java.util.Collection;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final ShoppingCartRepository<Integer> repository;

    public OrderServiceImpl(ShoppingCartRepository<Integer> repository) {
        this.repository = repository;
    }

    @Override
    public void add(Collection<Integer> ids) {
        repository.add(ids);
    }

    @Override
    public List<Integer> get() {
        return (List<Integer>) repository.get();
    }

}
