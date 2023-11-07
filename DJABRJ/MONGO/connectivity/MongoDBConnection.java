package test;

import java.util.function.Consumer;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.*;

public class connectivity {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MongoClient mc = MongoClients.create("mongodb://localhost:27017");
		
		MongoDatabase db = mc.getDatabase("Test");
		
		MongoCollection coll = db.getCollection("Test");
		
		Document doc = new Document();
		doc.append("test", "doc1");
		
		Document doc1 = new Document();
		doc1.append("test444", "doc1");
		
		coll.insertOne(doc);
		
		coll.deleteOne(doc);
		
		coll.updateOne(doc, new Document().append("$set", doc1));
		
		
		MongoCursor<Document> cursor = coll.find().iterator();
		
		while(cursor.hasNext()) {
			System.out.println(cursor.next().toJson());
		}
		
		

	}

}
