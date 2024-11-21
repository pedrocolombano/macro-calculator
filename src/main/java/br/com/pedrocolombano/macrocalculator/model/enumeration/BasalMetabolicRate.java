package br.com.pedrocolombano.macrocalculator.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public enum BasalMetabolicRate {

    MALE(BigDecimal.valueOf(13.75),
         BigDecimal.valueOf(5.0),
         BigDecimal.valueOf(6.75),
         BigDecimal.valueOf(66.5)),

    FEMALE(BigDecimal.valueOf(9.56),
           BigDecimal.valueOf(1.85),
           BigDecimal.valueOf(4.68),
           BigDecimal.valueOf(655.0));

    private final BigDecimal weightConstant;
    private final BigDecimal heightConstant;
    private final BigDecimal ageConstant;
    private final BigDecimal defaultConstant;

}
