package com.QuABaseBD;

import com.google.gson.stream.JsonReader;

import java.io.IOException;

/**
 * Created by andrewdickens on 8/20/16.
 */
public class featureCategoryRankings {

		public static Integer readFeaturesArray(JsonReader reader, String feature, String featureValue) throws IOException {
				System.out.println("Starting readFeaturesArrayMethod");

				System.out.println(reader.toString());

				reader.beginObject();

				while (reader.hasNext()) {

						String name = reader.nextName();
//						if (name.equals("category") || name.equals("description") || name.equals("version")) {
//								System.out.println(name);
//								reader.skipValue();
//								continue;
//						}

						if(!name.equals(feature)) {
								reader.skipValue();
								continue;
						}

						return readFeature(reader, featureValue);
				}

				reader.endObject();
				reader.close();
				return 50;
		}

		public static Integer readFeature(JsonReader reader, String featureValue) throws IOException {

				System.out.println("feature value is " + featureValue);
				reader.beginObject();
				while (reader.hasNext()) {
						String name = reader.nextName();
						System.out.println("name is " + name);

						if (!name.equals(featureValue)) {
								reader.skipValue();
								continue;
						}

						return reader.nextInt();
				}
						reader.endObject();

				return 50;
		}

}
