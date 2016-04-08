package main;

import java.util.ArrayList;

import model.*;

public class MainDriver {

	private static ArrayList<Query> queryArrList;
	private static ArrayList<Transaction> transactionArrList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//init queries
		queryArrList = new ArrayList<Query>();
		
		//READ
		queryArrList.add(new Query("SELECT aquanitype, sum(aquani_vol) FROM hpq_aquani WHERE aquanitype IS NOT null GROUP BY aquanitype;"));
		queryArrList.add(new Query("SELECT hpq_hh_id, aquanitype, aquani_vol FROM hpq_aquani WHERE aquanitype = 1 AND hpq_hh_id = 31341;")); //1
	
		//UPDATE 
		queryArrList.add(new Query("UPDATE hpq_aquani SET aquani_vol = aquani_vol + 750 WHERE aquanitype = 1 AND hpq_hh_id = 31341;"));// 1
		queryArrList.add(new Query("UPDATE hpq_aquani SET aquani_vol = aquani_vol - 200 WHERE aquanitype = 1 AND hpq_hh_id = 31341;"));// 1
		
		//DELETE
		queryArrList.add(new Query("DELETE FROM hpq_aquani WHERE aquanitype = 1 AND hpq_hh_id = 53922;"));
		
		
		//INSERT for internal use
		queryArrList.add(new Query("INSERT INTO hpq_aquani  (hpq_hh_id, id, aquani_line, aquanitype, aquanitype_o, aquani_vol) VALUES (53922, 0, 6, 1, null ,50);"));
		
		//init transactions
		transactionArrList = new ArrayList<Transaction>();
		transactionArrList.add(new Transaction("T1", queryArrList));
		transactionArrList.add(new Transaction("T2", queryArrList));
		transactionArrList.add(new Transaction("T3", queryArrList));
		
		
		//pass transactions to manager
		
		//new view.NodeView();
		
		
		
		
	}

}
