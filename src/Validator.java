
public class Validator
{

	public Boolean CheckLength(String str, int len)
	{
		if (str.length() == len)
			return true;
		return false;
	}

	public boolean PlayAgain(Boolean play)
	{
		if (play)
			return true;
		return false;
	}

}
