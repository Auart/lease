package cn.sdstudio.lease.web.admin.custom.config.converter;

import cn.sdstudio.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * Description: TODO
 * @author auart
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new Converter<String, T>() {
            @Override
            public T convert(String code) {
                T[] enumConstants = targetType.getEnumConstants();
                for (T value : enumConstants) {
                    if (value.getCode().toString().equals(code)) {
                        return value;
                    }
                }

                throw new IllegalArgumentException();
            }
        };
    }
}