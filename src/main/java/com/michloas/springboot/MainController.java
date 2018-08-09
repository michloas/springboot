package com.michloas.springboot;

import java.util.Iterator;
import java.util.List;

import com.michloas.springboot.pojo.User;
import com.michloas.springboot.pojo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @Autowired
    private UserDAO userDao;

    @RequestMapping("/getUser")
    public User getUser(String name) {
        return userDao.findByName(name);
    }

    @RequestMapping("/getUsersByName")
    public List<User> getUsersByName(String name) {
        return userDao.findByNameContaining(name);
    }

    @RequestMapping("/getPageUser")
    public Page<User> getPageUser(String name) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");// 排序
        int page = 1;// 第几页
        int size = 5;// 每页多少条
        Pageable pageable = new PageRequest(page, size, sort);
        Page<User> pages = userDao.findByNameNot(name, pageable);
        Iterator<User> it = pages.iterator();
        while (it.hasNext()) {
            System.out.println("value:" + ((User) it.next()).getName());
        }
        return userDao.findByNameNot(name, pageable);
    }

    @RequestMapping("/addUser")
    public String addUser() {
        User u = new User("vvv", "vvvvvv");
        userDao.save(u);
        return "添加成功！";
    }
}
