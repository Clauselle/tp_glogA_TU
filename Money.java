package fr.emse.test;

public class Money implements IMoney{
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
		
	}
	public int amount() {
		return fAmount;
	}
	public String currency() {
		return fCurrency;
	}
	
	public Money add(Money m) {
		//return new Money(amount() + m.amount(), currency());
		if (m.currency().equals(currency()))
			return new Money(amount() + m.amount(), currency());
			return new MoneyBag(this, m);
	}
	@Override
	public IMoney add(IMoney aMoney) {
		return m.addMoney(this);
	}
}
