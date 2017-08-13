package  gen.controller;

import com.alibaba.fastjson.JSON;
import com.gen.entity.User;
import com.gen.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toList")
    public String toList(HttpServletRequest request, Model model) {
        PageInfo<User> pageInfo = userService.findList();
        model.addAttribute("pageInfo", pageInfo);
        System.out.println(JSON.toJSONString(pageInfo));
        return "user/list";
    }
}