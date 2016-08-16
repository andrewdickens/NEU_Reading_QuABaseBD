package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class QueryLanguage extends DescriptionType {

		String featureType;
		String databaseName;
		String apiBased;
		String APIURL;
		String declaritive;
		String RestHTTPBased;
		String languagesSupported;
		String languageURL;
		String cursorBasedQuery;
		String cursorURL;
		String joinStyleQuery;
		String complexDataTypes;
		String qlDataTypesURL;
		String restrictObjectsReturnByQuery;
		String restrictURL;
		String keyMatchingOptions;
		String sortingOfQueryResults;
		String sortURL;
		String triggers;
		String expireDataValues;
		String expiryURL;

		public void setQueryLanguageDescription(String[][] descriptionMatrix){
				this.setFeatureType(descriptionMatrix[0][0]);
				this.setDatabaseName(descriptionMatrix[1][1]);
				this.setApiBased(descriptionMatrix[2][1]);
				this.setAPIURL(descriptionMatrix[3][1]);
				this.setDeclaritive(descriptionMatrix[4][1]);
				this.setRestHTTPBased(descriptionMatrix[5][1]);
				this.setLanguagesSupported(descriptionMatrix[6][1]);
				this.setLanguageURL(descriptionMatrix[7][1]);
				this.setCursorBasedQuery(descriptionMatrix[8][1]);
				this.setCursorURL(descriptionMatrix[9][1]);
				this.setJoinStyleQuery(descriptionMatrix[10][1]);
				this.setComplexDataTypes(descriptionMatrix[11][1]);
				this.setQlDataTypesURL(descriptionMatrix[12][1]);
				this.setRestrictObjectsReturnByQuery(descriptionMatrix[13][1]);
				this.setRestrictURL(descriptionMatrix[14][1]);
				this.setKeyMatchingOptions(descriptionMatrix[15][1]);
				this.setSortingOfQueryResults(descriptionMatrix[16][1]);
				this.setSortURL(descriptionMatrix[17][1]);
				this.setTriggers(descriptionMatrix[18][1]);
				this.setExpireDataValues(descriptionMatrix[19][0]);
				this.setExpiryURL(descriptionMatrix[20][1]);

		}

		public String getQlDataTypesURL() {
				return qlDataTypesURL;
		}

		public void setQlDataTypesURL(String alDataTypesURL) {
				this.qlDataTypesURL = alDataTypesURL;
		}

		public String getFeatureType() {
				return featureType;
		}

		public void setFeatureType(String featureType) {
				this.featureType = featureType;
		}

		public String getDatabaseName() {
				return databaseName;
		}

		public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
		}

		public String getApiBased() {
				return apiBased;
		}

		public void setApiBased(String apiBased) {
				this.apiBased = apiBased;
		}

		public String getAPIURL() {
				return APIURL;
		}

		public void setAPIURL(String APIURL) {
				this.APIURL = APIURL;
		}

		public String getDeclaritive() {
				return declaritive;
		}

		public void setDeclaritive(String declaritive) {
				this.declaritive = declaritive;
		}

		public String getRestHTTPBased() {
				return RestHTTPBased;
		}

		public void setRestHTTPBased(String restHTTPBased) {
				RestHTTPBased = restHTTPBased;
		}

		public String getLanguagesSupported() {
				return languagesSupported;
		}

		public void setLanguagesSupported(String languagesSupported) {
				this.languagesSupported = languagesSupported;
		}

		public String getLanguageURL() {
				return languageURL;
		}

		public void setLanguageURL(String languageURL) {
				this.languageURL = languageURL;
		}

		public String getCursorBasedQuery() {
				return cursorBasedQuery;
		}

		public void setCursorBasedQuery(String cursorBasedQuery) {
				this.cursorBasedQuery = cursorBasedQuery;
		}

		public String getCursorURL() {
				return cursorURL;
		}

		public void setCursorURL(String cursorURL) {
				this.cursorURL = cursorURL;
		}

		public String getJoinStyleQuery() {
				return joinStyleQuery;
		}

		public void setJoinStyleQuery(String joinStyleQuery) {
				this.joinStyleQuery = joinStyleQuery;
		}

		public String getComplexDataTypes() {
				return complexDataTypes;
		}

		public void setComplexDataTypes(String complexDataTypes) {
				this.complexDataTypes = complexDataTypes;
		}

		public String getRestrictObjectsReturnByQuery() {
				return restrictObjectsReturnByQuery;
		}

		public void setRestrictObjectsReturnByQuery(String restrictObjectsReturnByQuery) {
				this.restrictObjectsReturnByQuery = restrictObjectsReturnByQuery;
		}

		public String getRestrictURL() {
				return restrictURL;
		}

		public void setRestrictURL(String restrictURL) {
				this.restrictURL = restrictURL;
		}

		public String getKeyMatchingOptions() {
				return keyMatchingOptions;
		}

		public void setKeyMatchingOptions(String keyMatchingOptions) {
				this.keyMatchingOptions = keyMatchingOptions;
		}

		public String getSortingOfQueryResults() {
				return sortingOfQueryResults;
		}

		public void setSortingOfQueryResults(String sortingOfQueryResults) {
				this.sortingOfQueryResults = sortingOfQueryResults;
		}

		public String getSortURL() {
				return sortURL;
		}

		public void setSortURL(String sortURL) {
				this.sortURL = sortURL;
		}

		public String getTriggers() {
				return triggers;
		}

		public void setTriggers(String triggers) {
				this.triggers = triggers;
		}

		public String getExpireDataValues() {
				return expireDataValues;
		}

		public void setExpireDataValues(String expireDataValues) {
				this.expireDataValues = expireDataValues;
		}

		public String getExpiryURL() {
				return expiryURL;
		}

		public void setExpiryURL(String expiryURL) {
				this.expiryURL = expiryURL;
		}
}
