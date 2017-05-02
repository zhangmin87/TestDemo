package org.entity;



import com.infoccsp.framework.dao.entity.AuditableEntity;
import org.Constant.Constants;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhongdepeng on 2017/4/27.
 */
@Entity
@Table(name = "T_BAS_DICT",schema = Constants.DB_SHEMA_NAME)
public class Dictory extends AuditableEntity {

    /**
     * pk
     */
    @Id
    @SequenceGenerator(name = "SEQ_T_BAS_COMMON",sequenceName = "SEQ_T_BAS_COMMON", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_T_BAS_COMMON")
    @Column(name="DICT_ID")
    private Long dictId;

    /**
     * 类别
     */
    @Column(name = "CATEGORY")
    private String category;

    /**
     * 代码
     */
    @Column(name="DICT_CODE")
    private String dictCode;

    /**
     * 名称
     */
    @Column(name = "DICT_NAME")
    private String dictName;

    /**
     * 序列。排序用
     */
    @Column(name = "SEQ")
    private String seq;

    /**
     * key1
     */
    @Column(name = "KEY1")
    private String key1;

    /**
     * key2
     */
    @Column(name = "KEY2")
    private String key2;

    /**
     * key3
     */
    @Column(name = "KEY3")
    private String key3;

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    @Override
    public Serializable getId() {
        return dictId;
    }

}
