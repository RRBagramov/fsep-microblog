package ru.fsep.models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 08.07.2017
 *
 * @author Robert Bagramov.
 */

@Entity
@Table(name="`user`")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column(name = "photo_link")
    private String photoLink;

    @OneToMany(mappedBy = "user")
    private Set<Follower> followers = new HashSet<Follower>();

    @OneToMany(mappedBy = "user")
    private Set<Following> following = new HashSet<Following>();

    @OneToMany(mappedBy = "user")
    private Set<Post> posts = new HashSet<Post>();

    @OneToMany(mappedBy = "user")
    private Set<UserInfo> userInfo = new HashSet<UserInfo>();
}

