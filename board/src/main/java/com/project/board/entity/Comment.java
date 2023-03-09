package com.project.board.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain=true)
public class Comment {
    private Long commentId;
    private Member member;
    private Post post;
    private String parentCommentId;
    private String commentContent;
    private String commentedDate;
}
