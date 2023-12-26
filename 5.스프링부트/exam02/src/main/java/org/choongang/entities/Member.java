package org.choongang.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="USERS", indexes = @Index(name = "idx_member_createdAt", columnList = "createdAt DESC"))
public class Member {
    @Id @GeneratedValue
    private Long seq;
    private String email;
    private String name;
    private String password; // varchar2
    @Lob
    private String introduction; // CLOB

    @CreationTimestamp // INSERT SQL 실행시
    private LocalDateTime createdAt;

    @UpdateTimestamp // UPDATE SQL 실행시
    private LocalDateTime modifiedAt;
}

