package com.xzit.convert;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class DataConvert implements Converter<Double, BigDecimal> {
    @Override
    public BigDecimal convert(Double source) {
        System.out.println("使用自定义的类型转换器");
        BigDecimal bigDecimal = new BigDecimal(source);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bigDecimal;
    }
}
