package com.benliu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benliu.entity.User;
import com.benliu.mapper.UserMapper;
import com.benliu.utils.RequestUtil;
import com.benliu.utils.ResponseUtil;

import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/10/29.
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    //登录注册功能
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void validation(HttpServletRequest request, HttpServletResponse response) {
        JSONObject request_body = RequestUtil.getJSONObject(request);
        System.out.println(request_body.toString());

        int type = request_body.getInt("type");
        String user = request_body.getString("user");
        String password = request_body.getString("password");
        JSONObject res = new JSONObject();
        if (type == 1) {
            String count = userMapper.login(user, password);
            if (!count.equals("0")) {
                res.put("isOk", true);
                ResponseUtil.responseJSON(response, res);
            } else {
                res.put("isOk", false);
                ResponseUtil.responseJSON(response, res);
            }


        } else {
            String count = userMapper.getRegister(user);
            if (!count.equals("0")) {
                res.put("isOk", false);
                ResponseUtil.responseJSON(response, res);
                return;
            }
            userMapper.register(user, password);
            res.put("isOk", true);
            ResponseUtil.responseJSON(response, res);

        }
    }

    //登陆
    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    public void login2(HttpServletRequest request, HttpServletResponse response) {
        JSONObject request_body = RequestUtil.getJSONObject(request);
        String user = request_body.getString("user");
        String password = request_body.getString("password");
        List<User> useList = userMapper.getUserList(user, password);
        JSONObject ret = new JSONObject();
        if (useList.size() != 0) {
            ret = useList.get(0).toJSON();
        } else {
            ret.put("isOk", false);
        }


        ResponseUtil.responseJSON(response, ret);
    }
}
