package com.xzit.mapper;

import com.xzit.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    @Insert("INSERT INTO student VALUES  (default,#{name},#{age},#{gender})")
    void save(Student student);

    @Select("SELECT * FROM student")
    List<Student> selectList();

    @Select("SELECT * FROM student WHERE id=#{id}")
    Student selectById(int id);

    @Delete("DELETE FROM student WHERE id=#{id}")
    void deleteById(int id);

    @Update("UPDATE student SET name=#{name} , age=#{age} , gender=#{gender} WHERE id=#{id}")
    void update(Student student);
}
