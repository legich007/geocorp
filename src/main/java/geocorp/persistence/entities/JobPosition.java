package geocorp.persistence.entities;

import com.google.common.base.Objects;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class JobPosition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String title;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title);
    }
}
