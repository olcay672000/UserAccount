package org.csystem.service.patience.data.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "commentsAndMessages")
public class CommentsAndMessages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comments_and_messages_id")
    public int id;

    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false)
    public LocalDate questionDate;

    @Column(nullable = false)
    public String questionSender;

    @Column(nullable = false)
    public String questionReceiver;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "commentsAndMessages", cascade = CascadeType.ALL)
    @JoinColumn(name = "user_account_id")
    public UserAccount userAccount;
}
