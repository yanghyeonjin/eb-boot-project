package com.ohgiraffers.elasticbeans_boot.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MenuDTO {

    private int menuCode;

    private String menuName;

    private String menuPrice;

    private String categoryCode;

    private String orderableStatus;
}
