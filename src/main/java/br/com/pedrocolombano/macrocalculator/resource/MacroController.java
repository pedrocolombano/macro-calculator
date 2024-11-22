package br.com.pedrocolombano.macrocalculator.resource;

import br.com.pedrocolombano.macrocalculator.model.dto.request.CuttingMacroDto;
import br.com.pedrocolombano.macrocalculator.model.dto.response.MacroDto;
import br.com.pedrocolombano.macrocalculator.service.MacroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/macros")
public class MacroController {

    private final MacroService macroService;

    @PostMapping("/cutting")
    public ResponseEntity<MacroDto> calculateCutting(@RequestBody CuttingMacroDto cuttingMacroDto) {
        MacroDto response = macroService.calculateCutting(cuttingMacroDto);
        return ResponseEntity.ok(response);
    }

}
