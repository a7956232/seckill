package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by 95 on 2016/9/19.
 */
public interface SeckillDao {

    //减库存
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    //根据ID查询秒杀对象
    Seckill queryById(long seckillId);

    //根据偏移量查询商品秒杀列表
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
