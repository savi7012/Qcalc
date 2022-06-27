package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// System.out.println("Hello World !!!");
		
		LogicCalculator calc = new LogicCalculator();

		calc.AND(8, 6);

		calc.printResult();


		// SpringApplication.run(QcalcApplication.class, args);
	}

}
