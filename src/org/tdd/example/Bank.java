package org.tdd.example;

import java.util.Hashtable;

public class Bank {

	private class Pair {
		private String from;
		private String to;
		
		Pair(String from, String to) {
			this.from = from;
			this.to = to;
		}
		
		public boolean equals(Object object) {
			Pair pair = (Pair) object;
			return from.equals(pair.from) && to.equals(pair.to);
		}
		
		public int hashCode() {
			return 0;
		}
		
		
	}
	
	Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();
	
	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public int rate(String from, String to) {
		if(from.equals(to)) return 1;
		Integer rate = rates.get(new Pair(from, to));
		return rate.intValue();
	}
	
	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}

}
