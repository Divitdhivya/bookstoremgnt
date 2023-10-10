package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookStore.entity.MyBookList;

public interface MyBookListRepository extends JpaRepository<MyBookList, Integer> {
    // Define your custom query methods here if needed
}
