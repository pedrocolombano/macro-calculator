package br.com.pedrocolombano.macrocalculator.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class MacroDto {

    private BigDecimal fatAmount;
    private BigDecimal proteinAmount;
    private BigDecimal carbohydrateAmount;

}
