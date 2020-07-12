package com.mashibing.dp.strategy.validate;

import com.mashibing.dp.strategy.validate.entity.ValidateResult;

/**
 * @program: DesignPatterns
 * @description:
 * @author: nan.wang
 * @create: 2020-07-12 11:42
 */
public class ValidateUtils<T> {

    public ValidateResult validate(T data, DataValidate<T> dataValidate) {
        return dataValidate.validate(data);
    }
}