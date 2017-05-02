package org.service.dictory;

import org.common.exception.BizLogicException;
import org.dto.dictory.DictoryDTO;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/27.
 */
public interface DictionaryService {
    /**
     * 获取类别下所有的数据字典
     */
    List<DictoryDTO> getDictionaryOptions(String category) throws BizLogicException;
}
