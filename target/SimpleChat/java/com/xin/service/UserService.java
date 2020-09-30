package com.xin.service;

import com.xin.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User login(int id, String password);
}
