package popups.model;

public class Popups
{
	private int number;
	private double value;
	private String words;
	private boolean isValid;
	
	
	//getters
	public String toWords()
	{
		return words;
	}
	public int toNumber()
	{
		return number;
	}
	public double toValue()
	{
		return value;
	}
	public boolean toIsValid()
	{
		return isValid;
	}
	
	
	//setters
	public void setWords (String words)
	{
		this.words = words;
	}
	public void setNumber (int number)
	{
		this.number = number;
	}
	public void setValue (double value)
	{
		this.value= value;
	}
	public void setIsValid (boolean isValid)
	{
		this.isValid = isValid;
	}
}
