package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// System.out.println("Hello World !!!");
		StandardCalculator calc = new StandardCalculator();
		calc.subtract(2, 2);
		System.out.println(calc.getResult());

		// SpringApplication.run(QcalcApplication.class, args);
	}

}
