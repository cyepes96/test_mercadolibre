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

	public static boolean validateSequence(String[][] matrix) {
		if (validateSequenceIn(Constantes.HORIZONTAL, matrix))
			return true;

		if (validateSequenceIn(Constantes.VERTICAL, matrix))
			return true;

		if (validateSequenceIn(Constantes.DIAGONAL_LEFT, matrix))
			return true;

		if (validateSequenceIn(Constantes.DIAGONAL_RIGHT, matrix))
			return true;

		return false;
	}

	private static boolean validateSequenceIn(int way, String[][] matrix) {
		switch (way) {
		case Constantes.HORIZONTAL:
			return validateSequenceHorizontal(matrix);
		case Constantes.VERTICAL:
			return validateSequenceVertical(matrix);
		case Constantes.DIAGONAL_LEFT:
			return validateSequenceDiagonalLeft(matrix);
		default:
			return validateSequenceDiagonalRight(matrix);
		}
	}

	private static boolean validateSequenceHorizontal(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= (matrix.length - Constantes.MIN_SEQUENCE_EQUALS); j++) {
				int cont = 1;
				for (int k = 1; k < Constantes.MIN_SIZE_MATRIX; k++) {
					if (!matrix[i][j].equals(matrix[i][j + k]) || cont == Constantes.MIN_SEQUENCE_EQUALS)
						break;

					cont++;
				}
				if (cont == Constantes.MIN_SEQUENCE_EQUALS)
					return true;
			}
		}

		return false;
	}

	private static boolean validateSequenceVertical(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= (matrix.length - Constantes.MIN_SEQUENCE_EQUALS); j++) {
				int cont = 1;
				for (int k = 1; k < Constantes.MIN_SIZE_MATRIX; k++) {
					if (!matrix[j][i].equals(matrix[j + k][i]) || cont == Constantes.MIN_SEQUENCE_EQUALS)
						break;

					cont++;
				}
				if (cont == Constantes.MIN_SEQUENCE_EQUALS)
					return true;
			}
		}

		return false;
	}

	private static boolean validateSequenceDiagonalLeft(String[][] matrix) {
		for (int i = 0; i <= (matrix.length - Constantes.MIN_SEQUENCE_EQUALS); i++) {
			int cont = 1;
			for (int k = 1; k < Constantes.MIN_SIZE_MATRIX; k++) {
				if (!matrix[i][i].equals(matrix[i + k][i + k]) || cont == Constantes.MIN_SEQUENCE_EQUALS)
					break;

				cont++;
			}
			if (cont == Constantes.MIN_SEQUENCE_EQUALS)
				return true;
		}

		return false;
	}

	private static boolean validateSequenceDiagonalRight(String[][] matrix) {
		for (int i = 0; i <= (matrix.length - Constantes.MIN_SEQUENCE_EQUALS); i++) {
			int cont = 1;
			for (int k = 1; k < Constantes.MIN_SIZE_MATRIX; k++) {
				if (!matrix[i][matrix.length - i - 1].equals(matrix[i + k][matrix.length - i - 1 - k])
						|| cont == Constantes.MIN_SEQUENCE_EQUALS)
					break;

				cont++;
			}
			if (cont == Constantes.MIN_SEQUENCE_EQUALS)
				return true;
		}

		return false;
	}
}
