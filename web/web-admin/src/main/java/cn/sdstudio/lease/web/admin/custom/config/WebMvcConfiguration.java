package cn.sdstudio.lease.web.admin.custom.config;

import cn.sdstudio.lease.web.admin.custom.config.converter.StringToBaseEnumConverterFactory;
import cn.sdstudio.lease.web.admin.custom.config.converter.StringToItemTypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: TODO
 *
 * @author auart
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {


    @Autowired
    private StringToBaseEnumConverterFactory stringToBaseEnumConverterFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(this.stringToBaseEnumConverterFactory);
    }
}
