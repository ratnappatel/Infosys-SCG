package com.infy.calculator;

public class SalaryCalculator {
	static CalculatorHelper calcHelp = new CalculatorHelper();
	
        //This method is for calculating salary of Employees
        //Employees do not have bonus
	public int salaryCalc(int sal, int hike) {
		return calcHelp.calcHelper(sal, hike);
	}
	
        //This method is for calculating salary of Managers
	//Managers have bonus
        public int salaryCalc(int sal, int hike, int bonus) {
		//Bonus is added to salary before invoking calcHelper()
                sal = sal + bonus;
		return calcHelp.calcHelper(sal, hike);
	}
}
