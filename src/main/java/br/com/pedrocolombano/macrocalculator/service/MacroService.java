package br.com.pedrocolombano.macrocalculator.service;

import br.com.pedrocolombano.macrocalculator.model.dto.request.CuttingMacroDto;
import br.com.pedrocolombano.macrocalculator.model.dto.response.MacroDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class MacroService {

    public static final BigDecimal PROTEIN_CALORIES_MULTIPLIER = BigDecimal.valueOf(4);
    public static final BigDecimal FAT_CALORIES_MULTIPLIER = BigDecimal.valueOf(9);
    private static final BigDecimal CARBOHYDRATE_CALORIES_DIVISOR = BigDecimal.valueOf(4);

    public MacroDto calculateCutting(CuttingMacroDto cuttingMacroDto) {
        BigDecimal proteinAmount = cuttingMacroDto.weight().multiply(BigDecimal.TWO)
                                                           .setScale(0, RoundingMode.HALF_UP);
        BigDecimal proteinCalories = proteinAmount.multiply(PROTEIN_CALORIES_MULTIPLIER);

        BigDecimal fatAmount = cuttingMacroDto.weight().setScale(0, RoundingMode.HALF_UP);
        BigDecimal fatCalories = fatAmount.multiply(FAT_CALORIES_MULTIPLIER);

        BigDecimal remainingCalories = cuttingMacroDto.cuttingRate().subtract(proteinCalories.add(fatCalories));
        BigDecimal carbohydrateAmount = remainingCalories.divide(CARBOHYDRATE_CALORIES_DIVISOR, 0, RoundingMode.HALF_UP);

        return MacroDto.builder()
                       .carbohydrateAmount(carbohydrateAmount)
                       .proteinAmount(proteinAmount)
                       .fatAmount(fatAmount)
                       .build();
    }

}
