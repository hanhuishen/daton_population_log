package com.springmvc.dao;

import com.springmvc.entity.Employmentinfo;

public interface EmploymentinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int deleteByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insert(Employmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insertSelective(Employmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    Employmentinfo selectByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKeySelective(Employmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employmentinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKey(Employmentinfo record);
}