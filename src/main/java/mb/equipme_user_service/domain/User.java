package mb.equipme_user_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User extends BaseEntity {

    public User(UUID userId, String userEmail, String userPassword, Boolean accountEnabled, String userTelephone, byte[] userImage, Boolean getNotification, String userBankAccountNumber,  String upc) {
        super(userId, upc);
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.accountEnabled = accountEnabled;
        this.userTelephone = userTelephone;
        this.userImage = userImage;
        this.getNotification = getNotification;
        this.userBankAccountNumber = userBankAccountNumber;
    }

    @Column(name="email")
    private String userEmail;

    @Column(name="password")
    private String userPassword;

    @Column(name="enabled")
    private Boolean accountEnabled;

    @Column(name="telephone")
    private String userTelephone;

    @Column(name="image")
    private byte[] userImage;

    @Column(name="notification")
    private Boolean getNotification;

    @Column(name="bank_account_number")
    private String userBankAccountNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "token_id", referencedColumnName = "id")
    private AccountToken token;
}
