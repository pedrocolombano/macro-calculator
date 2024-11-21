package br.com.pedrocolombano.macrocalculator.model.dto;

import br.com.pedrocolombano.macrocalculator.model.enumeration.Activity;
import br.com.pedrocolombano.macrocalculator.model.enumeration.BasalMetabolicRate;

import java.math.BigDecimal;

public record PersonDataDto(BigDecimal weight,
                            BigDecimal height,
                            BasalMetabolicRate gender,
                            Integer age,
                            Activity activity) {
}
