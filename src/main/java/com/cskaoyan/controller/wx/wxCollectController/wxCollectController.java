package com.cskaoyan.controller.wx.wxCollectController;

import com.cskaoyan.bean.BaseRespVo;
import com.cskaoyan.bean.collect.UserCollect;
import com.cskaoyan.bean.wxvo.CollectListVO;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("wx/collect")
public class wxCollectController {


    @Autowired
    UserService userService;

    @RequestMapping("list")
    public BaseRespVo list(Integer type, Integer page, Integer size) {
        CollectListVO collectLIstVO = userService.queryWxCollectListBean(type,page,size);
        return BaseRespVo.ok(collectLIstVO);
    }

    @RequestMapping("addordelete" )
    public BaseRespVo addOrDelete(@RequestBody UserCollect userCollect) {
        String stype = userService.addOrDeleteCollection(userCollect);
        return BaseRespVo.ok(stype);
    }
}
