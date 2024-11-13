package cn.sdstudio.lease.web.admin.custom.config.converter;

import cn.sdstudio.lease.model.enums.LeaseStatus;
import io.lettuce.core.dynamic.annotation.CommandNaming;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Description: TODO
 *
 * @author auart
 */
@Deprecated
@Component
public class StringToLeaseStatusConverter  implements Converter<String, LeaseStatus> {

    @Override
    public LeaseStatus convert(String code) {
        LeaseStatus[] values = LeaseStatus.values();
        for (LeaseStatus value : values) {
            if (value.getCode().equals(Integer.valueOf(code))) {
                return value;
            }
        }
        throw new IllegalArgumentException("code:"+code+"非法");
    }
}
