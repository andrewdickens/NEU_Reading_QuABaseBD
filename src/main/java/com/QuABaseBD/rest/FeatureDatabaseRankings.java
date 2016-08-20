package com.QuABaseBD.rest;

import com.QuABaseBD.staticClasses.FeatureRatings;
import org.xml.sax.SAXException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@Path("/database/chart") public class FeatureDatabaseRankings {

		@GET @Path("/get/ranking/{database}/{featureCategory}/{feature}")
		@Produces(MediaType.APPLICATION_JSON)
		public Integer getFeatureRanking(@PathParam("database") String databaseName,
				@PathParam("featureCategory") String featureCategory,
				@PathParam("feature") String featureType)
				throws IOException, SAXException, ParserConfigurationException {
				return FeatureRatings.getFeatureRating(databaseName, featureCategory, featureType);
		}

//		@GET @Path("/get/ranking/{database}/{featureCategory}/{feature}/{fileName}")
//		@Produces(MediaType.APPLICATION_JSON)
//		public Integer getFeatureRankingJSON(@PathParam("database") String databaseName,
//				@PathParam("featureCategory") String featureCategory,
//				@PathParam("feature") String featureType, @PathParam("fileName") String fileName)
//				throws IOException, ParserConfigurationException, SAXException {
//				return FeatureRatings.getFeatureRatingJSON(databaseName, featureCategory, featureType);
//		}

}
