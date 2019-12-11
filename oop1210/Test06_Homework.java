package oop1210;

public class Test06_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1년 365.2422일
		// ->365일 ?시간 ?분 ?초 
		/*
		 * 1분 : 60초
		 * 1시간 : 60분 * 60초 = 3600초
		 * 1일 :24시간 *3600초 = 86400초
		 * 1년 : 365.2422 *86400초 = 31556926.08초
		 *
		 * */
		
		double year=365.2422; // 1년 일수 
		int total=(int)(year*86400); // 1년 1일 초수 
		
		System.out.println("전체 초수 : "+total);
		
		int date=365*86400;
		
		int rest=total-date;
		
		System.out.println("전체 남은 초수: "+rest);
		
		int hour=rest/3600;
		rest=rest%3600;
		System.out.println("남은 시간 수 : "+hour);
		
		int min=rest/60;
		rest=rest%60;
		System.out.println("남은 분 수 :"+min);
		
		System.out.println("남은 초수 : "+rest);
	
		
		
	}

}
