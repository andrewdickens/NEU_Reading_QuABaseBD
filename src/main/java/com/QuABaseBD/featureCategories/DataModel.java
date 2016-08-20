package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class DataModel{

		String featureType;
		String databaseName;
		String enforcedSchema;
		String opaqueDataObjects;
		String hierarchicalDataObjects;
		String autoAllocatedKeys;
		String compositeKeys;
		String secondaryIndexes;
		String queryByKeyRanges;
		String queryByPartialKeys;
		String queryByNonKeyValues;
		String mapReduceAPI;

		public void setDataModelDescription(String[][] descriptionMatrix){

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Enforced Schema")) {
								this.setEnforcedSchema(value[1]);
						} else if (value[0].equals("Opaque Data Objects (need application interpretation)")) {
								this.setOpaqueDataObjects(value[1]);
						} else if (value[0].equals("Hierarchical Data Objects (e.g. sub objects)")) {
								this.setHierarchicalDataObjects(value[1]);
						} else if (value[0].equals("Automatically Allocated Keys")) {
								this.setAutoAllocatedKeys(value[1]);
						} else if (value[0].equals("Composite Keys")) {
								this.setCompositeKeys(value[1]);
						} else if (value[0].equals("Secondary Indexes")) {
								this.setSecondaryIndexes(value[1]);
						} else if (value[0].equals("Query by Key Ranges")) {
								this.setQueryByKeyRanges(value[1]);
						}else if (value[0].equals("Query by Partial Keys")) {
								this.setQueryByPartialKeys(value[1]);
						} else if (value[0].equals("Query by Non-keyed Values")) {
								this.setQueryByNonKeyValues(value[1]);
						} else if (value[0].equals("Map Reduce API")) {
								this.setMapReduceAPI(value[1]);
						}
				}
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

		public String getEnforcedSchema() {
				return enforcedSchema;
		}

		public void setEnforcedSchema(String enforcedSchema) {
				this.enforcedSchema = enforcedSchema;
		}

		public String getOpaqueDataObjects() {
				return opaqueDataObjects;
		}

		public void setOpaqueDataObjects(String opaqueDataObjects) {
				this.opaqueDataObjects = opaqueDataObjects;
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

		public String getQueryByKeyRanges() {
				return queryByKeyRanges;
		}

		public void setQueryByKeyRanges(String queryByKeyRanges) {
				this.queryByKeyRanges = queryByKeyRanges;
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

		public String getMapReduceAPI() {
				return mapReduceAPI;
		}

		public void setMapReduceAPI(String mapReduceAPI) {
				this.mapReduceAPI = mapReduceAPI;
		}

}
