package com.gaoshu.controller;

import com.gaoshu.model.Gzb;
import com.gaoshu.service.GzbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GzbController {
    @Autowired
    private GzbService gzbService;
    @RequestMapping("/selectAllGzb.do")
    public String selectAllGzb(Model model){


        return "";
    }
    @RequestMapping("/selectByGzid.do")
    public String selectByGzid(int gzid){

        return "";
    }
    @RequestMapping("/updateGzb.do")
    public String updateGzb(Gzb gzb){


        return "";
    }
    @RequestMapping("/insertGzb.do")
    public String insertGzb(Gzb gzb){


        return "";
    }
    @RequestMapping("/deleteByGzid.do")
    public String deleteByGzid(int gzid){


        return "";
    }
}
