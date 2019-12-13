package com.gaoshu.controller;

import com.gaoshu.model.Yhb;
import com.gaoshu.service.YHService;
import com.gaoshu.util.UploadUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class YHController {
    @Autowired
    private YHService yhService;
    @RequestMapping("/login.do")
    public String login(HttpSession session, String yhnc, String yhmm){
        Yhb yhb=yhService.SelectByYhmimaAndYhnc(yhmm, yhnc);
        if (yhb!=null){

            session.setAttribute("yhb",yhb);
            return "homeframe";
        }
        return "redirect:backJsp/login.html";
    }
    @RequestMapping("/loginGetLoginName.do")
    @ResponseBody
    public String loginGetLoginName(HttpSession session){

        Yhb yhb = (Yhb)session.getAttribute("yhb");
        String yhnc = yhb.getYhnc();
        return yhnc;
    }
    @RequestMapping("/out.do")
    public String out(HttpSession session){

        session.removeAttribute("yhb");

        return "redirect:backJsp/login.html";
    }
    @RequestMapping("/select.do")
    public void select(){
        System.out.println("sswddaz");
    }
    @RequestMapping("/selecta.do")
    public void selecta(){
        System.out.println("asdfghj");
    }
    @RequestMapping("/selectAll.do")
    public String selectAll(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,5);
        List<Yhb> yhbs = yhService.selectAll();
        PageInfo<Yhb> yhbPageInfo = new PageInfo<>(yhbs);
        model.addAttribute("yhbPageInfo",yhbPageInfo);
        return "yhbShow";
    }

    @RequestMapping("/selectByYhid.do")
    public String selectByYhid(Model model,int yhid){

        Yhb yhb = yhService.selectByYhid(yhid);
        model.addAttribute("yhb",yhb);
        return "ynbUpdate";
    }
    @RequestMapping("/updateYhb.do")
    public String updateYhb(MultipartFile imgFile,Yhb yhb){
        //得到文件名
        String filename = imgFile.getOriginalFilename();
        //得到新文件名
        String newFileName=UUID.randomUUID().toString()+filename.substring(filename.indexOf("."));
        //存放上传图片的文件夹
        File imgDirFile = UploadUtil.getImgDirFile();
        //输出文件夹的绝对路径
        System.out.println(imgDirFile.getAbsolutePath());
        try {
            //构建真实路径
            File file = new File(imgDirFile.getAbsolutePath() + File.separator + newFileName);
            System.out.println(file.getAbsolutePath());
            //上传图片到绝对路径
            imgFile.transferTo(file);

            yhb.setYhtx(newFileName);
            int i = yhService.updateYhb(yhb);
            if(i>0){
                return "redirect:selectAll.do";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "ynbUpdate";
    }
    @RequestMapping("/insertYhb.do")
    public String insertYhb(MultipartFile imgFile, Yhb yhb){
        //得到文件名
        String filename = imgFile.getOriginalFilename();
        //得到新文件名
        String newFileName=UUID.randomUUID().toString()+filename.substring(filename.indexOf("."));
        //存放上传图片的文件夹
        File imgDirFile = UploadUtil.getImgDirFile();
        //输出文件夹的绝对路径
        System.out.println(imgDirFile.getAbsolutePath());
        try {
            //构建真实路径
            File file = new File(imgDirFile.getAbsolutePath() + File.separator + newFileName);
            System.out.println(file.getAbsolutePath());
            //上传图片到绝对路径
            imgFile.transferTo(file);

            yhb.setYhtx(newFileName);
            int i = yhService.insertYhb(yhb);
            if(i>0){
                return "redirect:selectAll.do";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "yhbAdd";
    }
    @RequestMapping("/deleteByYhid.do")
    public String deleteByYhid(Model model,int yhid){


        return "";
    }
}
