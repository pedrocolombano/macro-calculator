package br.com.pedrocolombano.macrocalculator.service;

import br.com.pedrocolombano.macrocalculator.model.enumeration.Activity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class TotalMetabolicRateService {

    public BigDecimal calculate(final BigDecimal basalRate, final Activity activity) {
        return basalRate.multiply(activity.getCaloriesConstant())
                        .setScale(2, RoundingMode.HALF_UP);
    }

}
