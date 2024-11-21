package br.com.pedrocolombano.macrocalculator.service;

import br.com.pedrocolombano.macrocalculator.model.enumeration.BasalMetabolicRate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class BasalMetabolicRateService {

    public BigDecimal calculate(final BigDecimal weight,
                                final BigDecimal height,
                                final Integer age,
                                final BasalMetabolicRate constants) {

        BigDecimal heightConstant = constants.getHeightConstant();
        BigDecimal ageConstant = constants.getAgeConstant();

        BigDecimal rate = constants.getWeightConstant().multiply(weight)
                                                       .add(heightConstant.multiply(height))
                                                       .subtract(ageConstant.multiply(BigDecimal.valueOf(age)))
                                                       .add(constants.getDefaultConstant());

        return rate.setScale(2, RoundingMode.HALF_UP);
    }

}
