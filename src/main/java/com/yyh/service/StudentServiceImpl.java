package com.yyh.service;

import com.yyh.dao.StudentDaoImpl;
import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-17-10:51
 */
@Service
public class StudentServiceImpl {

    @Autowired
    StudentDaoImpl sdl;

    public List<Student> selectAll() {
        return sdl.selectAll();
    }

    public int delete(int id) {
        return sdl.delete(id);
    }

}
