import java.util.*;
class birthposition
{
//funtion to find birth position
static void berth_type(int s)
{
	
	if (s > 0 && s < 73)
		if (s % 8 == 1 ||
			s % 8 == 4)
		System.out.println(s +
				" is lower berth");
		else if (s % 8 == 2 ||
				s % 8 == 5)
			System.out.println(s +
					" is middle berth");
		else if(s % 8 == 3 ||
				s % 8 == 6)
			System.out.println(s +
					" is upper berth");
		else if(s % 8 == 7)
			System.out.println(s +
					" is side lower berth");
		else
			System.out.println(s +
					" is side upper berth");
	else
		System.out.println(s +
				" invalid seat number");
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the seat number");
int s = sc.nextInt();
berth_type(s); 
}
}
