package org.controller;

import org.Constant.Constants;
import org.dto.student.StudentQueryDTO;
import org.dto.student.StudentResultDTO;
import org.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/20.
 */
@Controller
@RequestMapping("/student")
public class StudentController extends TestController {

    @Resource(name="studentService")

    private StudentService studentService;


    @RequestMapping(method ={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView excute(){
        List<StudentResultDTO> student=studentService.getStudent();
        ModelAndView modelAndView = new ModelAndView("student/select");
        modelAndView.addObject(Constants.DICT_DECLSTS,getDictionary(Constants.DICT_DECLSTS));
        modelAndView.addObject(Constants.DICT_CUSTOMS_RSPCODE,getDictionary(Constants.DICT_CUSTOMS_RSPCODE));
        modelAndView.addObject(Constants.CUSTOMS_CODE,getDictionary(Constants.CUSTOMS_CODE));
        modelAndView.addObject("queryDTO",new StudentQueryDTO());
        return modelAndView;
    }
}

