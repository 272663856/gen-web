package  gen.controller;

import com.alibaba.fastjson.JSON;
import com.gen.entity.User;
import com.gen.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/toList")
    public String toList(HttpServletRequest request, Model model) {
        PageInfo<User> pageInfo = userService.findList();
        model.addAttribute("pageInfo", pageInfo);
        logger.info("查询结果={}",new Object[]{JSON.toJSONString(pageInfo)});
        return "user/list";
    }
}