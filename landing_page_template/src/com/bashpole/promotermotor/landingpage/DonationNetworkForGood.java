
package com.bashpole.promotermotor.landingpage;
//import org.junit.Before;
import org.junit.*;
//import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

import java.util.*;


// Classes created for specific JSPs that create additional 
// specialized variables and their get functions.
public class DonationNetworkForGood extends AbstractLandingPage{// implements com.bashpole.concrete.ad.LandingPageDAO {
		// non-default constructor
		public DonationNetworkForGood() {}
		
		// Constructor build for creating objects from the database
		public DonationNetworkForGood(Map<String, String> intakeVarsMap) {

			this.backgroundColor = intakeVarsMap.get("backgroundColor");
			this.tagManagerCode = intakeVarsMap.get("tagManagerCode");
			this.orgName = intakeVarsMap.get("orgName");
			this.causeShort = intakeVarsMap.get("causeShort");
			this.contribution = intakeVarsMap.get("contribution");
			this.orgMission = intakeVarsMap.get("orgMission");
			this.causeLong = intakeVarsMap.get("causeLong");
			this.personServiced = intakeVarsMap.get("personServiced");
			this.expandedFact = intakeVarsMap.get("expandedFact");
			this.logoURL = intakeVarsMap.get("logoURL");
			this.donatorName = intakeVarsMap.get("donatorName");
			this.donatorTestimony = intakeVarsMap.get("donatorTestimony");
			this.externalLink = intakeVarsMap.get("externalLink");

			//Checking if mandatory variables is equal to null
			if (this.orgName == null) {System.err.println("orgName cannot be null");}
			//if not exist, set to default values
			if (this.backgroundColor == null) {
				System.out.println("backgroundColor shouldn't be null");
				this.backgroundColor = "#ffffff";
				}
			if (this.tagManagerCode == null) {System.out.println("tagManagerCode shouldn't be null");}
			if (this.causeShort == null) {System.out.println("causeShort shouldn't be null");}
			if (this.contribution == null) {System.out.println("contribution shouldn't be null");}
			if (this.orgMission == null) {System.out.println("orgMission shouldn't be null");}
			if (this.causeLong == null) {System.out.println("causeLong shouldn't be null");}
			if (this.personServiced == null) {System.out.println("personServiced shouldn't be null");}
			if (this.expandedFact == null) {System.out.println("expandedFact shouldn't be null");}
			if (this.logoURL == null) {System.out.println("logoURL shouldn't be null");}
			if (this.donatorName == null) {System.out.println("donatorName shouldn't be null");}
			if (this.donatorTestimony == null) {System.out.println("donatorTestimony shouldn't be null");}
			if (this.externalLink == null) {System.out.println("externalLink shouldn't be null");}
		}
		

		// Constructor build for testing without the access to database
		public DonationNetworkForGood(String backgroundColor, String tagManagerCode, String orgName, String causeShort, 
				String contribution, String orgMission, String causeLong, String personServiced, String expandedFact, 
				String logoURL, String donatorName, String donatorTestimony, String externalLink) {
			this.backgroundColor = backgroundColor;
			this.tagManagerCode = tagManagerCode;
			this.orgName = orgName;
			this.causeShort = causeShort;
			this.contribution = contribution;
			this.orgMission = orgMission;
			this.causeLong = causeLong;
			this.personServiced = personServiced;
			this.expandedFact = expandedFact;
			this.logoURL = logoURL;
			this.donatorName = donatorName;
			this.donatorTestimony = donatorTestimony;
			this.externalLink = externalLink;
		}
		
		// Get (attributes) functions
		public String getTagManagerCode() {
			return this.tagManagerCode;
		}
		public String getContribution() {
			return this.contribution;
		}
		public String getDonatorName() {
			return this.donatorName;
		}
		public String getDonatorTestimony() {
			return this.donatorTestimony;
		}
		public String getexternalLink() {
			return this.externalLink;
		}
		
		public void setTagManagerCode(String tagManagerCode) {
			this.tagManagerCode = tagManagerCode;
		}
		public void setContribution(String contribution) {
			this.contribution = contribution;
		}
		public void setDonatorName(String donatorName) {
			this.donatorName = donatorName;
		}
		public void setDonatorTestimony(String donatorTestimony) {
			this.donatorTestimony = donatorTestimony;
		}
		public void setexternalLink(String externalLink) {
			this.externalLink = externalLink;
		}

		private String tagManagerCode;
		private String contribution;
		private String donatorName;
		private String donatorTestimony;
		private String externalLink;
		
		
		
//		@Override
//		public void getData(int adID) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public Map<String, String> getData(int adID, List<String> variableNames) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public void putConversion(int adID, Map<String, String> jsonValues) {
//			// TODO Auto-generated method stub
//			
//		}
		
		

		
}
