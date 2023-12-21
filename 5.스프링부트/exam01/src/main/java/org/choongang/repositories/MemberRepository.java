package org.choongang.repositories;

import org.choongang.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
