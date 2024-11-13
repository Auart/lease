package cn.sdstudio.lease.web.admin.service;

import cn.sdstudio.lease.model.entity.RoomInfo;
import cn.sdstudio.lease.web.admin.vo.room.RoomDetailVo;
import cn.sdstudio.lease.web.admin.vo.room.RoomItemVo;
import cn.sdstudio.lease.web.admin.vo.room.RoomQueryVo;
import cn.sdstudio.lease.web.admin.vo.room.RoomSubmitVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface RoomInfoService extends IService<RoomInfo> {

}
