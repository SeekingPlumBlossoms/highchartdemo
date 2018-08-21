package com.example.highchartdemo.dao.impl;

import com.example.highchartdemo.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yebin
 */
@Repository
public class QueryDaoImpl implements QueryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public String queryData() {
       final List<String> res=new ArrayList<>();
        String sql="SELECT a.am_msg_title  amMsgTitle from ali_msgtitle_analyse a where a.id=33013";
        jdbcTemplate.query(sql,resultSet -> {
            res.add(resultSet.getString("amMsgTitle"));
        });
        return res.get(0);
    }
}
