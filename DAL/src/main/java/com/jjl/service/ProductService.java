package com.jjl.service;

import com.jjl.entity.Product;

import java.util.List;

/**
 * @author valerie
 * @Description:
 * @date 2022/2/25 20:14
 */
public interface ProductService {

    String insert(Product product);

    Product selectById(Long id);

    Product selectByName(String name);

    String deleteById(Long id);

    List<Product> selectAll();

    String updatePrice(Long id, Double price);

    String updateNum(Long id, int num);

}
