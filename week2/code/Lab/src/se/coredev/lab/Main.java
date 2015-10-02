package se.coredev.lab;

public final class Main
{

	public static void main(String[] args)
	{
		String[] chopped = split("::::anders:::carlsson:0707100001:0898765432:anders.carlsson@coredev.se:::::", ':');

		for (String string : chopped)
		{
			System.out.println(string);
		}

		// System.out.println(getAllConsonants("Testar Att skriva en mening som innehåller både siffror 2365635265 och bokstäver"));
	}
		
	public static String[] split(String string, char delimiter)
	{
		int endPosition = 0;
		int currentPosition = 0;

		// Create result array with correct size
		String[] result = new String[countWords(string, delimiter)];

		for (int wordIndex = 0; endPosition != -1 && currentPosition < string.length();)
		{
			// If it's a delimiter advance one position
			if (string.charAt(currentPosition) == delimiter)
			{
				currentPosition++;
				continue;
			}
			// Get index for delimiter
			endPosition = string.indexOf(delimiter, currentPosition);

			// Read from currentPosition to endPosition 
			// If endPosition is -1 then read to end
			result[wordIndex++] = (endPosition == -1) ? string.substring(currentPosition)
			                                          : string.substring(currentPosition, endPosition);

			// Advance beyond endPosition to get past current delimiter
			currentPosition = endPosition + 1;
		}
		
		return result;
	}

	private static int countWords(String string, char delim)
	{
		int count = 0;

		for (int index = 0, length = string.length(); index < length; index++)
		{			
			if (string.charAt(index) == delim) { continue; }
			
			// New word found, increase count
			count++;

			// Fast forward until next delimiter
			for(; index < (length + 1); index++) 
			{
				// If next character is a delimiter break this loop
				if (string.charAt(index + 1) == delim) { break;	}
			}
		}
		
		return count;
	}
	
	public static String getAllConsonants(String string)
	{
		StringBuilder result = new StringBuilder();
		String vowels = "aeiouyåäö";
		
		for (int index = 0, length = string.length(); index < length; index++)
		{			
			char c = string.charAt(index);

			// If it's not a vowel add it to result
			if (vowels.indexOf(Character.toLowerCase(c)) == -1)
			{
				result.append(c);
			}
		}

		return result.toString();
	}

}
