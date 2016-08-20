package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Security {

		String featureType;
		String databaseName;
		String clientAuthentication;
		String serverAuthentication;
		String credentialStore;
		String roleBasedSecurity;
		String securityRoleOptions;
		String scopeOfRoles;
		String databaseEncryption;
		String logging;

		public void setSecurityDescription(String[][] descriptionMatrix) {

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Client Authentication")) {
								this.setClientAuthentication(value[1]);
						} else if (value[0].equals("Server authentication")) {
								this.setServerAuthentication(value[1]);
						} else if (value[0].equals("Credential Store")) {
								this.setCredentialStore(value[1]);
						} else if (value[0].equals("Role Based Security")) {
								this.setRoleBasedSecurity(value[1]);
						} else if (value[0].equals("Security Role Options")) {
								this.setSecurityRoleOptions(value[1]);
						} else if (value[0].equals("Scope of Roles")) {
								this.setScopeOfRoles(value[1]);
						} else if (value[0].equals("Database Encryption")) {
								this.setDatabaseEncryption(value[1]);
						} else if (value[0].equals("Logging")) {
								this.setLogging(value[1]);
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

		public String getClientAuthentication() {
				return clientAuthentication;
		}

		public void setClientAuthentication(String clientAuthentication) {
				this.clientAuthentication = clientAuthentication;
		}

		public String getServerAuthentication() {
				return serverAuthentication;
		}

		public void setServerAuthentication(String serverAuthentication) {
				this.serverAuthentication = serverAuthentication;
		}

		public String getCredentialStore() {
				return credentialStore;
		}

		public void setCredentialStore(String credentialStore) {
				this.credentialStore = credentialStore;
		}

		public String getRoleBasedSecurity() {
				return roleBasedSecurity;
		}

		public void setRoleBasedSecurity(String roleBasedSecurity) {
				this.roleBasedSecurity = roleBasedSecurity;
		}

		public String getSecurityRoleOptions() {
				return securityRoleOptions;
		}

		public void setSecurityRoleOptions(String securityRoleOptions) {
				this.securityRoleOptions = securityRoleOptions;
		}

		public String getScopeOfRoles() {
				return scopeOfRoles;
		}

		public void setScopeOfRoles(String scopeOfRoles) {
				this.scopeOfRoles = scopeOfRoles;
		}

		public String getDatabaseEncryption() {
				return databaseEncryption;
		}

		public void setDatabaseEncryption(String databaseEncryption) {
				this.databaseEncryption = databaseEncryption;
		}

		public String getLogging() {
				return logging;
		}

		public void setLogging(String logging) {
				this.logging = logging;
		}

}
