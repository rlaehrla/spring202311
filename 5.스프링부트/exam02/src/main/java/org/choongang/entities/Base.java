package org.choongang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass // 공통 속성화를 위한 상위 클래스
@EntityListeners(AuditingEntityListener.class) // @CreatedDate, @LastModifiedDate 사용하려면 필수 애노테이션
public abstract class Base {

    @CreatedDate
    @Column(updatable = false) // 추가 O, 수정 X
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false) // 추가 X, 수정 O
    private LocalDateTime modifiedAt;
}
