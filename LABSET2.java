import java.util.*;
class Sales
{
	public static void main(String args[])
	{
		int ch=1;
		int month,day,year,tomorrowday=0,tomorrowmonth=0,tomorrowyear=0;
		boolean leapyear=false;		
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the date in the format MM/DD/YYYY\n");
		month = in.nextInt();
		day = in.nextInt();
		year = in.nextInt();
		if(year < 1812 || year >2018)
		{
			ch=0;
			System.out.println("Invalid year\n");
		}
		if(month <1 || month >12)
		{
			ch=0;
			System.out.println("Invalid month\n");
		}
		if(day <1 || day > 31)
		{
			ch=0;
			System.out.println("Invalid day\n");
		}
		if(ch==0)
		{
			System.exit(0);
		} 
		if(year%4==0)
		{
			leapyear=true;
		}
		if ( month == 01 || month == 03 || month == 05 || month == 07 || month == 8 || month == 10)
		{
			if( day < 31 )
			{
				tomorrowday = day + 1;
				tomorrowmonth= month;
				tomorrowyear= year;
				System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
			}
			else if (day == 31)
			{
				tomorrowday = 1;
				tomorrowmonth= month +1;
				tomorrowyear= year;
				System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
			}
			else
			{
				System.out.println("Invalid Date\n");
			}
		}
		else if( month == 04 || month == 06 || month == 9 || month == 11)
		{
				if(day<30)
				{
					tomorrowday = day + 1;
					tomorrowmonth= month;
					tomorrowyear= year;
					System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
				}
				else if(day == 30)
				{
					tomorrowday = 1;
					tomorrowmonth= month +1;
					tomorrowyear= year;
					System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
				}
				else
				{
					System.out.println("Invalid Date\n");
				}
		}
		else if(month == 12)
		{
			if(day < 31)
			{
				tomorrowday = day + 1;
				tomorrowmonth= month;
				tomorrowyear= year;
				System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
			}
			else
			{
				tomorrowday=1;
				tomorrowmonth=1;
				tomorrowyear= year +1;
				System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
			}
		}
		else if(month == 02)
		{
			if(day==30 || day == 31)
			{
				System.out.println("February cannot have "+day);
				System.exit(0);
			}
			else if(day==29)
                        {
                                tomorrowday=1;
                                tomorrowmonth=3;
                                tomorrowyear= year;
                                System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
                        }
		        else if(day <28)
			{
				tomorrowday = day + 1;
				tomorrowmonth= month;
				tomorrowyear= year;
				System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
			}
			else 
			{
				if(day==28 && leapyear)
				{
					tomorrowday=29;
					tomorrowmonth= month;
					tomorrowyear= year;
					System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
				}
				else
				{
					tomorrowday=1;
					tomorrowmonth=3;
					tomorrowyear= year;
					System.out.println("Next date is : "+tomorrowmonth+"/"+tomorrowday+"/"+tomorrowyear+"\n");
				}
			}
		}
		
		else
		{
			System.exit(0);
		}
		in.close();
		
	}
}