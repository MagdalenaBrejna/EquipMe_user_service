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
@Table(name = "localisations")
public class Localisation extends BaseEntity {

    public Localisation(UUID id, String city, String province, String upc) {
        super(id, upc);
        this.city = city;
        this.province = province;
    }
    
    @Column(name="city")
    private String city;

    @Column(name="province")
    private String province;

    @OneToMany(mappedBy="localisation")
    private Set<Person> peoples;

    @ManyToMany(mappedBy = "localisations")
    private Set<Company> companies = new HashSet<>();

}
