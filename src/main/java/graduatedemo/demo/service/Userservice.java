package graduatedemo.demo.service;

import graduatedemo.demo.dao.UserMapper;
import graduatedemo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
   @Autowired
    UserMapper userMapper;
   User selByid(int id){
       return userMapper.selByid(id);
   }
   }


