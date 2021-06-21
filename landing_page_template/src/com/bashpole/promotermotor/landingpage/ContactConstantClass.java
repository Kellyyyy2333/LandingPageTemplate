package com.bashpole.promotermotor.landingpage;
//import org.junit.Before;
import org.junit.*;

public class ContactConstantClass extends AbstractLandingPage{
		
	
		public ContactConstantClass() {}
		
		// non-default constructor
		public ContactConstantClass(String backgroundColor, String tagManagerCode, String orgName, String causeShort, String contribution, String orgMission, String causeLong, String personServiced, String expandedFact, String imageURL, String donatorName, String donatorTestimony,  String NewsletterURL){
			this.backgroundColor = backgroundColor;
			this.tagManagerCode = tagManagerCode;
			this.orgName = orgName;
			this.causeShort = causeShort;
			this.contribution = contribution;
			this.orgMission = orgMission;
			this.causeLong = causeLong;
			this.personServiced = personServiced;
			this.expandedFact = expandedFact;
			this.imageURL = imageURL;
			this.donatorName = donatorName;
			this.donatorTestimony = donatorTestimony;
			this.NewsletterURL = NewsletterURL;
		}
		
		public String getNewsletterURL() {
			return this.backgroundColor;
		}

		public String getBackgroundColor() {
			return this.backgroundColor;
		}
		public String getTagManagerCode() {
			return this.tagManagerCode;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public String getCauseShort() {
			return this.causeShort;
		}
		public String getContribution() {
			return this.contribution;
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
		public String getImageURL() {
			return this.imageURL;
		}
		public String getDonatorName() {
			return this.donatorName;
		}
		public String getDonatorTestimony() {
			return this.donatorTestimony;
		}
		
		public void setBackgroundColor(String backgroundColor) {
			this.backgroundColor = backgroundColor;
		}
		public void setTagManagerCode(String tagManagerCode) {
			this.tagManagerCode = tagManagerCode;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public void setCauseShort(String causeShort) {
			this.causeShort = causeShort;
		}
		public void setContribution(String contribution) {
			this.contribution = contribution;
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
		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
		public void setDonatorName(String donatorName) {
			this.donatorName = donatorName;
		}
		public void setDonatorTestimony(String donatorTestimony) {
			this.donatorTestimony = donatorTestimony;
		}

		private String backgroundColor;
		private String tagManagerCode;
		private String orgName;
		private String causeShort;
		private String contribution;
		private String orgMission;
		private String causeLong;
		private String personServiced;
		private String expandedFact;
		private String imageURL;
		private String donatorName;
		private String donatorTestimony;
		private String NewsletterURL;
}