package com.QuABaseBD.rest;

import com.QuABaseBD.parsers.JSONParser;
import com.QuABaseBD.staticClass.Database;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/database/chart") public class JSONServiceChartData {

//		@GET @Path("/get/labels") @Produces(MediaType.APPLICATION_JSON)
//		public ChartLabels getChartLabels() {
//
//				return Database.retrieveChartLabels();
//		}

//		@GET @Path("/get/data/{database}") @Produces(MediaType.APPLICATION_JSON)
//		public ChartData getAccumuloData(@PathParam("database") String databaseName) {
//
//				return Database.retrieveChartData(databaseName);
//		}

//		@GET @Path("/get/ranking/{database}/{feature}") @Produces(MediaType.APPLICATION_JSON)
//		public FeatureRatings getChartRanking(@PathParam("database") String databaseName,
//				@PathParam("feature") String featureType) {
//				return FeatureRatings.getFeatureRating(featureType, databaseName);
//		}

		@GET @Path("/get/ranking/{database}/{featureCategory}/{feature}")
		@Produces(MediaType.APPLICATION_JSON)
		public Integer getChartRankingAll(@PathParam("database") String databaseName,
				@PathParam("featureCategory") String featureCategory,
				@PathParam("feature") String featureType) {
				return FeatureRatings.getFeatureRatingAll(databaseName, featureCategory, featureType);
		}

		@GET @Path("/get/{database}") @Produces(MediaType.APPLICATION_JSON)
		public Database getDatabaseInformation(@PathParam("database") String databaseName) {

				Database database = new Database();
				String name = database.retrieveNameFromDatabase(databaseName);
				database.setName(name);
				String description =
						JSONParser.parseStringToJSON(database.retrieveDescriptionFromDatabase(databaseName));
				database.setDescription(description);

				return database;
		}

//		@GET @Path("/get/{database}/{feature}") @Produces(MediaType.APPLICATION_JSON)
//		public DescriptionType getDatabaseFeatureInformation(@PathParam("database") String databaseName,
//				@PathParam("feature") String feature) {
//				return DatabaseDescription.setFeatureDescription(
//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, feature)),
//						feature, databaseName);
//		}
//
//		@GET @Path("/get/{database}/{featureCategory}/{feature}") @Produces(MediaType.APPLICATION_JSON)
//		public DescriptionType getDatabaseFeatureInformationAll(
//				@PathParam("database") String databaseName,
//				@PathParam("featureCategory") String featureCategory,
//				@PathParam("feature") String feature) {
//				return DatabaseDescription.setFeatureDescription(
//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, feature)),
//						feature, databaseName);
//		}

}
