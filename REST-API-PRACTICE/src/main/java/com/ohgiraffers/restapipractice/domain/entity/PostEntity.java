package com.ohgiraffers.restapipractice.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_post")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private int postId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
}
