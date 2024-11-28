package ilu2;

public class Calculateur {
	
	public String ajoute(String input) {
		if(input.isEmpty())
			return "0";
		int res = add(input);
		if(res==-1)
			return "erreur";
		String output = Integer.toString(res);
		return output;
	}
	
	private Integer add(String input) {
		String[] splitted = input.split("[,\n]");
		int res=0;
		for(int i = 0;i<splitted.length;i++) {
			String trimmed = splitted[i].trim();
			int tmp = Verification(trimmed);
			if(tmp ==-1)
				return tmp;
			if(tmp<1000)
				res+=tmp;
		}
		return res;
	}
	
	private Integer Verification(String input) {
		int res = 0;
		if(input.isEmpty())
			return -1;
		res= Integer.parseInt(input);
		if(res<0)
			res = -1;
		return res;
	}
}
