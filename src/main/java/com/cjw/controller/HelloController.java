package com.cjw.controller;

import com.cjw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2020-02-25 17:49
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(Model model){

        User user = new User();
        user.setName("tom");
        user.setAge(5);
        user.setBirthday(new Date());

        User f1 = new User();
        f1.setName("jerry");
        f1.setAge(6);
        f1.setBirthday(new Date());

        User f2 = new User();
        f2.setName("dog");
        f2.setAge(7);
        f2.setBirthday(new Date());

        User f3 = new User();
        f3.setName("bird");
        f3.setAge(8);
        f3.setBirthday(new Date());

        List<User> friends = new ArrayList<>();
        friends.add(f1);
        friends.add(f2);
        friends.add(f3);
        user.setFriends(friends);

        model.addAttribute("user",user);
        return "hello/sayHello";
    }

    @RequestMapping("/showBooks")
    public String showBooks(Model model){
        return "bootstrapTable/showBooks";
    }

    @RequestMapping("/showBooks_paging")
    public String showBooks_paging(Model model){
        return "bootstrapTable/showBooks_paging";
    }
}
