package ru.fsep.models;

import lombok.*;

import javax.persistence.*;

/**
 * 08.07.2017
 *
 * @author Robert Bagramov.
 */

@Entity
@Table(name = "user_info")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "followers_count", nullable = false)
    private Long followersCount;

    @Column(name = "following_count", nullable = false)
    private Long followingCount;

    @Column(name = "posts_count", nullable = false)
    private Long postsCount;
}
