package com.jojoldu.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

//db layer를 jpa에선 repository로 부른다. 인터페이스로 생성 후 JpaRespository<Entiry 클래스, PK 타입>을 상속해준다.
// -> 기본 CRUD 메소드가 자동 생성된다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}

//Entity 클래스와 레파지토리 인터페이스는 같은 디렉터리에 위치한다.
