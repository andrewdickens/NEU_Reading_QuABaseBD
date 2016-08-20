package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class QueryLanguage{

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

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("API-based")) {
								this.setApiBased(value[1]);
						} else if (value[0].equals("Declarative")) {
								this.setDeclaritive(value[1]);
						} else if (value[0].equals("REST/HTTP-based")) {
								this.setRestHTTPBased(value[1]);
						} else if (value[0].equals("Languages supported")) {
								this.setLanguagesSupported(value[1]);
						} else if (value[0].equals("Cursor-based queries")) {
								this.setCursorBasedQuery(value[1]);
						} else if (value[0].equals("JOIN-style queries")) {
								this.setJoinStyleQuery(value[1]);
						} else if (value[0].equals("Complex data types")) {
								this.setComplexDataTypes(value[1]);
						} else if (value[0].equals("Restrict number of objects returned by a query")) {
								this.setRestrictObjectsReturnByQuery(value[1]);
						} else if (value[0].equals("Key matching options")) {
								this.setKeyMatchingOptions(value[1]);
						}else if (value[0].equals("Sorting of query results")) {
								this.setSortingOfQueryResults(value[1]);
						} else if (value[0].equals("Triggers")) {
								this.setTriggers(value[1]);
						} else if (value[0].equals("Expire data values")) {
								this.setExpireDataValues(value[1]);
						}
				}

		}

		public QueryLanguage() {
				this.featureType = "noValue";
				this.databaseName = "noValue";
				this.apiBased = "noValue";
				this.APIURL = "noValue";
				this.declaritive = "noValue";
				RestHTTPBased = "noValue";
				this.languagesSupported = "noValue";
				this.languageURL = "noValue";
				this.cursorBasedQuery = "noValue";
				this.cursorURL = "noValue";
				this.joinStyleQuery = "noValue";
				this.complexDataTypes = "noValue";
				this.qlDataTypesURL = "noValue";
				this.restrictObjectsReturnByQuery = "noValue";
				this.restrictURL = "noValue";
				this.keyMatchingOptions = "noValue";
				this.sortingOfQueryResults = "noValue";
				this.sortURL = "noValue";
				this.triggers = "noValue";
				this.expireDataValues = "noValue";
				this.expiryURL = "noValue";
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
