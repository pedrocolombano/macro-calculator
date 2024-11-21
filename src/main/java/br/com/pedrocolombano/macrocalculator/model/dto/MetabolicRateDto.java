package br.com.pedrocolombano.macrocalculator.model.dto;

import java.math.BigDecimal;

public record MetabolicRateDto(BigDecimal basalRate,
                               BigDecimal totalRate) {
}
