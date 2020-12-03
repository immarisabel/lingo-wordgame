public class Validator {

	public Boolean CheckLength(String str, int len) {
		if (str.length() == len)
			return true;
		return false;
	}

	public void GetLevel(int nAttempt) {
		switch (nAttempt) {
			case 0 :
				System.out.printf("Your IQ level is %s ",
						IQ.brilliant.toString());
				break;
			case 1 :
				System.out.printf("Your IQ level is %s ", IQ.bright.toString());
				break;
			case 2 :
				System.out.printf("Your IQ level is %s ",
						IQ.average.toString());
				break;
			case 3 :
				System.out.printf("Your IQ level is %s ",
						IQ.mediocre.toString());
				break;
			case 4 :
				System.out.printf("Your IQ level is %s ", IQ.stupid.toString());
				break;
			default :
				System.out.printf(
						"Your IQ level is so low that it cannot be expressed ");
				break;
		}
	}

}
