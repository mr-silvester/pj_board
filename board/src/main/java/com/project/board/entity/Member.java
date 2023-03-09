package com.project.board.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter @Setter
@Accessors(chain=true)
public class Member {
    private Long memberId;
    private String name;
    private String password;
    private String memberType = "user";
    private Date signUpDate;
    private Date bannedDate;
}
