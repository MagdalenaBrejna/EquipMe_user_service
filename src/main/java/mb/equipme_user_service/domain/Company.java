package mb.equipme_user_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "companies")
public class Company extends User {

    public Company(UUID userId, String userEmail, String userPassword, Boolean accountEnabled, String userTelephone, byte[] userImage, Boolean getNotification, String userBankAccountNumber, String name, String NIP, String upc) {
        super(userId, userEmail, userPassword, accountEnabled, userTelephone, userImage, getNotification, userBankAccountNumber, upc);
        this.name = name;
        this.NIP = NIP;
    }

    @Column(name="name")
    private String name;

    @Column(name="nip")
    private String NIP;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "company_localisation", joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns = @JoinColumn(name = "localisation_id"))
    Set<Localisation> localisations = new HashSet<>();

}
