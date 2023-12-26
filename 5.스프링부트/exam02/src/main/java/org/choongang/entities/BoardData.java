package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class BoardData extends Base{

    @Id @GeneratedValue
    private Long seq; // 숫자, 기본키, 증감

    @Column(length = 100, nullable = false)
    private String subject; // 제목(한줄 텍스트)

    @Lob
    @Column(nullable = false)
    private String content; // 내용(여러줄 텍스트)


}
