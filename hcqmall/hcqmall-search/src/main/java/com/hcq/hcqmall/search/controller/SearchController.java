package com.hcq.hcqmall.search.controller;


import com.hcq.hcqmall.search.service.MallSearchService;
import com.hcq.hcqmall.search.vo.SearchParam;
import com.hcq.hcqmall.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
/**
 * @author huchangqi
 */
@Controller
public class SearchController {
    @Autowired
    MallSearchService mallSearchService;
    @GetMapping("/list.html")
    public String listPage(SearchParam param, Model model, HttpServletRequest request) {
        param.set_queryString(request.getQueryString());
        SearchResult result = mallSearchService.search(param);
        model.addAttribute("result",result);
        return "list";
    }
}
