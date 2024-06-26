package com.bronya.member.controller;

import com.bronya.common.resp.Result;
import com.bronya.common.util.ResultUtils;
import com.bronya.member.service.MemberService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;
    @GetMapping("/count")
    public Integer count() {
        return memberService.count();
    }
    @PostMapping("/register")
    public Result<?> register(String mobile) {
        return ResultUtils.success(memberService.register(mobile));
    }
}
