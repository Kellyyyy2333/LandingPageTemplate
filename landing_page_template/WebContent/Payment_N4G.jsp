


<%@ page import="com.bashpole.promotermotor.landingpage.*" %>
<%@ page import="java.util.*" %>

<% 	
	int adID = 1;
	/*if (request.getParameter("adId") != null) {
		adID = Integer.parseInt(request.getParameter("adId")); 	
	}*/
	
	//List<String> variableNames = new LinkedList<String>();
	
	LandingPageDAO dbAccess = new LandingPageDAO("root","kelly5638","jdbc:mysql://localhost:3306/landingPage_N4G"); //get access to database
	//LandingPageDAO dbAccess = new LandingPageDAO("masterUsername","Kelly2331","jdbc:mysql://aws-landingpage-test.c5cro3v4pg3v.us-east-1.rds.amazonaws.com:3306/aws_landingPage");
	Map<String,String> data = dbAccess.getConcreteAd(adID);
	System.out.println(data);
	DonationNetworkForGood o = new DonationNetworkForGood(data);
%>

<%!
	
	/*DonationNetworkForGood o = new DonationNetworkForGood("#635b5b","GTM-T9VQ4NJ", "Peace Learning Center", 
			"help create inclusive classrooms, boardrooms, and living rooms places where social and emotional learning and restorative practices are the norm, not the exception",
			"More than $.93 of every dollar donated to Peace Learning Center is directly used to provide programs and services!",
			"Peace Learning Center supports communities in redefining peace through equity, social emotional learning and the implementation of innovative practices.", 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
			"https://peacelearningcenter.org/wp-content/uploads/2017/05/Peace-Learning-Center-KO-600-240.png", 
			"Joanna Green", 
			"I have been involved with the Peace Learning Center since 2007. I wholeheartedly believe PLC makes a positive difference in the lives of young people in Indianapolis that helps them grow to be healthy adults. If you wonder what your donation does, volunteer and see!", 
			"https://bpsanctuary.networkforgood.com/projects/89985-black-pine-2020?utm_source=google&utm_medium=cpc&utm_campaign=bashpole_donation");
*/
%>

<!DOCTYPE html>

<html style="height: 100%; width: 100%;"> 

<%-- Include the style script --%>
<style><%@include file="/WEB-INF/style.css"%></style>
<%--<title>Donate to <%= o.getOrgName() %></title>--%>
<head>
<%-- Google Tag Manager --%>
<script>
	(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
		new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
		j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
		'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
	})(window,document,'script','dataLayer','<%= o.getTagManagerCode() %>');
</script>


<%@ include file="header.jsp" %>
</head>



<body style="background-color:white; height: 100%; margin: 0%; padding: 0%; font-family: arial">

<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=<%= o.getTagManagerCode() %>"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>

<%-- First section: Main title --%>

<div class="title_background" style="background-color:<%= o.getBackgroundColor() %>;">
	<img src="<%= o.getLogoURL() %>", alt = "logo", style="float: left; height: 6.5%; width: 10%; padding-left: 5%; padding-top: 1.5%;">
	<p class="main_title">
		Make A Difference Today
	</p><br>
	<p class="sub_main_title">
		Where is your contribution going?
	</p><br>
	<p class="contribution">
		<%= o.getContribution() %> 
	</p><br>
</div>

<%-- Second section: Donation options and button --%>

<div class="donation_section">
	<%--<p class="donation_prompt">Take Action With Us</p>--%>
	<input type="image" class = "donate_button" onclick = "Payment()" src="https://www.networkforgood.com/wp-content/uploads/2015/08/green_lg.gif" style="width:300px;"/>
	
	<script>
		function Payment(){
			window.open('<%= o.getexternalLink() %>','','top = 500,left=1100, width=700,height=700');
    		alert("finish donation through NetworkforGood");}
	</script>
	
	<p class="meet_supporter">Meet Our Supporters</p>
	<div class="donator_testimony">
		<i> <%= o.getDonatorTestimony() %></i>
    	<p><%= o.getDonatorName() %></p>
    </div>
</div>

<%-- Third section: Company Vision and impacts --%>

<div class="company_vision">
	
	<div class="sub_vision">
		<input type="image" class="vision_image">
		<p class="vision_text">Here at <%= o.getOrgName() %> we are striving to <%= o.getCauseShort() %> <%= o.getOrgMission() %> </p>
		<button type="button" class="explore">Learn more</button>
	</div>
	<br><br><br><br><br>
	
	<div class="sub_vision">
		<h3 class="donation_prompt">The impact of your donation will be felt in many ways:</h3>
		<ul class="impact_text" style="padding-bottom: 1.5%">
			<li style="padding-bottom: 1.5%"> <%= o.getCauseLong() %></li>
			<li style="padding-bottom: 1.5%">Each dollar you donate will benefit <%= o.getPersonServiced() %>.</li>
			<li style="padding-bottom: 1.5%"><%= o.getExpandedFact() %>. With your support, you will be creating a positive impact on the world.</li>
		</ul>
	</div>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>




