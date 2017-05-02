package org.service;

import org.dto.student.StudentResultDTO;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/24.
 */
public interface StudentService {
    List<StudentResultDTO> getStudent();
}
