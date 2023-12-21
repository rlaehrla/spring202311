package org.choongang.controllers.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join() {
        log.info("로그 메세지!");
        log.info("로그 {}, {}", "값1", "값2");
        return "member/join";
    }
}
