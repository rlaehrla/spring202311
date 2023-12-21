package org.choongang.repositories;

import org.choongang.entities.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findByUserId(String userId);

    List<Member> findByUserNmContainingOrUserIdContainingOrderByRegDtDesc(String keyword1, String keyword2);

    @Query("SELECT * FROM MEMBER WHERE USER_NM LIKE '%:key%' OR USER_ID '%:key%' ORDER BY REG_DT DESC")
    List<Member> getMembers(@Param("key") String keyword);
}
