package mb.equipme_user_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Person extends User {

    public Person(UUID userId, String userEmail, String userPassword, Boolean accountEnabled, String userTelephone, byte[] userImage, Boolean getNotification, String userBankAccountNumber, String name, String lastName) {
        super(userId, userEmail, userPassword, accountEnabled, userTelephone, userImage, getNotification, userBankAccountNumber);
        this.name = name;
        this.lastName = lastName;
    }

    @Column(name="name")
    private String name;

    @Column(name="lastName")
    private String lastName;

    @ManyToOne
    @JoinColumn(name="localisation_id", nullable=false)
    private Localisation localisation;
}
