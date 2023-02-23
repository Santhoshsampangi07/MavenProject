package day03;

      // Topic : Error handling
      // 3 types : i) Try catch
      //             ii) Try catch finally
      //             iii) Try finally
public class Program01 {

	public static void main(String[] args) {
		int a=10;
		int b=1;
		
		System.out.println(a+b);
		try
		{
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println(a-b);
		System.out.println(a*b);

	}


	}


