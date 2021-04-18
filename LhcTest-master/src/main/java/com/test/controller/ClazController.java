package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.entity.Claz;
import com.test.service.ClazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("claz")
public class ClazController {

    @Autowired
    private ClazService clazService;

    /**
     * 获取全部班级
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "allclaz.api", method = RequestMethod.GET)
    public  List<Claz> getAllClaz( ) {
        List<Claz> ront= clazService.getAllClaz();
        return ront;
    }
}
