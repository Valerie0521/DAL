package com.jjl.service.impl;

import com.jjl.entity.Product;
import com.jjl.mapper.ProductMapper;
import com.jjl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author valerie
 * @Description:
 * @date 2022/2/25 20:26
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;
    @Override
    public String insert(Product product) {
        try{
            mapper.insert(product);
            return "插入成功";
        }
        catch(Exception e){
            return "数据格式有误或重复创建！";
        }
    }

    @Override
    public Product selectById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public Product selectByName(String name) {
        return mapper.selectByName(name);
    }


    @Override
    public String deleteById(Long id) {
        mapper.deleteById(id);
        return "删除成功";
    }

    @Override
    public List<Product> selectAll(){
        return mapper.selectAll();
    }

    @Override
    public String updatePrice(Long id, Double price){
        mapper.updatePrice(id,price);
        return "价格修改成功";
    }

    @Override
    public String updateNum(Long id, int num){
        mapper.updateNum(id, num);
        return "数量修改成功";
    }


}
