package com.dream.crm.workbench.mapper;

import com.dream.crm.workbench.pojo.CustomerRemark;

import java.util.List;

public interface CustomerRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    int deleteByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    int insertSelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    CustomerRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    int updateByPrimaryKeySelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    int updateByPrimaryKey(CustomerRemark record);

    /**
     * 批量保存创建的客户备注
     *
     * @mbggenerated Tue Jan 24 10:21:35 CST 2023
     */
    int insertCustomerRemarkByList(List<CustomerRemark> list);
}