package com.test.mercadolibre.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {

	private Utils() {
	}

	public static Double getDoubleWithTwoDecimals(Double value) {
		BigDecimal bigDecimal = new BigDecimal(value).setScale(2, RoundingMode.HALF_DOWN);

		return bigDecimal.doubleValue();
	}
}
