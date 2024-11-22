package br.com.pedrocolombano.macrocalculator.model.dto.request;

import java.math.BigDecimal;

public record CuttingMacroDto(BigDecimal weight,
                              BigDecimal cuttingRate) {
}
