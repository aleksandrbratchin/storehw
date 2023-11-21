package ru.bratchin.storehw.repository.api;

import java.util.Collection;

public interface ShoppingCartRepository<T> {

    void add(Collection<T> ids);

    Collection<T> get();

}
