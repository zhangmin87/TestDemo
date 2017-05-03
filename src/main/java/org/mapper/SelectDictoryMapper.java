package org.mapper;

import org.apache.ibatis.annotations.Param;
import org.dto.dictory.DictoryDTO;

import java.util.List;

/**
 * Created by zhongdepeng on 2017/5/3.
 */
public interface SelectDictoryMapper {
    List<DictoryDTO> selectDictory(@Param("category") String category );
}
