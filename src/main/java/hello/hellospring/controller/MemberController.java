package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    // 생성자 Alt + insert
    @Autowired  // controller와 service 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
