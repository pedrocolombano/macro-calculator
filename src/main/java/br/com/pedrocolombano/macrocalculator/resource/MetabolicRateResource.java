package br.com.pedrocolombano.macrocalculator.resource;

import br.com.pedrocolombano.macrocalculator.model.dto.MetabolicRateDto;
import br.com.pedrocolombano.macrocalculator.model.dto.PersonDataDto;
import br.com.pedrocolombano.macrocalculator.service.MetabolicRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/metabolic-rates")
public class MetabolicRateResource {

    private final MetabolicRateService metabolicRateService;

    @PostMapping
    public ResponseEntity<MetabolicRateDto> calculate(@RequestBody PersonDataDto personDataDto) {
        MetabolicRateDto response = metabolicRateService.calculate(personDataDto);
        return ResponseEntity.ok(response);
    }

}
