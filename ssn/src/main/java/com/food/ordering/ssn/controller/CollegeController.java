package com.food.ordering.ssn.controller;

import com.food.ordering.ssn.column.UserColumn;
import com.food.ordering.ssn.model.CollegeModel;
import com.food.ordering.ssn.service.CollegeService;
import com.food.ordering.ssn.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    CollegeService collegeService;

    @GetMapping(value = "")
    public Response<List<CollegeModel>> getAllColleges(@RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.mobile) String mobile, @RequestHeader(value = UserColumn.role) String role) {
        return collegeService.getAllColleges(oauthId, mobile, role);
    }
}
