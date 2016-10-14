package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by 95 on 2016/9/21.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
