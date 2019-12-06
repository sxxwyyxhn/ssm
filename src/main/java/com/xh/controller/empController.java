package com.xh.controller;

import com.xh.bean.Emp;
import com.xh.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xh
 * @create 2019-05 19:00
 */
@Controller
public class empController {
    @Autowired
    private EmpMapper em;
    @RequestMapping("showEmp")
    public String showEmp(Model model){
        List<Emp> empList = em.selectByAll(null);
        model.addAttribute("empList","empList");

        return "showEmp";
    }
}
