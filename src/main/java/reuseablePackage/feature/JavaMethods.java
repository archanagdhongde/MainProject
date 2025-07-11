package reuseablePackage.feature;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.mongodb.client.MongoDatabase;
//import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;

public class JavaMethods {

	
	public boolean StringEquals(String actual, String expected)
	{
		boolean value=actual.equals(expected);
		return value;
	}
	
	public int ExcelRowCount(String xlPath,String sheetName) throws Exception, IOException
	{
	FileInputStream fis=new FileInputStream(xlPath);
	Workbook w1= WorkbookFactory.create(fis);
	Sheet s1=w1.getSheet(sheetName);
	int rowCount = s1.getLastRowNum();
	return rowCount;
	}

	public int GetRandomNumber()
	{
		    int min = 10000;
		    int max = 99999;

		    // Create a Random object
		    Random random = new Random();
		    // Generate a random integer between min and max (inclusive)
		    int randomNumber = random.nextInt(max - min + 1) + min;

		    System.out.println("Random integer between " + min + " and " + max + ": " + randomNumber);
			return randomNumber;
	}

	public String Concat(String value1, String value2){
          return value1 + value2;
	}

	public String generateRandomAlphabetic(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }
 
        return sb.toString();
    }


	public void MongoDBUpdate(String status,String reportRuncount, String fileName,String pid){
		System.out.println("Connecting....................");
ConnectionString connectionString = new ConnectionString("mongodb+srv://Manoj:jonam%40123@cluster0.tjbda.mongodb.net/testingEnv?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("testingEnv");
System.out.println("Connected to Mongo Atlas......");

		// MongoClient mongo = new MongoClient( "localhost" , 27017 );
		// MongoDatabase database = mongo.getDatabase("testingEnv");
		MongoCollection<Document> collection = database.getCollection("tracking");
		Document updateQuery = new Document();
		updateQuery.append("$inc",
		new Document().append("ExecutedCount",1)).append("$set",
		new Document().append("Testcases.$.status",status).append("Testcases.$.processId",pid));
		Document searchQuery = new Document();
		searchQuery.append("RunNo", reportRuncount).append("Testcases.scriptId",fileName);
		collection.updateOne(searchQuery, updateQuery);
	}
	

	}


