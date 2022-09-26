package org.csystem.service.patience.data.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "family_role")
public class FamilyRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "family_role_id")
    public int id;


    @Column(nullable = false)
    public String roleName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "familyRole", cascade = CascadeType.ALL)
    public Set<UserAccount> userAccounts;

}
