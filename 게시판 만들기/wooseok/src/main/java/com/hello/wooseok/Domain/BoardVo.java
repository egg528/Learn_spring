package com.hello.wooseok.Domain;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.sql.Timestamp;

@Alias("boardVo")  // alias register, check in memberMapper.xml's resultType
public class BoardVo {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private int password;
    private Timestamp regDate;
    private int cnt;

    public BoardVo(){

    }

    public BoardVo(String title, String content, String writer, int password){
        super();
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.password = password;
        this.cnt = 0;
    }


    public int getSeq() {
        return seq;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public int getPassword() {
        return password;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}