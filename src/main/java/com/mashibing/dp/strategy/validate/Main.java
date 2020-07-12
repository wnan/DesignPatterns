package com.mashibing.dp.strategy.validate;

import com.mashibing.dp.strategy.validate.entity.TicketData;

/**
 * @program: DesignPatterns
 * @description:
 * @author: nan.wang
 * @create: 2020-07-12 11:32
 */
public class Main {
    public static void main(String[] args) {
        ValidateUtils<TicketData> validateUtils = new ValidateUtils();
        validateUtils.validate();
    }
}
