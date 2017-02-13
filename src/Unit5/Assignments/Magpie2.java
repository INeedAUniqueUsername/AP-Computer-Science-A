package Unit5.Assignments;


/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.trim().length() == 0) {
			response = "...";
		} else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if(statement.indexOf("hello") == 0) {
			response = "Hello";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("chatbot") >= 0) {
			response = "Did you just call me a chatbot?";
		} else if(statement.indexOf("Talk") >= 0) {
			response = "Yes, let us talk.";
		} else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		String[] responses = new String[] {"Interesting, tell me more.", "Hmmm.", "Do you really think so?", "You don't say.", "I don't really care.", "What are you talking about?"};
		return responses[(int) (Math.random()*responses.length)];
	}
}
