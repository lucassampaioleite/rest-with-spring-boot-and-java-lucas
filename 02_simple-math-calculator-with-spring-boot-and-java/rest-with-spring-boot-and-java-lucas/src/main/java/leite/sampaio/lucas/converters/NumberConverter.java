package leite.sampaio.lucas.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String strDouble) {
		if (strDouble == null) return 0D;
		strDouble = strDouble.replaceAll(",", ".");
		if(isNumeric(strDouble)) return Double.parseDouble(strDouble);
		return 0D;
	}

	public static boolean isNumeric(String num) {
		if (num == null) return false;
		num = num.replaceAll(",", ".");
		return num.matches("[+-]?[0-9]*\\.?[0-9]+");
	}

}
