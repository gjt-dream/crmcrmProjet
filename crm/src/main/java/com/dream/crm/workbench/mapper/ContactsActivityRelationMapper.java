package com.dream.crm.workbench.mapper;

import com.dream.crm.workbench.pojo.ContactsActivityRelation;

import java.util.List;

public interface ContactsActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    int deleteByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    int insertSelective(ContactsActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    ContactsActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    int updateByPrimaryKeySelective(ContactsActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    int updateByPrimaryKey(ContactsActivityRelation record);

    /**
     * 批量保存创建联系人和市场活动关联关系
     *
     * @mbggenerated Tue Jan 24 11:34:20 CST 2023
     */
    int insertContactsActivityRelationByList(List<ContactsActivityRelation> list);
}