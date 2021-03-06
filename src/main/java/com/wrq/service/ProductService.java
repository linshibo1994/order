package com.wrq.service;

import com.wrq.dto.CartDto;
import com.wrq.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by wangqian on 2019/1/26.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /* 查询所有在架的商品列表 */
    List<ProductInfo> findUpAll();

    /* 可分页，返回的是Page对象 */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /* 加库存 */
    void increaseStock(List<CartDto> cartDtoList);

    /* 减库存 */
    void decreaseStock(List<CartDto> cartDtoList);

    /* 上架 */
    ProductInfo onSale(String productId);

    /* 下架 */
    ProductInfo offSale(String productId);
}
