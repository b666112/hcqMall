package com.hcq.hcqmall.search.service;

import com.hcq.hcqmall.search.vo.SearchParam;
import com.hcq.hcqmall.search.vo.SearchResult;
/**
 * @author huchangqi
 */
public interface MallSearchService {
    SearchResult search(SearchParam param);
}
