package ma.gstudent.entities;



import javax.persistence.*;
import java.io.Serializable;
// avec la base


@Entity
@Table(name = "T_STUDENT")
public class StudentEntity implements Serializable {
    @Id
    private Long id;
    private String name;
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
