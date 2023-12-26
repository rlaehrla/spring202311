package org.choongang.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.choongang.commons.MemberType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.AuditingBeanDefinitionParser;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name="USERS", indexes = @Index(name = "idx_member_createdAt", columnList = "createdAt DESC"))
//@EntityListeners(AuditingEntityListener.class) 공통속성 Base로 따로 작성
public class Member extends Base{
    @Id @GeneratedValue
    private Long seq;

    @Column(length = 80, unique = true, nullable = false)
    private String email;

    @Column(length = 40, nullable = false) // false로 해야 db에 notnull 조건 걸림
    private String name;

    @Column(length = 65, name="userPw", nullable = false) // DB에 작성되는 컬럼명
    private String password; // varchar2

    //@Lob
    @Transient
    private String introduction; // CLOB

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private MemberType type;

/*  공통속성 Base로 따로 작성
    //@CreationTimestamp // INSERT SQL 실행시
    @CreatedDate
    private LocalDateTime createdAt;

    //@UpdateTimestamp // UPDATE SQL 실행시
    @LastModifiedDate
    private LocalDateTime modifiedAt;
 */

    //@Temporal(TemporalType.DATE) // 날짜
    //@Temporal(TemporalType.TIME) // 시간
    //@Temporal(TemporalType.TIMESTAMP) // 날짜 + 시간
    //public Date dt;
}

