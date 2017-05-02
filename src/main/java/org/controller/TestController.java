package org.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey;
import com.infoccsp.framework.web.springmvc.controller.PaginationableController;
import org.common.helper.OptionHelper;
import org.dto.dictory.DictoryDTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhongdepeng on 2017/5/2.
 */
public abstract class TestController extends PaginationableController {

    @Autowired
    private OptionHelper optionHelper;

    /**
     * 基于数据字典的下拉框
     */
    public List<DictoryDTO> getDictionary(String category){
        return optionHelper.getDictionaryOptions(category);
    }
}
