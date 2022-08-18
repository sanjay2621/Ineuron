package assignment;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) 
	{
	Utils utils = new Utils();
	System.out.println(utils.reserveString("iNueron"));
	System.out.println(utils.reverseSentance("Think Twice"));
	
	utils.isAnagram("Triangle", "Integral");
	utils.isPangram("sd-fsffSSFFGGffdgdgdghgfhjkggjgllopooyutrscddD");
	System.out.println("Total Special Characters in the string==>"+ 
			utils.getSpecialCharacterCount("sd-fsffSSFFGGffdg^dgdghgfhjkggjgl*lopooyutrs"));
	System.out.println(utils.getShortedString("dsghdasnavdbfdgfc"));
	System.out.println(utils.getCountOfVowelsAndConsonants("dsghdasnavdkobfdgfc"));
	utils.getRepeatedlyOccuringCharacter("dsghdasnavdkobfdgfc");

	}
}	

class Utils {
public String reserveString(String str)
{
	StringBuilder sb = new StringBuilder();
	for(int i=str.length()-1;i>=0;i--)
	{
		sb.append(str.charAt(i));
	}
	return sb.toString();
}

public String reverseSentance(String str)
{
	String [] str1 = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int j=0;j<str1.length;j++)
	{
		
		for(int i=str1[j].length()-1;i>=0;i--)
		{
			sb.append(str1[j].charAt(i));
		}
		sb.append(" ");
	}
	return sb.toString();
}

public void isAnagram(String str1, String str2)
{
	int str1Total=0;
	int str2Total=0;
	for(int i=0;i<str1.length();i++)
	{
		str1Total = str1Total + (int) str1.charAt(i);
	}
	
	for(int j=0;j<str2.length();j++)
	{
		str2Total = str2Total + (int) str2.charAt(j);
	}
	
	if(str1Total == str2Total)
		System.out.println("String is Anagram");
	else
		System.out.println("String is Not Anagram");
}


public void isPangram(String str)
{

	boolean isPangram = true;
	for(int i=0;i<str.length();i++)
	{
		int number = (int) str.charAt(i);
		if(!(number >=65 && number <=90 || number >=97 && number <=122))
		{
			isPangram = false;
			break;
		}
	}
	
	if(isPangram)
		System.out.println("String is Pangram");
	else
		System.out.println("String is Not Pangram");
}

public void getRepeatedlyOccuringCharacter(String str)
{
	
    int distinct = 0 ;

    while(str.length()>0)
    {
        
        for (int j = 0; j < str.length(); j++) {

            if(str.charAt(0)==str.charAt(j))
            {
                distinct++;
            }
        }   
        
        System.out.println(str.charAt(0) + " -- " + distinct);
        String d=String.valueOf(str.charAt(0)).trim();
        str=str.replaceAll(d,"");
        distinct = 0;
    }
}

public int getSpecialCharacterCount(String str)
{
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
		int number = (int) str.charAt(i);
		if(!(number >=65 && number <=90 || number >=97 && number <=122 
				|| number >=48 && number <=57))
		{
			count++;
		}
	}
	return count;
}

public char[] getShortedString(String str)
{
	char [] characters = str.toCharArray();
	Arrays.sort(characters);
	return characters;
	
}

public String getCountOfVowelsAndConsonants(String str)
{
	char [] vowels = {'a', 'e', 'i', 'o', 'u'};
	int vowelsCount = 0;
	int consonantsCount = 0;
	for(int i=0;i<str.length();i++)
	{
		char chr = str.charAt(i);
		if(chr == vowels[0] || chr == vowels[1] || chr == vowels[2]
				|| chr == vowels[3] || chr == vowels[4])
		{
			vowelsCount++;
		}
		else
		{
			consonantsCount++;
		}
	}
	return "Total Vowels in the String are "+ vowelsCount + 
			" and total Consonants are " + consonantsCount +"";
}
}

