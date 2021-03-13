package com.hello.wooseok.Service;

import java.util.List;
import com.hello.wooseok.Domain.BoardVo;

public interface BoardService {

    public abstract List<BoardVo> list();

    public abstract int delete(BoardVo boardVo);

    public abstract int edit(BoardVo boardVo);

    public abstract void write(BoardVo boardVo);

    public abstract BoardVo read(int seq);

}
