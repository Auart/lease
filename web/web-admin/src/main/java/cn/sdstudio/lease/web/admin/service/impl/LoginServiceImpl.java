package cn.sdstudio.lease.web.admin.service.impl;

import cn.sdstudio.lease.web.admin.service.LoginService;
import cn.sdstudio.lease.web.admin.vo.login.CaptchaVo;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public CaptchaVo getCaptcha() {
        return null;
    }
}
