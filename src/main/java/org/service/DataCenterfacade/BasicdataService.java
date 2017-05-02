package org.service.DataCenterfacade;


import org.dto.dictory.DictoryDTO;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/28.
 */
public interface BasicdataService {

    /**
     * 基于数据字典的下拉框
     */
    List<DictoryDTO> getDictionaryOptions(String category) ;
}
