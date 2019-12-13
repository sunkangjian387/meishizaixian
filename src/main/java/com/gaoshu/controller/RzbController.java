package com.gaoshu.controller;

import com.gaoshu.model.Rzb;
import com.gaoshu.service.RzbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RzbController {
    @Autowired
    private RzbService rzbService;
    @RequestMapping("/selectAllRzb.do")
    public String selectAllRzb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Rzb> rzbs = rzbService.selectAllRzb();
        PageInfo<Rzb> rzbPageInfo = new PageInfo<>(rzbs);
        model.addAttribute("rzbPageInfo",rzbPageInfo);
        return "rzbShow";
    }
    @RequestMapping("/selectByRzid.do")
    public String selectByRzid(Model model,int rzid){

        return "";
    }
    @RequestMapping("/updateRzb.do")
    public  String updateRzb(Model model,Rzb rzb){


        return "";
    }
    @RequestMapping("/insertRzb.do")
    public String insertRzb(Model model,Rzb rzb){


        return "";
    }
    @RequestMapping("/ deleteByRzid.do")
    public String deleteByRzid(Model model,int rzid){

        return "";
    }
}
