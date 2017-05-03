package org.service.DataCenterfacade;


import com.infoccsp.framework.core.pagination.OrderablePaginationDTO;
import com.infoccsp.framework.core.pagination.PaginationResultDTO;
import framework.core.utils.CollectionUtils;
import framework.core.utils.StringUtils;
import framework.dao.orm.hibernate.query.SafeDetachedCriteria;
import framework.dao.orm.hibernate.query.SafeRestrictions;
import org.assemble.DictionaryAssembler;
import org.dto.dictory.DictoryDTO;
import org.entity.Dictory;
import org.hibernate.criterion.Order;
import org.mapper.SelectDictoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;


import java.util.List;

/**
 * Created by zhangmin on 2017/4/28.
 */
@Service("dictionaryService")
public class DictoryServiceImpl extends BaseServiceImpl implements DictoryService {
    // Assembler
    @Resource(name = "dictionaryAssembler")
    private DictionaryAssembler assembler;

    //注入mapper
    @Autowired
    private SelectDictoryMapper mapper;
    public List<DictoryDTO> getDictionaryOption(String category) {
        List<DictoryDTO> dictoryDTOs=mapper.selectDictory(category);
        return dictoryDTOs;
    }
    /**
     * 按照类别获取查询字典项
     */
    protected List<Dictory> selectDictorynaizes(String category){
        // 查询条件
        SafeDetachedCriteria criteria = SafeDetachedCriteria.forClass(Dictory.class);
        // 类别
        criteria.add(SafeRestrictions.equal("category",category));
        // 排序
        criteria.addOrder(Order.asc("seq"));
        // 查询
        return getEntityManager().queryForListByCriteria(Dictory.class, criteria);
    }

    public DictionaryAssembler getDictionaryAssembler() {
        return assembler;
    }
}
