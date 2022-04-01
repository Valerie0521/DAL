package com.jjl.mapper;

import com.jjl.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author valerie
 * @Description:
 * @date 2022/2/25 20:19
 */
@Mapper
@Repository
public interface ProductMapper {

    int insert(Product product);

    Product selectById(Long id);

    Product selectByName(String name);

    int deleteById(Long id);

    List<Product> selectAll();

    int updatePrice(Long id, Double price);

    int updateNum(Long id, int num);
}
