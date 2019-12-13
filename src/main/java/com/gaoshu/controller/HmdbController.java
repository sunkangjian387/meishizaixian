package com.gaoshu.controller;

import com.gaoshu.model.Hmdb;
import com.gaoshu.service.HmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HmdbController {
    @Autowired
    private HmdbService hmdbService;
    @RequestMapping("/selectAllHmdb.do")
    public String selectAllHmdb(Model model){

        return "";
    }
    @RequestMapping("/selectByHmdid.do")
    public String selectByHmdid(Model model,int hmdid){

        return "";
    }
    @RequestMapping("/updateHmdb.do")
    public String updateHmdb(Model model,Hmdb hmdb){


        return "";
    }
    @RequestMapping("/insertHmdb.do")
    public String insertHmdb(Model model,Hmdb hmdb){


        return"";
    }
    @RequestMapping("/deleteByHmdid.do")
    public String deleteByHmdid(Model model,int hmdid){

        return "";
    }
}
