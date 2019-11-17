package com.yyh.dao;

import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-17-10:48
 */
@Component
public class StudentDaoImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private RowMapper<Student> rowMapper = new RowMapper<Student>() {
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student stu = new Student();
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("name"));
            return stu;
        }
    };

    public List<Student> selectAll() {
        return jdbcTemplate.query("select * from student", rowMapper);
    }

    public int delete(int id) {
        return jdbcTemplate.update("delete from student where id=?", id);
    }


}
