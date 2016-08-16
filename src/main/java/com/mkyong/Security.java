package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Security extends DescriptionType {

		String featureType;
		String databaseName;
		String clientAuthentication;
		String clientAuthURL;
		String serverAuthentication;
		String serverAuthURL;
		String credentialStore;
		String credentialsURL;
		String roleBasedSecurity;
		String secRolesURL;
		String securityRoleOptions;
		String secRoleOptionURL;
		String scopeOfRoles;
		String secRoleScopeURL;
		String databaseEncryption;
		String secEncryptURL;
		String logging;
		String secLoggingURL;

		public void setSecurityDescription(String[][] descriptionMatrix){
				this.setFeatureType(descriptionMatrix[0][0]);
				this.setDatabaseName(descriptionMatrix[1][1]);
				this.setClientAuthentication(descriptionMatrix[2][1]);
				this.setClientAuthURL(descriptionMatrix[3][1]);
				this.setServerAuthentication(descriptionMatrix[4][1]);
				this.setServerAuthURL(descriptionMatrix[5][1]);
				this.setCredentialStore(descriptionMatrix[6][1]);
				this.setCredentialsURL(descriptionMatrix[7][1]);
				this.setRoleBasedSecurity(descriptionMatrix[8][1]);
				this.setSecRolesURL(descriptionMatrix[9][1]);
				this.setSecurityRoleOptions(descriptionMatrix[10][1]);
				this.setSecRoleOptionURL(descriptionMatrix[11][0]);
				this.setScopeOfRoles(descriptionMatrix[12][1]);
				this.setSecRolesURL(descriptionMatrix[13][1]);
				this.setDatabaseEncryption(descriptionMatrix[14][1]);
				this.setSecEncryptURL(descriptionMatrix[15][1]);
				this.setLogging(descriptionMatrix[16][1]);
				this.setSecLoggingURL(descriptionMatrix[17][1]);

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

		public String getClientAuthURL() {
				return clientAuthURL;
		}

		public void setClientAuthURL(String clientAuthURL) {
				this.clientAuthURL = clientAuthURL;
		}

		public String getServerAuthentication() {
				return serverAuthentication;
		}

		public void setServerAuthentication(String serverAuthentication) {
				this.serverAuthentication = serverAuthentication;
		}

		public String getServerAuthURL() {
				return serverAuthURL;
		}

		public void setServerAuthURL(String serverAuthURL) {
				this.serverAuthURL = serverAuthURL;
		}

		public String getCredentialStore() {
				return credentialStore;
		}

		public void setCredentialStore(String credentialStore) {
				this.credentialStore = credentialStore;
		}

		public String getCredentialsURL() {
				return credentialsURL;
		}

		public void setCredentialsURL(String credentialsURL) {
				this.credentialsURL = credentialsURL;
		}

		public String getRoleBasedSecurity() {
				return roleBasedSecurity;
		}

		public void setRoleBasedSecurity(String roleBasedSecurity) {
				this.roleBasedSecurity = roleBasedSecurity;
		}

		public String getSecRolesURL() {
				return secRolesURL;
		}

		public void setSecRolesURL(String secRolesURL) {
				this.secRolesURL = secRolesURL;
		}

		public String getSecurityRoleOptions() {
				return securityRoleOptions;
		}

		public void setSecurityRoleOptions(String securityRoleOptions) {
				this.securityRoleOptions = securityRoleOptions;
		}

		public String getSecRoleOptionURL() {
				return secRoleOptionURL;
		}

		public void setSecRoleOptionURL(String secRoleOptionURL) {
				this.secRoleOptionURL = secRoleOptionURL;
		}

		public String getScopeOfRoles() {
				return scopeOfRoles;
		}

		public void setScopeOfRoles(String scopeOfRoles) {
				this.scopeOfRoles = scopeOfRoles;
		}

		public String getSecRoleScopeURL() {
				return secRoleScopeURL;
		}

		public void setSecRoleScopeURL(String secRoleScopeURL) {
				this.secRoleScopeURL = secRoleScopeURL;
		}

		public String getDatabaseEncryption() {
				return databaseEncryption;
		}

		public void setDatabaseEncryption(String databaseEncryption) {
				this.databaseEncryption = databaseEncryption;
		}

		public String getSecEncryptURL() {
				return secEncryptURL;
		}

		public void setSecEncryptURL(String secEncryptURL) {
				this.secEncryptURL = secEncryptURL;
		}

		public String getLogging() {
				return logging;
		}

		public void setLogging(String logging) {
				this.logging = logging;
		}

		public String getSecLoggingURL() {
				return secLoggingURL;
		}

		public void setSecLoggingURL(String secLoggingURL) {
				this.secLoggingURL = secLoggingURL;
		}
}
