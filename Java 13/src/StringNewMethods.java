/***
 * New methods are to be used with Text Block Strings
 */
public class StringNewMethods {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		
		String output = """
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """.formatted("Test", 123456789, 2000.5555);
		
		System.out.println(output);
		
		
		String htmlTextBlock = "<html>   \n"+
				                    "\t<body>\t\t \n"+
				                        "\t\t<p>Hello</p>  \t \n"+
				                    "\t</body> \n"+
				                "</html>";
		System.out.println(htmlTextBlock.replace(" ", "*"));
		System.out.println(htmlTextBlock.stripIndent().replace(" ", "*"));
		
		String str1 = "Hi\t\nHello' \" /u0022 Test\r";
		System.out.println(str1);
		System.out.println(str1.translateEscapes());
		
	}

}