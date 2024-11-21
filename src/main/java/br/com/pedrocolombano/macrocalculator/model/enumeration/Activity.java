package br.com.pedrocolombano.macrocalculator.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public enum Activity {

    LOW(BigDecimal.valueOf(1.3)),
    MODERATE(BigDecimal.valueOf(1.5)),
    HIGH(BigDecimal.valueOf(1.7));

    private final BigDecimal caloriesConstant;

}
