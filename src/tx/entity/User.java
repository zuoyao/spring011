package tx.entity;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/7/24.
 */
public class User {
    private Integer id;
    private String name;
    private BigDecimal bigDecimal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigDecimal=" + bigDecimal +
                '}';
    }
}
