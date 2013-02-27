package org.tdd.example;

public interface Expression {
	public Money reduce(Bank bank, String to);
	public Expression plus(Expression addend);
	public Expression times(int multipier);
}
