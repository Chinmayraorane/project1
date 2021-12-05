package crypto;

public abstract class Cryptocurrency { // Abstraction

	abstract double invest(double amount); // contract method

	double random() // concrete method
	{
		int min = -2000;
		int max = 2000;
		double result = Math.floor(Math.random() * (max - min + 1) + min);
		return result;
	}

}

class bitcoin extends Cryptocurrency // Inheritance
{
	double num1;
	double val;

	public double invest(double amount) // Implementation
	{
		double result = random(); // reusabillity
		val = 4600000 + result;
		num1 = amount / val;
		return num1; // convert into bitcoin and return to user class
	}

}

class etherum extends Cryptocurrency // Inheritance
{
	double num1;
	double val;

	public double invest(double amount) {
		double result = random();
		val = 343000 + result;
		num1 = amount / val;
		return num1; // convert into etherum and return to user class
	}

}
