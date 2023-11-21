package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @Column(name="MEMBER_ID")
    private Long id;

    @Column(length = 10)
    private String name;
    private String city;
    private String street;
    private String zipcode;
}
