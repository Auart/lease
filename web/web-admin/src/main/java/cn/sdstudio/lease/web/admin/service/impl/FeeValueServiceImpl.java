package cn.sdstudio.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.sdstudio.lease.model.entity.FeeValue;
import cn.sdstudio.lease.web.admin.service.FeeValueService;
import cn.sdstudio.lease.web.admin.mapper.FeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue>
    implements FeeValueService{

}



