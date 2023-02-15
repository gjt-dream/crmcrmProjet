package com.dream.crm.workbench.mapper;

import com.dream.crm.workbench.pojo.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    int insert(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    int insertSelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    ClueActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    int updateByPrimaryKeySelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Fri Jan 20 15:30:15 CST 2023
     */
    int updateByPrimaryKey(ClueActivityRelation record);

    /**
     * 批量保存创建的线索和市场活动的关联关系
     * @param list
     * @return
     */
    int insertClueActivityRelationByList(List<ClueActivityRelation> list);

    /**
     * 根据clueId和ActivityId删除市场活动关系
     * @param clueActivityRelation
     * @return
     */
    int deleteClueActivityRelationByClueIdActivityId(ClueActivityRelation clueActivityRelation);

    /**
     * 根据clueId查询线索与市场活动的关联关系
     * @param clueId
     * @return
     */
    List<ClueActivityRelation> selectClueActivityRelationByClueId(String clueId);

    /**
     * 根据ClueId删除线索和市场活动的关联关系
     * @param clueId
     * @return
     */
    int deleteClueRemarkRelationByClueId(String clueId);

}