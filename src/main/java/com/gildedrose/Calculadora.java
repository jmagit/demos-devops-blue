package com.gildedrose;

import java.math.BigDecimal;

public class Calculadora {
	public double suma(double a, double b) {
		BigDecimal rslt = BigDecimal.valueOf(a + b);
		return rslt.setScale(15, java.math.RoundingMode.HALF_DOWN).doubleValue();
	}
}
