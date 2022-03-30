package newpractice;

public class Free1 {
	public static void main(String[] args) {
		System.out.println("じゃんけんを始めます");
		System.out.println("１：グー　２：チョキ　３：パー");
		int otherhand = new java.util.Random().nextInt(3) + 1;
		int hand = new java.util.Scanner(System.in).nextInt();
		switch(hand) {
		case 1:
			System.out.println("あなたの手はグーです");
			switch(otherhand) {
			case 1:
				System.out.println("相手の手はの手はグーです");
				System.out.println("あいこです");
				break;
				
			case 2:
				System.out.println("相手の手はの手はチョキです");
				System.out.println("勝ちです");
				break;
				
			case 3:
				System.out.println("相手の手はの手はパーです");
				System.out.println("負けです");
				break;
			}
			break;
			
		case 2:
			System.out.println("あなたの手はチョキです");
			switch(otherhand) {
			case 1:
				System.out.println("相手の手はの手はグーです");
				System.out.println("負けです");
				break;
				
			case 2:
				System.out.println("相手の手はの手はチョキです");
				System.out.println("あいこです");
				break;
				
			case 3:
				System.out.println("相手の手はの手はパーです");
				System.out.println("勝ちです");
				break;
			}
			
			break;
			
		case 3:
			System.out.println("あなたの手はパーです");
			switch(otherhand) {
			case 1:
				System.out.println("相手の手はの手はグーです");
				System.out.println("勝ちです");
				break;
				
			case 2:
				System.out.println("相手の手はの手はチョキです");
				System.out.println("負けです");
				break;
				
			case 3:
				System.out.println("相手の手はの手はパーです");
				System.out.println("あいこです");
				break;
			}
			
			break;
		default :
			System.out.println("１,２,３の中から選んでください");
			break;
			
		}
		System.out.println("ご利用ありがとうございました");
	}

}
