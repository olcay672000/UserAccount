package org.csystem.service.patience.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_account_id")
    public int id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String surname;

    @Column(nullable = false)
    public double age;

    @Column(nullable = false)
    public String address;

    @Column(nullable = false)
    public String email;


    @Column(nullable = false)
    public String phoneNumber;


    @Column(nullable = false)
    public LocalDateTime loginTime;


    @Column(nullable = false)
    public LocalDateTime logoutTime;

    @Column(nullable = false)
    public LocalDateTime registerTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    public Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "family_role_id")
    public FamilyRole familyRole;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comments_and_messages_id")
    public CommentsAndMessages commentsAndMessages;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "diseases")
    public Set<Diseases> diseases;
}
