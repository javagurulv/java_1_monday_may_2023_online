package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import java.math.BigDecimal;
import java.util.List;

public class SubObject {
    String name;
    BigDecimal price;
    List <RiskType> riskType;

    public SubObject(String name, BigDecimal price, List <RiskType> risks) {
        this.name = name;
        this.price = price;
        this.riskType = risks;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List <RiskType>  getRiskType() {
        return riskType;
    }
}
