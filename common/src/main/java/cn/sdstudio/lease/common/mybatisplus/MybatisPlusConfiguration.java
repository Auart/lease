package cn.sdstudio.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description: TODO
 *
 * @author auart
 */

@Configuration
@MapperScan("cn.sdstudio.lease.web.*.mapper")
public class MybatisPlusConfiguration {


}
