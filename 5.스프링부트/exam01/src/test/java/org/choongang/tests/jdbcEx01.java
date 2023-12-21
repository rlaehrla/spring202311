package org.choongang.tests;

import lombok.extern.slf4j.Slf4j;
import org.choongang.entities.Member;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@Slf4j
public class jdbcEx01 {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>)repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = repository.findById(18L).orElse(null);

        member.setUserNm("(수정)사용자01");
        member.setModDt(LocalDateTime.now());

        repository.save(member);
    }

    @Test
    void test3() {
        Member member = repository.findByUserId("user01");
        log.info(member.toString());
    }

    @Test
    void test4() {
        List<Member> members = repository.findByUserNmContainingOrUserIdContainingOrderByRegDtDesc("용","Id");
        members.forEach(System.out::println);

    }
}
