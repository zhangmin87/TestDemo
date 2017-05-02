package org.common.helper;

import org.dto.dictory.DictoryDTO;
import org.service.DataCenterfacade.BasicdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/5/2.
 */
@Component("optionHelper")
public class OptionHelper {
    //基础数据
    @Autowired
    private BasicdataService basicdataService;

    public List<DictoryDTO> getDictionaryOptions(String category){
        return basicdataService.getDictionaryOptions(category);
    }
}
