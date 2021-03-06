package com.cskaoyan.mapper.shopMapper;

import com.cskaoyan.bean.shop.order.OrderGoods;
import com.cskaoyan.bean.shop.order.OrderGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsMapper4Shop {
    long countByExample(OrderGoodsExample example);

    int deleteByExample(OrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    List<OrderGoods> selectByExample(OrderGoodsExample example);

    OrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);
}