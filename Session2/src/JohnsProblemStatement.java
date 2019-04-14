
public class JohnsProblemStatement {

	public static void main(String[] args) {
		
		// Votes for 5 regions represented in Single Value Containers for Democratic Party
		int demArizonaVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;
		
		// Votes for 5 regions represented in Single Value Containers for Republican Party
		int repArizonaVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;
		
		int demVoteCount = demArizonaVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		int repVoteCount = repArizonaVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes;
		
		if(demVoteCount > repVoteCount){
			System.out.println(">> Democratic Party won by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println(">> Republican Party won by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		// Challenge : If we have n number of regions. i.e. if regions increases from 5 to lets say 500...
		//			   Representing votes for 500 regions in 500 SVC is a tough job or programmer !!
		//			   For 2 different parties we shall have 1000 SVC's.
		//			   Adding them shall be more tough to write !!
		
		// Solution : Create Multi Value Container i.e. Array
		// When we have lot of data, we must prefer MVC instead of SVC
		
		// 				   A    F   V    T   G
		//				   0    1   2    3   4
		int[] demVotes = {126, 32, 230, 21, 200};	
		int[] repVotes = {152, 85, 121, 215, 13};
		
		int[][] votes = {	
							{126, 32, 230, 21, 200},
							{152, 85, 121, 215, 13}
					    };
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		/*
		for(int vote : demVotes){
			demVoteCount = demVoteCount + vote;
		}
		
		for(int vote : repVotes){
			repVoteCount = repVoteCount + vote;
		}
		*/
		
		for(int i=0;i<5;i++){
			demVoteCount = demVoteCount + demVotes[i];
			repVoteCount = repVoteCount + repVotes[i];
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println(">> Democratic Party won by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println(">> Republican Party won by "+(repVoteCount - demVoteCount)+" votes");
		}

	}

}
