package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在使用者角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return类型/异常）
 * Created by 95 on 2016/9/21.
 */
public interface SeckillService {

    //查询所有秒杀记录
    List<Seckill> getSeckillList();

    //查询单个秒杀记录
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
        throws SeckillException,RepeatKillException,SeckillCloseException;
}