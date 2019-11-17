package com.yyh.handler;

import com.yyh.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YanYuHang
 * @create 2019-11-17-10:52
 */
@Controller
public class StudentHanlder {
    @Autowired
    StudentServiceImpl ss;


    @RequestMapping("/find")
    public String selectAll(Model model) {
        model.addAttribute("stus", ss.selectAll());
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        ss.delete(id);
        return "redirect:/find";
    }


}
