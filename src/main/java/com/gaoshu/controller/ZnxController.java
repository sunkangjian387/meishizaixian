package com.gaoshu.controller;

import com.gaoshu.model.Znx;
import com.gaoshu.service.ZnxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ZnxController {
    @Autowired
    private ZnxService znxService;
    @RequestMapping("/selectAllZnx.do")
    public String selectAllZnx(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Znx> znxes = znxService.selectAllZnx();
        PageInfo<Znx> znxePageInfo = new PageInfo<>(znxes);
        model.addAttribute("znxePageInfo",znxePageInfo);

        return "znxShow";
    }

    @RequestMapping("/selectByZnid.do")
    public String selectByZnid(Model model,int znid){



        return "";
    }
    @RequestMapping("/updateZnx.do")
    public String updateZnx(Model model,Znx znx){



        return "";
    }
    @RequestMapping("/insertZnx.do")
    public String insertZnx(Model model,Znx znx){


        return "";
    }
    @RequestMapping("/deleteByZnid.do")
    public String deleteByZnid(Model model,int znid){

        int i = znxService.deleteByZnid(znid);
        return "redirect:selectAllZnx.do";
    }
}
