package com.springmvc.dao;

import com.springmvc.entity.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int deleteByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    User selectByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Jul 16 17:55:42 CST 2019
     */
    int updateByPrimaryKey(User record);
}