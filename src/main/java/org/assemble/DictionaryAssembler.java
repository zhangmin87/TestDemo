package org.assemble;

import framework.core.utils.CollectionUtils;
import org.dto.dictory.DictoryDTO;
import org.entity.Dictory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhongdepeng on 2017/4/28.
 */
@Component("dictionaryAssembler")
public class DictionaryAssembler {
    /**
     * 根据DTO生成Entity对象
     */
    public DictoryDTO assembleDictionaryDTO(Dictory source){
        //数据转换
        final DictoryDTO result = new DictoryDTO();
        result.setId(source.getDictId());
        result.setCategory(source.getCategory());
        result.setDictCode(source.getDictCode());
        result.setDictName(source.getDictName());
        result.setSeq(source.getSeq());
        result.setKey1(source.getKey1());
        result.setKey2(source.getKey2());
        result.setKey2(source.getKey3());
        return result;
    }
    public List<DictoryDTO> assembleDictoryDTO(List<Dictory> source){
        if(CollectionUtils.isEmpty(source)){
            return Collections.emptyList();
        }
        final List<DictoryDTO> result = new ArrayList<DictoryDTO>();
        for(Dictory dictory:source){
            result.add(assembleDictionaryDTO(dictory));
        }
        return result;
    }

}
