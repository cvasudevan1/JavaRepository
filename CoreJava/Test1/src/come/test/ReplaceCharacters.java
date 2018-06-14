package come.test;

public class ReplaceCharacters
{
	String oriStr = null;
	public ReplaceCharacters()
	{
		oriStr="abckakhcvccsdsdhshd";
	}
	public static void main(String args[]) throws Exception
	{
		ReplaceCharacters repChar= new ReplaceCharacters();
		char c='c';
		repChar.replaceChars(c);
	}

	public void replaceChars(char c)
	{
		StringBuilder strBldr = new StringBuilder(this.oriStr);
		char newChar = 'b';
		for(int i =0;i<strBldr.length();i++)
			if(strBldr.charAt(i)==c)
				strBldr.setCharAt(i, newChar);
		System.out.println(strBldr.toString());
	}	

}
