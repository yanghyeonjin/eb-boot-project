package com.ohgiraffers.elasticbeans_boot.repository;

import com.ohgiraffers.elasticbeans_boot.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
