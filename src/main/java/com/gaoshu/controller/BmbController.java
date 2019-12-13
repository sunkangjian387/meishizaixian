package com.gaoshu.controller;

import com.gaoshu.model.Bmb;
import com.gaoshu.service.BmbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BmbController {
    @Autowired
    private BmbService bmbService;
    @RequestMapping("/seleceAllBmb.do")
    public String seleceAllBmb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Bmb> bmbs = bmbService.selectAllBmb();
        PageInfo<Bmb> bmbPageInfo = new PageInfo<>(bmbs);
        model.addAttribute("bmbPageInfo",bmbPageInfo);
        return"bmbShow";
    }
    @RequestMapping("/selectByBmid.do")
    public String selectByBmid(Model model, int bmid){

        return "";
    }

    @RequestMapping("/insertBmb.do")
    public String insertBmb(Model model,Bmb bmb){

        int i = bmbService.insertBmb(bmb);
        if(i>0){

            return "redirect:seleceAllBmb.do";
        }
        return"bmbAdd";
    }
    @RequestMapping("/updateByBmid.do")
    public String updateByBmid(Model model,int bmid){



        return"";
    }
    @RequestMapping("/deleteByBmid.do")
    public String deleteByBmid(Model model,int bmid){


        return "";
    }
}
