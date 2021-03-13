package com.hello.wooseok.controller;

import com.hello.wooseok.Domain.BoardVo;
import com.hello.wooseok.Service.BoardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board/list")
    public String list(Model model){

        model.addAttribute("boardList", boardService.list());
        return "/board/list";
    }

    @RequestMapping(value = "/board/write")
    public String write(Model model){
        model.addAttribute("boardVo", new BoardVo());
        return "/board/write";
    }
    @RequestMapping(value = "/board/write", method = RequestMethod.POST)
    public String write(BoardVo boardVo, BindingResult result){
        if(result.hasErrors()){
            return "/board/write";
        }
        boardService.write(boardVo);
        return "redirect:/board/list";
    }

    @RequestMapping(value = "/board/edit/{seq}", method = RequestMethod.GET)
    public String edit(@PathVariable int seq, Model model){
        BoardVo boardVo = boardService.read(seq);
        model.addAttribute("boardVo", boardVo);
        return "board/edit";
    }

    @RequestMapping(value = "/board/edit/{seq}", method = RequestMethod.POST)
    public String edit(BoardVo boardVo, BindingResult result, int pwd, Model model){
        if(result.hasErrors()){
            return "board/edit";
        }else{
            if(boardVo.getPassword() == pwd){
                boardService.edit(boardVo);
                return "redirect:/board/list";
            }

            model.addAttribute("msg", "비밀번호가 일치하지 않습니다");
            return "/board/edit";
        }
    }

    @RequestMapping(value = "/board/read/{seq}")
    public String read(Model model, @PathVariable int seq){
        model.addAttribute("boardVo", boardService.read(seq));
        return "/board/read";
    }

    @RequestMapping(value = "/board/delete/{seq}")
    public String delete(@PathVariable int seq, Model model){
        model.addAttribute("seq", seq);
        return "/board/delete";
    }

    @RequestMapping(value = "/board/delete", method = RequestMethod.POST)
    public String delete(int seq, int pwd, Model model){
        int rowCount;
        BoardVo boardVo = new BoardVo();
        boardVo.setSeq(seq);
        boardVo.setPassword(pwd);

        rowCount = boardService.delete(boardVo);

        if(rowCount == 0){
            model.addAttribute("seq", seq);
            model.addAttribute("msg", "비밀번호가 일치하지 않습니다");
            return "/board/delete";
        }else{
            return "redirect:/board/list";
        }
    }
}

