package cn.sdstudio.lease.web.admin.service;

import cn.sdstudio.lease.model.entity.ApartmentInfo;
import cn.sdstudio.lease.web.admin.vo.apartment.ApartmentDetailVo;
import cn.sdstudio.lease.web.admin.vo.apartment.ApartmentItemVo;
import cn.sdstudio.lease.web.admin.vo.apartment.ApartmentQueryVo;
import cn.sdstudio.lease.web.admin.vo.apartment.ApartmentSubmitVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

}