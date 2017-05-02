package org.dto.dictory;

/**
 * 数据字典项目
 */
public class DictoryDTO  implements java.io.Serializable{
    /**
     * Id
     */
    private Long id ;

    /**
     * 类别
     */
    private String category;

    /**
     * 代码
     */
    private String dictCode;

    /**
     * 名称
     */
    private String dictName;

    /**
     * 序列，排序用
     */
    private String seq;

    /**
     * KEY1
     */
    private String key1;

    /**
     * key2
     */
    private String key2;

    /**
     * key3
     */
    private String key3;

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
