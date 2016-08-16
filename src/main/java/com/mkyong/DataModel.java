package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class DataModel extends DescriptionType {

		String featureType;
		String databaseName;
		String dataModel;
		String dataModelURL;
		String enforcedSchema;
		String schemaURL;
		String opaqueDataObjects;
		String opaqueDataURL;
		String hierarchicalDataObjects;
		String autoAllocatedKeys;
		String compositeKeys;
		String secondaryIndexes;
		String data2iURL;
		String queryByKeyRanges;
		String keyRangeURL;
		String queryByPartialKeys;
		String queryByNonKeyValues;
		String queryScanURL;
		String mapReduceAPI;
		String mapReduceURL;
		String indexedTextSearch;

		public void setDataModelDescription(String[][] descriptionMatrix){
				this.setFeatureType(descriptionMatrix[0][0]);
				this.setDatabaseName(descriptionMatrix[1][1]);
				this.setDataModel(descriptionMatrix[2][1]);
				this.setDataModelURL(descriptionMatrix[3][1]);
				this.setEnforcedSchema(descriptionMatrix[4][1]);
				this.setSchemaURL(descriptionMatrix[5][1]);
				this.setOpaqueDataObjects(descriptionMatrix[6][1]);
				this.setOpaqueDataURL(descriptionMatrix[7][1]);
				this.setHierarchicalDataObjects(descriptionMatrix[8][1]);
				this.setAutoAllocatedKeys(descriptionMatrix[9][1]);
				this.setCompositeKeys(descriptionMatrix[10][1]);
				this.setSecondaryIndexes(descriptionMatrix[11][0]);
				this.setData2iURL(descriptionMatrix[12][1]);
				this.setQueryByKeyRanges(descriptionMatrix[13][1]);
				this.setKeyRangeURL(descriptionMatrix[14][1]);
				this.setQueryByPartialKeys(descriptionMatrix[15][1]);
				this.setQueryByNonKeyValues(descriptionMatrix[16][1]);
				this.setQueryScanURL(descriptionMatrix[17][1]);
				this.setMapReduceAPI(descriptionMatrix[18][0]);
				this.setMapReduceURL(descriptionMatrix[19][1]);
				this.setIndexedTextSearch(descriptionMatrix[20][1]);
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

		public String getDataModel() {
				return dataModel;
		}

		public void setDataModel(String dataModel) {
				this.dataModel = dataModel;
		}

		public String getDataModelURL() {
				return dataModelURL;
		}

		public void setDataModelURL(String dataModelURL) {
				this.dataModelURL = dataModelURL;
		}

		public String getEnforcedSchema() {
				return enforcedSchema;
		}

		public void setEnforcedSchema(String enforcedSchema) {
				this.enforcedSchema = enforcedSchema;
		}

		public String getSchemaURL() {
				return schemaURL;
		}

		public void setSchemaURL(String schemaURL) {
				this.schemaURL = schemaURL;
		}

		public String getOpaqueDataObjects() {
				return opaqueDataObjects;
		}

		public void setOpaqueDataObjects(String opaqueDataObjects) {
				this.opaqueDataObjects = opaqueDataObjects;
		}

		public String getOpaqueDataURL() {
				return opaqueDataURL;
		}

		public void setOpaqueDataURL(String opaqueDataURL) {
				this.opaqueDataURL = opaqueDataURL;
		}

		public String getHierarchicalDataObjects() {
				return hierarchicalDataObjects;
		}

		public void setHierarchicalDataObjects(String hierarchicalDataObjects) {
				this.hierarchicalDataObjects = hierarchicalDataObjects;
		}

		public String getAutoAllocatedKeys() {
				return autoAllocatedKeys;
		}

		public void setAutoAllocatedKeys(String autoAllocatedKeys) {
				this.autoAllocatedKeys = autoAllocatedKeys;
		}

		public String getCompositeKeys() {
				return compositeKeys;
		}

		public void setCompositeKeys(String compositeKeys) {
				this.compositeKeys = compositeKeys;
		}

		public String getSecondaryIndexes() {
				return secondaryIndexes;
		}

		public void setSecondaryIndexes(String secondaryIndexes) {
				this.secondaryIndexes = secondaryIndexes;
		}

		public String getData2iURL() {
				return data2iURL;
		}

		public void setData2iURL(String data2iURL) {
				this.data2iURL = data2iURL;
		}

		public String getQueryByKeyRanges() {
				return queryByKeyRanges;
		}

		public void setQueryByKeyRanges(String queryByKeyRanges) {
				this.queryByKeyRanges = queryByKeyRanges;
		}

		public String getKeyRangeURL() {
				return keyRangeURL;
		}

		public void setKeyRangeURL(String keyRangeURL) {
				this.keyRangeURL = keyRangeURL;
		}

		public String getQueryByPartialKeys() {
				return queryByPartialKeys;
		}

		public void setQueryByPartialKeys(String queryByPartialKeys) {
				this.queryByPartialKeys = queryByPartialKeys;
		}

		public String getQueryByNonKeyValues() {
				return queryByNonKeyValues;
		}

		public void setQueryByNonKeyValues(String queryByNonKeyValues) {
				this.queryByNonKeyValues = queryByNonKeyValues;
		}

		public String getQueryScanURL() {
				return queryScanURL;
		}

		public void setQueryScanURL(String queryScanURL) {
				this.queryScanURL = queryScanURL;
		}

		public String getMapReduceAPI() {
				return mapReduceAPI;
		}

		public void setMapReduceAPI(String mapReduceAPI) {
				this.mapReduceAPI = mapReduceAPI;
		}

		public String getMapReduceURL() {
				return mapReduceURL;
		}

		public void setMapReduceURL(String mapReduceURL) {
				this.mapReduceURL = mapReduceURL;
		}

		public String getIndexedTextSearch() {
				return indexedTextSearch;
		}

		public void setIndexedTextSearch(String indexedTextSearch) {
				this.indexedTextSearch = indexedTextSearch;
		}
}
