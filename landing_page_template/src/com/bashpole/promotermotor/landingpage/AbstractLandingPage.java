package com.bashpole.promotermotor.landingpage;


// Abstract Class that stores common variables among 
// all JSPs as fields and their corresponding get functions.


abstract class AbstractLandingPage{
	
		// Get (attributes) functions
		public String getBackgroundColor() {
			return this.backgroundColor;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public String getCauseShort() {
			return this.causeShort;
		}
		public String getOrgMission() {
			return this.orgMission;
		}
		public String getCauseLong() {
			return this.causeLong;
		}
		public String getPersonServiced() {
			return this.personServiced;
		}
		public String getExpandedFact() {
			return this.expandedFact;
		}
		public String getLogoURL() {
			return this.logoURL;
		}
		
		// Set (attributes) functions
		public void setBackgroundColor(String backgroundColor) {
			this.backgroundColor = backgroundColor;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public void setCauseShort(String causeShort) {
			this.causeShort = causeShort;
		}
		public void setOrgMission(String orgMission) {
			this.orgMission = orgMission;
		}
		public void setCauseLong(String causeLong) {
			this.causeLong = causeLong;
		}
		public void setPersonServiced(String personServiced) {
			this.personServiced = personServiced;
		}
		public void setExpandedFact(String expandedFact) {
			this.expandedFact = expandedFact;
		}
		public void setLogoURL(String logoURL) {
			this.logoURL = logoURL;
		}

		protected String backgroundColor;
		protected String orgName;
		protected String causeShort;
		protected String orgMission;
		protected String causeLong;
		protected String personServiced;
		protected String expandedFact;
		protected String logoURL;
}
