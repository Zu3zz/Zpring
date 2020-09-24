package com.zth.controller.frontend;

import com.zth.entity.dto.MainPageInfoDTO;
import com.zth.entity.dto.Result;
import com.zth.service.combine.HeadLineShopCategoryCombineService;
import core.annotation.Controller;
import inject.annotation.Autowired;
import lombok.Getter;
import mvc.annotation.RequestMapping;
import mvc.type.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 3zZ.
 * @date 2020/9/25.
 */
@Controller
@Getter
@RequestMapping(value = "/main")
public class MainPageController {
    @Autowired(value = "HeadLineShopCategoryCombineServiceImpl")
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;
    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp){
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void throwException(){
        throw new RuntimeException("抛出异常测试");
    }
}
