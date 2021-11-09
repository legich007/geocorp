package geocorp.persistence.entities;


import com.google.common.base.Objects;
import geocorp.persistence.enums.PointType;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class GeoPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 100)
    private String pointTitle;

    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private PointType pointType;

    @ManyToOne(optional = false)
    private City city;

    @Column(nullable = false, length = 200)
    private String address;

    @Column(nullable = false)
    private String comment;

    @ManyToMany
    private Set<Geodesy> geodesies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoPoints geoPoints = (GeoPoints) o;
        return id == geoPoints.id &&
                Objects.equal(pointTitle, geoPoints.pointTitle) &&
                pointType == geoPoints.pointType &&
                Objects.equal(city, geoPoints.city) &&
                Objects.equal(address, geoPoints.address) &&
                Objects.equal(comment, geoPoints.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, pointTitle, pointType, city, address, comment);
    }
}
