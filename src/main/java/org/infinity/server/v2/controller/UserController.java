package org.infinity.server.v2.controller;

import org.infinity.server.v2.entity.User;
import org.infinity.server.v2.model.response.UserListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    @ResponseBody
    public UserListResponse getUserList(){
        User user = User.builder()
                .userSeq(1)
                .id("testUser")
                .lastLoginTime(LocalDate.now())
                .registTime(LocalDate.now())
                .build();

        List<User> userList = new ArrayList();
        userList.add(user);

        return UserListResponse.builder()
                .userList(userList)
                .build();
    }
}
