package com.osplans.poidemo.controller;

import com.osplans.poidemo.util.PoiUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/poi")
public class PoiController {


    @PostMapping("/uploadExcel")
    public String uploadExcel(@RequestParam("excel") MultipartFile file) {
        boolean excel = PoiUtils.isExcel(file.getOriginalFilename());
        if (excel) {
            try {
                PoiUtils poiUtils = new PoiUtils(file.getInputStream(), "2007");
                //第二页
                List<List<String>> sheet2 = poiUtils.read(1);
                for (List<String> strings : sheet2) {
                    System.out.println("row:");
                    for (String string : strings) {
                        System.out.print("str="+string+"\n");
                    }
                }

                System.out.println("\n\n\n");
                poiUtils.setPattern("yyyy-MM-dd");
                //第一页
                List<List<String>> read = poiUtils.read(0,1,100);
                for (List<String> strings : read) {
                    System.out.println("row:");
                    for (String string : strings) {
                        System.out.print("str="+string+"\n");
                    }
                }
                return "success";
            } catch (IOException e) {
                e.printStackTrace();
                return "error";
            } catch (Exception e) {
                e.printStackTrace();
                return "error";
            }
        }
        return "error";
    }

    @GetMapping("/downloadExcel")
    public void downloadExcel(HttpServletResponse response) throws IOException, InvalidFormatException {
        FileInputStream fileInputStream = new FileInputStream("/Users/zhanghongju 1/Desktop/files/model.xlsx");
        PoiUtils poiUtils = new PoiUtils(fileInputStream,"2007");
        try {
            String fileName = "Excel-" + String.valueOf(System.currentTimeMillis()).substring(4, 13) + ".xls";
            String headStr = "attachment; filename=\"" + fileName + "\"";
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.setHeader("Content-Disposition", headStr);
            OutputStream out = response.getOutputStream();
            poiUtils.write(0,new ArrayList<List<String>>(){{
                add(new ArrayList<String>(){{
                    add("张三");
                    add("男");
                    add("25");
                }});
                add(new ArrayList<String>(){{
                    add("李四");
                    add("女");
                    add("35");
                }});
                add(new ArrayList<String>(){{
                    add("王五");
                    add("男");
                    add("23");
                }});
            }},1,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
