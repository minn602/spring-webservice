package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//주요 어노테이션을 클래스에 가까이 둔다.
@Getter //클래스 내 모든 필드의 Getter 메소드를 자동생성 해준다.
@NoArgsConstructor //기본 생성자 자동추가
@Entity //테이블과 연결된 클래스임을 나타낸다.
public class Posts {
    @Id //해당 테이블의 PK(primary key, 테이블에서 유일한 값)필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타낸다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스를 생성한다.
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

//setter 가 없는 이유?
//setter가 생성되어 있는 경우 차후 기능 변경시 복잡해 지므로 Entity 클래스에선 setter 메소드를 만들지 않는다.
