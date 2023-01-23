package com.dream.crm.workbench.mapper;

import com.dream.crm.workbench.pojo.Clue;

import java.util.List;
import java.util.Map;

public interface ClueMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    int insertSelective(Clue record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    int updateByPrimaryKeySelective(Clue record);

    /**
     * 保存创建线索
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    int insertClue(Clue clue);

    /**
     * 根据条件查询线索
     * @param map
     * @return
     */
    List<Clue> selectClueByConditionForPage(Map<String,Object> map);

    /**
     * 根据条件查询有多少条记录
     * @param map
     * @return
     */
    int selectCountOfClueByCondition(Map<String,Object> map);

    /**
     * 通过id删除线索
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    int deleteByPrimaryKey(String[] ids);

    /**
     * 通过 id 线索
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    Clue selectByPrimaryKey(String id);

    /**
     * 将更新的数据保存
     *
     * @mbggenerated Sun Jan 15 20:00:15 CST 2023
     */
    int updateByPrimaryKey(Clue clue);

    /**
     * 查看线索的详细信息
     * @param id
     * @return
     */
    Clue selectClueForDetailById(String id);

    /**
     * 根据id查询线索信息
     * @param id
     * @return
     */
    Clue selectClueById(String id);
}