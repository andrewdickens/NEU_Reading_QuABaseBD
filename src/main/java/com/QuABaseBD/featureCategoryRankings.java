package com.QuABaseBD;

import com.google.gson.stream.JsonReader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrewdickens on 8/20/16.
 */
public class featureCategoryRankings {
		List<features> featureCategoryRankings;


		public featureCategoryRankings readFeaturesArray(JsonReader reader) throws IOException {
				System.out.println("Starting readFeaturesArrayMethod");
				List<features> features = new ArrayList<features>();

				System.out.println(reader.toString());

				reader.beginObject();

				while (reader.hasNext()) {

						String name = reader.nextName();
						if (name.equals("category") || name.equals("description") || name.equals("version")) {
								System.out.println(name);
								reader.skipValue();
								continue;
						}


						System.out.println(name);
						readFeature(reader);

//						reader.skipValue();
				}

				reader.endObject();
				reader.close();
				return null;
		}

		public rankings readFeature(JsonReader reader) throws IOException {
//				List<rankings> rankings = new ArrayList<com.QuABaseBD.rankings>();
//				//				String featureName = null;
//				//				Integer rankingValue = 0;
//
//				String username = null;
				int followersCount = 0;
//
//				System.out.println("in Read Feature");
				reader.beginObject();
				while (reader.hasNext()) {
						String name = reader.nextName();
						System.out.println(name);
						if (followersCount % 2 == 0) {
								//						reader.skipValue();
								System.out.println(reader.nextString());
						} else
								System.out.println(reader.nextInt());
						followersCount++;
				}
//				System.out.println("ending");
						reader.endObject();
						//				return new User(username, followersCount);
						//		}
				return null;
		}


		public static void main(String[] args)
				throws IOException, ParserConfigurationException, SAXException {

				com.QuABaseBD.featureCategoryRankings test = new featureCategoryRankings();
				JsonReader reader = new JsonReader(new FileReader("DataModel.json"));

				test.readFeaturesArray(reader);

				//				JsonReader reader = new JsonReader(new FileReader("DataModel.json"));
				//				Gson gson = new Gson();
				//
				//				System.out.println(reader.toString());
				//
				//				reader.beginObject();
				//
				//				while (reader.hasNext()) {
				//
				//						String name = reader.nextName();
				//						if (name.equals("category") || name.equals("description") || name.equals("version")) {
				//								reader.skipValue();
				//								continue;
				//						}
				//
				//						System.out.println(name);
				//
				//						reader.skipValue();
				//				}
				//
				//				reader.endObject();
				//				reader.close();
		}

}
