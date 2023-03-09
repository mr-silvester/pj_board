package com.project.board.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Accessors(chain=true)
public class Post {
    private Long postId;
    private Member member;
    private String postTitle;
    private String postContent;
    private String postedDate;
    private boolean show;
}
