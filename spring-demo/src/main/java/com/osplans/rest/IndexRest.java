package com.osplans.rest;

import com.osplans.domain.Loan;
import com.osplans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by zhj on 2017/9/6 0006.
 */

@Controller
public class IndexRest {

    @Autowired
    LoanService loanService;

    @GetMapping("/index/{id}")
    public String index(@PathVariable("id") Integer id, Model model){
        Loan loan = loanService.getLoanById(id);
        model.addAttribute("loan",loan);
        return "index";
    }

}
