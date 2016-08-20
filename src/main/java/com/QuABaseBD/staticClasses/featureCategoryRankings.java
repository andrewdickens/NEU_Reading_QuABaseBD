package com.QuABaseBD.staticClasses;

import com.google.gson.stream.JsonReader;

import java.io.IOException;

/**
 * Created by andrewdickens on 8/20/16.
 */
public class featureCategoryRankings {

		public static Integer readFeaturesArray(JsonReader reader, String feature, String featureValue)
				throws IOException {
				reader.beginObject();

				while (reader.hasNext()) {
						String name = reader.nextName();

						if (!name.equals(feature)) {
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

				reader.beginObject();
				while (reader.hasNext()) {
						String name = reader.nextName();

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
