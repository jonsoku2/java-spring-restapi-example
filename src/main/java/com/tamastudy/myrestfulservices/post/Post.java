package com.tamastudy.myrestfulservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tamastudy.myrestfulservices.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Integer id;

    private String description;

    // User : Post -> 1 : (0~N), Main : Sub -> Parent : Child
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
}
