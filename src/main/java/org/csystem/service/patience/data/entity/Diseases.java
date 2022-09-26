package org.csystem.service.patience.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "diseases")
public class Diseases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diseases_id")
    public int id;

    @Column(nullable = false)
    public String diseaseName;


    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "diseases", cascade = CascadeType.ALL)
    @JoinTable(name = "user_account")
    public Set<UserAccount> userAccounts;
}
