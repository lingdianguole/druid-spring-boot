package com.github.trang.druid.example.mybatis.model;

import java.io.Serializable;

import lombok.Data;

/**
 * City
 *
 * @author trang
 */
@Data
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String state;
    private String country;

}