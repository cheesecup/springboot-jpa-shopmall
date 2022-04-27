package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name; // 회원 이름

    @Embedded
    private Address address; // 회원 주소

    @OneToMany(mappedBy = "member") // 읽기 전용
    private List<Order> orders = new ArrayList<>();
}