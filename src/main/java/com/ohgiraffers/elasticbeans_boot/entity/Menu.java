package com.ohgiraffers.elasticbeans_boot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_menu")
@Data
public class Menu {

    @Id
    @Column(name = "menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private String menuPrice;

    @Column(name = "cateogory_code")
    private String categoryCode;

    @Column(name = "orderable_status")
    private String orderableStatus;
}
