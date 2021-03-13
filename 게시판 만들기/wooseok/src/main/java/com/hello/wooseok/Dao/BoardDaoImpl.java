package com.hello.wooseok.Dao;

import com.hello.wooseok.Domain.BoardVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {

    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setsqlMapClient(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<BoardVo> list() {
        return sqlSessionTemplate.selectList("list");
    }


    @Override
    public int delete(BoardVo boardVo) {
        return sqlSessionTemplate.delete("delete", boardVo);
    }


    @Override
    public int deleteAll() {
        return sqlSessionTemplate.delete("deleteAll");
    }

    @Override
    public int update(BoardVo boardVo) {
        return sqlSessionTemplate.update("update", boardVo);
    }

    @Override
    public void insert(BoardVo boardVo) {
        sqlSessionTemplate.insert("insert", boardVo);
    }

    @Override
    public BoardVo select(int seq) {
        BoardVo vo =  (BoardVo) sqlSessionTemplate.selectOne("select", seq);
        return vo;
    }

    @Override
    public int updateReadCount(int seq) {
        return sqlSessionTemplate.update("updateCount", seq);
    }
}


