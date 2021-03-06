package geocorp.persistence.entities;

import com.google.common.base.Objects;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String title;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id &&
                Objects.equal(title, city.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title);
    }
}
