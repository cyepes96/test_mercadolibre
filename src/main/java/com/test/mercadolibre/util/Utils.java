package com.test.mercadolibre.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
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

	public static String[][] listIntoMatrix(List<String> list) {
		String[][] matrix = new String[list.size()][list.size()];

		for (int i = 0; i < list.size(); i++) {
			char[] row = list.get(i).toCharArray();

			for (int j = 0; j < list.size(); j++) {
				matrix[i][j] = String.valueOf((row[j]));
			}

		}
		return matrix;
	}
}
