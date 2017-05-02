package org.service.DataCenterfacade;

import org.dto.dictory.DictoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/28.
 */
@Component("basicdataService")
public class DatacenterFacadeImpl implements BasicdataService {

    @Autowired
    private DictoryService dictoryService;
    //数据字典
    public List<DictoryDTO> getDictionaryOptions(String category) {
        return dictoryService.getDictionaryOption(category);
    }
}
