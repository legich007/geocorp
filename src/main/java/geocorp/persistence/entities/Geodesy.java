package geocorp.persistence.entities;

import com.google.common.base.Objects;
import geocorp.persistence.enums.GeodesyType;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Geodesy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 30)
    private String objectTitle;


    @Column(nullable = false, length = 200)
    private String objectAddress;

    @Column(nullable = false, length = 10)
    private double size;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private GeodesyType geodesyType;

    @ManyToOne(optional = false)
    private CrewList crewList;

    @ManyToOne(optional = false)
    private City city;

    @ManyToMany
    private Set<GeoPoints> geoPointsSet;

    @ManyToMany
    private Set<JobOrder> jobOrders;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geodesy geodesy = (Geodesy) o;
        return id == geodesy.id &&
                Double.compare(geodesy.size, size) == 0 &&
                Objects.equal(objectTitle, geodesy.objectTitle) &&
                Objects.equal(objectAddress, geodesy.objectAddress) &&
                geodesyType == geodesy.geodesyType &&
                Objects.equal(crewList, geodesy.crewList) &&
                Objects.equal(city, geodesy.city);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, objectTitle, objectAddress, size, geodesyType, crewList, city);
    }
}
