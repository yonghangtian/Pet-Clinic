package tian.springframework.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author tianyh
 * @since 5/28/19 5:37 PM
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Column(name = "name")
    private String name;
}
