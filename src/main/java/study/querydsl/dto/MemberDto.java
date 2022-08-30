package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.Data;
import lombok.NoArgsConstructor;
import study.querydsl.entity.Member;

import java.util.List;

import static study.querydsl.entity.QMember.member;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    JPAQueryFactory queryFactory;

    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }


}

