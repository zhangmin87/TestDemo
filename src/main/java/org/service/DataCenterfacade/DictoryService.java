package org.service.DataCenterfacade;

import org.common.exception.BizLogicException;
import org.dto.dictory.DictoryDTO;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/28.
 */
public interface DictoryService {
    /**
     * 获取类别下所有的数据字典项
     */
    List<DictoryDTO> getDictionaryOption(String category) throws BizLogicException;
}
