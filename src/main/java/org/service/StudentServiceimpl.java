package org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dto.student.StudentResultDTO;
import org.mapper.SelectStudentMapper;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/24.
 */
@Service("studentService")
public class StudentServiceimpl implements StudentService {

    @Autowired
    private SelectStudentMapper selectStudentMapper;
    public List<StudentResultDTO> getStudent()  {
        List<StudentResultDTO> studentResultDTOs=selectStudentMapper.selectStudent();
        return studentResultDTOs;
    }
}
