package com.newroad.controller;

import com.newroad.entity.User;
import com.newroad.service.CustomerServiceIf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  @Resource
   private CustomerServiceIf customerServiceIf;

   @RequestMapping("/selectuser")
   public List<User> select(){
      List<User> userList = customerServiceIf.getUserList();
      return userList;

   }

}
