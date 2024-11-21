package br.com.pedrocolombano.macrocalculator.service;

import br.com.pedrocolombano.macrocalculator.model.dto.MetabolicRateDto;
import br.com.pedrocolombano.macrocalculator.model.dto.PersonDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class MetabolicRateService {

    private final BasalMetabolicRateService basalMetabolicRateService;
    private final TotalMetabolicRateService totalMetabolicRateService;

    public MetabolicRateDto calculate(final PersonDataDto personDataDto) {
        BigDecimal basalRate = basalMetabolicRateService.calculate(personDataDto.weight(),
                                                                   personDataDto.height(),
                                                                   personDataDto.age(),
                                                                   personDataDto.gender());

        BigDecimal totalRate = totalMetabolicRateService.calculate(basalRate, personDataDto.activity());
        return new MetabolicRateDto(basalRate, totalRate);
    }

}
