package com.bashpole.promotermotor.landingpage;
import java.util.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;

// Classes created for specific unit tests, 
// including basic class attributes assignment 
// tests and null value tests.


public class LandingPageTest {
	
	DonationNetworkForGood testpage;
	DonationNetworkForGood testpageNull;
	private Map<String, String> sampleData;
	
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalErr = System.err;
	
	
	private static final String backgroundColor = "#8489ba";
	private static final String tagManagerCode = "GTM-T9VQ4NJ";
	private static final String orgName = "Peace Learning Center";
	private static final String causeShort = "XXXXX";
	private static final String contribution = "XXXXX";
	private static final String orgMission = "XXXXX";
	private static final String causeLong = "XXXXX";
	private static final String personServiced = "XXXXX";
	private static final String expandedFact = "XXXXX";
	private static final String logoURL = "XXXXX";
	private static final String donatorName = "XXXXX";
	private static final String donatorTestimony = "XXXXX";
	private static final String externalLink = "www.sample.com";
	
	
	
	
	@Before
	public void initStream(){

		System.setErr(new PrintStream(errContent));
	}
	
	@After
	public void resetStream() {
		System.setErr(originalErr);
	}
	
	public void initMap() {
		sampleData = new HashMap<>();
		sampleData.put("backgroundColor", backgroundColor);
		sampleData.put("tagManagerCode", tagManagerCode);
		sampleData.put("orgName", orgName);
		sampleData.put("causeShort", causeShort);
		sampleData.put("contribution", contribution);
		sampleData.put("orgMission", orgMission);
		sampleData.put("causeLong", causeLong);
		sampleData.put("personServiced", personServiced);
		sampleData.put("expandedFact", expandedFact);
		sampleData.put("logoURL", logoURL);
		sampleData.put("donatorName", donatorName);
		sampleData.put("donatorTestimony", donatorTestimony);
		sampleData.put("externalLink", externalLink);
	}
	
	
	@Test
    public void testNormal(){ 
		initMap();
		testpage = new DonationNetworkForGood(sampleData);
		assertEquals(testpage.getBackgroundColor(), backgroundColor);
		assertEquals(testpage.getTagManagerCode(), tagManagerCode);
		assertEquals(testpage.getOrgName(), orgName);
		assertEquals(testpage.getCauseShort(), causeShort);
		assertEquals(testpage.getContribution(), contribution);
		assertEquals(testpage.getOrgMission(), orgMission);
		assertEquals(testpage.getCauseLong(), causeLong);
		assertEquals(testpage.getPersonServiced(), personServiced);
		assertEquals(testpage.getExpandedFact(), expandedFact);
		assertEquals(testpage.getLogoURL(), logoURL);
		assertEquals(testpage.getDonatorName(), donatorName);
		assertEquals(testpage.getDonatorTestimony(), donatorTestimony);
		assertEquals(testpage.getexternalLink(), externalLink);
        
    }
	
	@Test
    public void testNull(){ 
		initMap();
		//sampleData.replace("orgName", null);
		sampleData.replace("externalLink", null);
		sampleData.replace("backgroundColor", null);
		sampleData.replace("logoURL", null);
		sampleData.replace("orgMission", null);
		
		testpageNull = new DonationNetworkForGood(sampleData);
		
//		System.out.println(testpageNull.getOrgName());
		//assertNotNull(testpageNull.getOrgName());
        assertNotNull(testpageNull.getexternalLink());
        assertNotNull(testpageNull.getBackgroundColor());
        assertNotNull(testpageNull.getLogoURL());
        assertNotNull(testpageNull.getOrgMission());
        
		
		String check = errContent.toString();
		
		assertTrue(check.contains("SEVERE: orgName cannot be null"));
		assertTrue(check.contains("SEVERE: External Link shouldn't be null."));
		assertTrue(check.contains("INFO: Background color is null and will be set to default."));
		assertTrue(check.contains("SEVERE: Logo URL shouldn't be null."));
		assertTrue(check.contains("SEVERE: Organization Mission shouldn't be null"));
        
    }
	
	
	
	

}
