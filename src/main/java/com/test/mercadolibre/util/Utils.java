package com.test.mercadolibre.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

public class Utils {

	private Utils() {
	}

	public static Double getDoubleWithTwoDecimals(Double value) {
		BigDecimal bigDecimal = new BigDecimal(value).setScale(2, RoundingMode.HALF_DOWN);

		return bigDecimal.doubleValue();
	}

	public static boolean validateRegexExpression(String value, String regex) {
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(value).matches();
	}
}
