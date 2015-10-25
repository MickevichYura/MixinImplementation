package mixin;

interface Employee {

	public static final double percent = 10;

	Double getSalary();

	default Double getClearSalary() {
		Double result = getSalary();
		result -= (result / 100) * percent;

		return result;
	};
}
