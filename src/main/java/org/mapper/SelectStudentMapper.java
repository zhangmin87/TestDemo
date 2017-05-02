package org.mapper;

import org.dto.student.StudentResultDTO;

import java.util.List;

/**
 * create by zhangmin on 2017/4/20.
 */
public interface SelectStudentMapper {
    List<StudentResultDTO>  selectStudent();
}
