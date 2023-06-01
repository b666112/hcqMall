package com.hcq.hcqmall.search;

import com.alibaba.fastjson.JSON;
import com.hcq.hcqmall.search.config.hcqmallElasticSearchConfig;
import lombok.Data;
import lombok.ToString;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.Avg;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class hcqmallSearchApplicationTests {

    @Autowired
    private RestHighLevelClient client;

    @Test
    public void searchData() throws IOException {
        //创建请求
        SearchRequest searchRequest = new SearchRequest();
        //指定索引
        searchRequest.indices("bank");
        ///指定dsl，检索条件
        //SearchSourceBuilder sourceBuilder
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        //1.1构造检索条件
        sourceBuilder.query(QueryBuilders.matchQuery("address","mill"));
        //按照年龄的值分布进行聚合
        TermsAggregationBuilder ageAgg = AggregationBuilders.terms("ageAgg").field("age").size(10);
        //计算平均薪资
        AvgAggregationBuilder field = AggregationBuilders.avg("balanceAvg").field("balance");
        sourceBuilder.aggregation(ageAgg);
        sourceBuilder.aggregation(field);
        searchRequest.source(sourceBuilder);

        //2.执行检索；
        SearchResponse search = client.search(searchRequest, hcqmallElasticSearchConfig.COMMON_OPTIONS);

        //3.分析结果
        System.out.println(search.toString());
//        Map map = JSON.parseObject(search.toString(), Map.class);
        //3.1获取所有查到的结果
        for (SearchHit hit : search.getHits()) {
            String sourceAsString = hit.getSourceAsString();
            JsonRootBean jsonRootBean = JSON.parseObject(sourceAsString, JsonRootBean.class);
            System.out.println(jsonRootBean);
        }
        //3.2获取 这次检索到的分析信息
        Aggregations aggregations = search.getAggregations();
//        for (Aggregation aggregation : aggregations.asList()) {
//            System.out.println(aggregation.getName());
//        }
        Terms ageAgg1 = aggregations.get("ageAgg");
        for (Terms.Bucket bucket : ageAgg1.getBuckets()) {
            String keyAsString = bucket.getKeyAsString();
        }
        Avg balanceAgg = aggregations.get("balanceAvg");
        System.out.println("平均薪资:"+balanceAgg.getValue());


    }
}


@Data
@ToString
 class JsonRootBean {

    private int account_number;
    private int balance;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String address;
    private String employer;
    private String email;
    private String city;
    private String state;

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}