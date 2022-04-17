package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) throws IOException{
		int x = 10;
		int y = 5;
		
		if(x > y) {
			System.out.println("xはyより大きい");
		}
		
		System.out.println(Math.max(x, y));
		
		x = 5;
		y = 10;
		if(x > y) {
			System.out.println("xはyより大きい");
		} else if(x < y) {
			System.out.println("xはyより小さい");
		}
		
		x = 10;
		y = 10;
		if(x > y) {
			System.out.println("xはyより大きい");
		} else if(x < y) {
			System.out.println("xはyより小さい");
		} else {
			System.out.println("xとyは等しい");
		}
		
		x = 13;
		if( x % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		
		x = -12;
		if (x >= 0) {
			if( x % 2 == 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("正の奇数");
			}
		} else {
			if( x % 2 == 0) {
				System.out.println("負の偶数");
			} else {
				
			}
		}
		
	    x = 70;
	    if(x >= 60) {
	    	System.out.println("合格");
	    } else {
	    	System.out.println("不合格");
	    }
	    
	    if(x >= 80) {
	    	System.out.println("たいへんよくできました");
	    } else if(x >= 60) {
	    	System.out.println("よくできました");
	    } else {
	    	System.out.println("ざんねんでした");
	    }
	    
	    if(x >= 80) {
	    	System.out.println("優");
	    } else if(x >= 70) {
	    	System.out.println("良");
	    } else if(x >= 60) {
	    	System.out.println("可");
	    } else {
	    	System.out.println("不可");
	    }
	    
	    int a = 80;
	    int b = 50;
	    
	    if( a >= 60 && b >= 60) {
	    	System.out.println("合格");
	    } else if(a + b >= 130) {
	    	System.out.println("合格");
	    } else if(a + b >= 100 && (a >= 90 || b >= 90)) {
	    	System.out.println("合格");
	    } else {
	    	System.out.println("不合格");
	    }
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
	    int day = Integer.parseInt(br.readLine());
	    System.out.println(">0=午前、1=午後、2=夜間");
	    int time = Integer.parseInt(br.readLine());
	    
	    switch(day) {
	      case 0:
	        System.out.println("休診");
	        break;
	      case 1:
	      case 4:
	        System.out.println("開");
	        break;
	      case 2:
	      case 5:
	    	  switch(time) {
	    	  case 0:
	    		  System.out.println("休診");
	    		  break;
	    	  default:
	    		  System.out.println("開");
	    		  break;
	    	  }
	    	  break;
	      case 3:
	    	  switch(time) {
	    	  case 2:
	    		  System.out.println("休診");
	    		  break;
	    	  default:
	    		  System.out.println("開");
	    		  break;
	    	  }
	    	  break;
	      case 6:
	    	  switch(time) {
	    	  case 2:
	    	  case 1:
	    		  System.out.println("休診");
	    		  break;
	    	  default:
	    		  System.out.println("開");
	    		  break;
	    	  }
	    	  break;
	    }
	    
	    if(x < y && (x % 2 == 0 && y % 2 == 0))
	        System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

	    if( x == y && (x < 0 && y < 0) )
	        System.out.println( "xとyは等しく、かつ、負の数である。" );

	    if( x < y || x % 2 == 0)
	        System.out.println( "xはyより小さい、または、xは偶数である。" );

	    if((x <= 10 || x >= 100) && (10 <= y && y <= 100))
	        System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

	    if((x >= 0 && y>= 0) || (x < 0 && y < 0))
	        System.out.println( "xもyも負の数である、ではない。" );
	    
	    System.out.println( "月を入力" );
	    int month = Integer.parseInt(br.readLine());
	    switch(month) {
	    case 1:
	    	System.out.println( "元日、成人の日" );
	    	break;
	    case 2:
	    	System.out.println( "建国記念の日" );
	    	break;
	    case 3:
	    	System.out.println( "春分の日" );
	    	break;
	    case 4:
	    	System.out.println( "昭和の日" );
	    	break;
	    case 5:
	    	System.out.println( "憲法記念日、みどりの日、こどもの日" );
	    	break;
	    case 6:
	    	System.out.println( "" );
	    	break;
	    case 7:
	    	System.out.println( "海の日" );
	    	break;
	    case 8:
	    	System.out.println( "" );
	    	break;
	    case 9:
	    	System.out.println( "敬老の日、秋分の日" );
	    	break;
	    case 10:
	    	System.out.println( "体育の日" );
	    	break;
	    case 11:
	    	System.out.println( "文化の日、勤労感謝の日" );
	    	break;
	    case 12:
	    	System.out.println( "天皇誕生日" );
	    	break;
	    }
	    
	    System.out.println( "1：まぐろ　2：えび　3：こはだ" );
	    int num = Integer.parseInt(br.readLine());
	    
	    switch(num) {
	    case 1:
	    	System.out.println( "大吉" );
	    	break;
	    case 2:
	    	System.out.println( "吉" );
	    	break;
	    case 3:
	    	System.out.println( "凶" );
	    	break;
	    }
	    
	    System.out.println( "月を入力" );
	    month = Integer.parseInt(br.readLine());
	    switch(month) {
	    case 1:
	    	System.out.println( 31 );
	    	break;
	    case 2:
	    	System.out.println( 28);
	    	break;
	    case 3:
	    	System.out.println( 31 );
	    	break;
	    case 4:
	    	System.out.println( 30 );
	    	break;
	    case 5:
	    	System.out.println( 31 );
	    	break;
	    case 6:
	    	System.out.println( 30 );
	    	break;
	    case 7:
	    	System.out.println( 31 );
	    	break;
	    case 8:
	    	System.out.println( 31 );
	    	break;
	    case 9:
	    	System.out.println( 30 );
	    	break;
	    case 10:
	    	System.out.println( 31 );
	    	break;
	    case 11:
	    	System.out.println( 30 );
	    	break;
	    case 12:
	    	System.out.println( 31 );
	    	break;
	    default:
	    	System.out.println( "入力間違い" );
	    	break;
	    }
	}

}
