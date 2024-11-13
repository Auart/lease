package cn.sdstudio.lease.web.admin.service;

import cn.sdstudio.lease.web.admin.vo.login.CaptchaVo;
import cn.sdstudio.lease.web.admin.vo.login.LoginVo;
import cn.sdstudio.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {
        CaptchaVo getCaptcha();
}
