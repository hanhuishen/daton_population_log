package com.springmvc.dao;

import com.springmvc.entity.Birthcontrolinfo;

public interface BirthcontrolinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int deleteByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insert(Birthcontrolinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insertSelective(Birthcontrolinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    Birthcontrolinfo selectByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKeySelective(Birthcontrolinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table birthcontrolinfo
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKey(Birthcontrolinfo record);
}