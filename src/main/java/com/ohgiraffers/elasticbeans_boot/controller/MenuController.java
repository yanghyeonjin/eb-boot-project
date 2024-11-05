package com.ohgiraffers.elasticbeans_boot.controller;

import com.ohgiraffers.elasticbeans_boot.dto.MenuDTO;
import com.ohgiraffers.elasticbeans_boot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("health")
    public String healthCheck() {
        return "eb_proj is fine!!!!!!!~~~~~~~~~";
    }

    @GetMapping("menus/{menuCode}")
    public MenuDTO getMenu(@PathVariable int menuCode) {
        return menuService.findMenuByMenuCode(menuCode);
    }
}
