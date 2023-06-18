package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {

	public static void main(String[] args) throws IOException{
		
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		
		for(String str : lines) {
//			String[] k = headers.toArray(new String[0]);
			String[] v =str.split(",");
			HashMap<String, Double> hm = new HashMap<String, Double>();
			int i=0;
			for(String head:headers) {
				double d = Double.parseDouble(v[i]);
				hm.put(head, d);
				i++;
			}
			dataResult.add(hm);
			
			
		}
		return dataResult;
	}	
	
}


