package leite.sampaio.lucas.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import leite.sampaio.lucas.converters.NumberConverter;
import leite.sampaio.lucas.exceptions.UnsupportedMathOperationException;
import leite.sampaio.lucas.math.SimpleMath;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value="num1") String num1,
			          @PathVariable(value="num2") String num2) throws Exception{
		
		if(!NumberConverter.isNumeric(num1)||!NumberConverter.isNumeric(num2))
			throw new UnsupportedMathOperationException("Please, set a numeric value.");
		
		return SimpleMath.sum(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
	}
	
	@RequestMapping(value = "/sub/{num1}/{num2}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value="num1") String num1,
			          @PathVariable(value="num2") String num2) throws Exception{
		
		if(!NumberConverter.isNumeric(num1)||!NumberConverter.isNumeric(num2))
			throw new UnsupportedMathOperationException("Please, set a numeric value.");
		
		return SimpleMath.sub(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
	}
	
	@RequestMapping(value = "/mul/{num1}/{num2}", method = RequestMethod.GET)
	public Double mul(@PathVariable(value="num1") String num1,
			          @PathVariable(value="num2") String num2) throws Exception{
		
		if(!NumberConverter.isNumeric(num1)||!NumberConverter.isNumeric(num2))
			throw new UnsupportedMathOperationException("Please, set a numeric value.	");
		
		return SimpleMath.mul(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
	}
	
	@RequestMapping(value = "/div/{num1}/{num2}", method = RequestMethod.GET)
	public Double div(@PathVariable(value="num1") String num1,
			          @PathVariable(value="num2") String num2) throws Exception{
		
		if(!NumberConverter.isNumeric(num1)||!NumberConverter.isNumeric(num2))
			throw new UnsupportedMathOperationException("Please, set a numeric value.	");
		
		return SimpleMath.div(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
	}
	
	@RequestMapping(value = "/mean/{num1}/{num2}", method = RequestMethod.GET)
	public Double mean(@PathVariable(value="num1") String num1,
			          @PathVariable(value="num2") String num2) throws Exception{
		
		if(!NumberConverter.isNumeric(num1)||!NumberConverter.isNumeric(num2))
			throw new UnsupportedMathOperationException("Please, set a numeric value.	");
		
		return SimpleMath.mean(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
	}
	
	@RequestMapping(value = "/sqrt/{num}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value="num") String num) throws Exception{
		
		if(!NumberConverter.isNumeric(num))
			throw new UnsupportedMathOperationException("Please, set a numeric value.	");
		
		return SimpleMath.sqrt(NumberConverter.convertToDouble(num));
	}
}
