package ru.bratchin.storehw.service.api;

import java.util.Collection;

public interface OrderService {

    void add(Collection<Integer> id);

    Collection<Integer> get();

}
