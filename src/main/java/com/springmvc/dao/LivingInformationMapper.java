package com.springmvc.dao;

import com.springmvc.entity.LivingInformation;

public interface LivingInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int deleteByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insert(LivingInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insertSelective(LivingInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    LivingInformation selectByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKeySelective(LivingInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table living_information
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKey(LivingInformation record);
}