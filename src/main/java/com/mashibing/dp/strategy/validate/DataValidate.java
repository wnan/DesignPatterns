package com.mashibing.dp.strategy.validate;

import com.mashibing.dp.strategy.validate.entity.ValidateResult;

/**
 * @program: DesignPatterns
 * @description:
 * @author: nan.wang
 * @create: 2020-07-12 11:43
 */
public interface DataValidate<T> {
    /**
     * validate data
     * @param t
     * @return
     */
    ValidateResult validate(T t);
}
