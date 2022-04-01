package com.jjl.controller;

import com.jjl.entity.Product;
import com.jjl.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author valerie
 * @Description:
 * @date 2022/2/26 10:50
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("insert")
    public Object save(@RequestBody Product product){
        return productService.insert(product);
    }

    @GetMapping("selectById")
    public Object selectById(Long id){
        return productService.selectById(id);
    }

    @GetMapping("selectByName")
    public Object selectByName(String name){
        return productService.selectByName(name);
    }

    @GetMapping("deleteById")
    public Object delete(Long id){
        return productService.deleteById(id);
    }

    @GetMapping("selectAll")
    public Object selectAll(){
        return productService.selectAll();
    }

    @GetMapping("updatePrice")
    public Object updatePrice(Long id, Double price){
        return productService.updatePrice(id, price);
    }

    @GetMapping("updateNum")
    public Object updateNum(Long id, int num){
        return productService.updateNum(id, num);
    }


}
