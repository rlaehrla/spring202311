package controllers.admin;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("adminMemberController")
@RequestMapping("/admin/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberDao memberDao;

    @GetMapping // /admin/member 상단쪽에 주소가 맵핑됨
    public String index(@ModelAttribute MemberSearch search, Model model) {

        List<Member> members = memberDao.getList(search);
        model.addAttribute("members", members);

        return "admin/member/list";
    }

}
