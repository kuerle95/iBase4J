package org.ibase4j.dao.generator;

import java.util.List;
import org.ibase4j.model.generator.SysEvent;

public interface SysEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    int insert(SysEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    SysEvent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    List<SysEvent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysEvent record);
}