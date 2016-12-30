package com.yd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/30.
 */
@Controller
public class ShiroController {

    @RequestMapping("/403")
    public String unAuthorized() {
        return "403";
    }

}
