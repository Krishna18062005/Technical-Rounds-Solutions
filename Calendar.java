package l2;

public class Calendar {
	public static void main(String[] args) {
		String st="25-06-1998";
		String en="04-04-2010";
		st="01-01-2000";
		en="31-12-2022";
		int[] months= {31,28,30,31,30,31,30,31,30,31,30,31};
		
		String[] sta=st.split("-");
		String[] end=en.split("-");
		
		int dd=Integer.parseInt(end[0])-Integer.parseInt(sta[0]);
		
		int md= Integer.parseInt(end[1])-Integer.parseInt(sta[1]);
		int yd= Integer.parseInt(end[2])-Integer.parseInt(sta[2]);
		
		int y1=Integer.parseInt(end[2]);
		int y2=Integer.parseInt(sta[2]);
		if(Integer.parseInt(sta[1])<=2) {
			if((y1%400!=0&&y1%4==0)||y2%100==0) months[1]=29; 
		}
		
		if((y2%400!=0&&y2%4==0)||y2%100==0) months[1]=29;
		
		if(md<0) {
			md+=12;
		    yd-=1;
		}
		
		if(dd<0) {
			dd+=months[12-md+1];
			md--;
		}
		if(dd>months[12-md+1]) {
			dd-=months[12-md+1];
			md++;
		}
		if(md>=12) {
			md-=12;
			yd++;
		}
		
		System.out.print(yd+"Years, "+md+" Months, "+dd+" Days.");
			
	}
}
