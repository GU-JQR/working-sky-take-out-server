package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    void insertBatch(@Param("orderDetail") List<OrderDetail> orderDetailList);
}
