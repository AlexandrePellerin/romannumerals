package iut.tdd;

public class RomanNumerals {
	
	public char[] liste=new char[]{'I','V','X','L','C','D','M'};
	public int[] entiers=new int[]{1,5,10,50,100,500,1000};
	
	public String[] liste2=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	public int[]entiers2=new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
	
	public String convertToRoman(String arabe) {
		String res="";
		int poser=Integer.parseInt(arabe); 
		
		for(int i=this.entiers2.length-1;i>=0;i--){
			int entier=poser/entiers2[i];
			for(int j=0;j<entier;j++){
				res+=liste2[i];
			}
			poser=poser - (entier*entiers2[i]);
		}
		
		return res;
	}

	public String convertFromRoman(String roman) {
		int res=0,cpt=this.liste.length-1;
		int cptTemp=cpt,resTemp=0;
		while(!roman.equals("")){
			if(roman.charAt(0)==this.liste[cpt]){
				res+=this.entiers[cpt];
				roman=roman.substring(1, roman.length());
				if(cptTemp<cpt){
					res-=resTemp*2;
				}
				resTemp=this.entiers[cpt];
				cptTemp=cpt;
				cpt=this.liste.length;
			}
			System.out.println("cpt="+cpt+", roman="+roman+", res="+res+",");
			cpt--;
		}
		System.out.println(""+res);
		return ""+res;
	}

}
