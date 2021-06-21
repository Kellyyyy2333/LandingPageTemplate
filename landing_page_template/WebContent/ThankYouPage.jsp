
<%@ page import="com.bashpole.promotermotor.landingpage.*" %>
<%@ page import="java.util.*" %>

<%!
ContactConstantClass o = new ContactConstantClass("#524f47","GTM-53XRNQ4", "Work smarter, not harder.", 
			"help create inclusive classrooms, boardrooms, and living rooms places where social and emotional learning and restorative practices are the norm, not the exception",
			"More than $.93 of every dollar donated to Peace Learning Center is directly used to provide programs and services!",
			"Peace Learning Center supports communities in redefining peace through equity, social emotional learning and the implementation of innovative practices.", 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
			"https://images.ctfassets.net/t21gix3kzulv/78gf1S3CjPrnl9rURf6Q8w/3c20fb510dd4d4653feddf86ece35e1a/ctct_ripple_logo_horizontal_white_orange.svg", 
			"Joanna Green", 
			"I have been involved with the Peace Learning Center since 2007. I wholeheartedly believe PLC makes a positive difference in the lives of young people in Indianapolis that helps them grow to be healthy adults. If you wonder what your donation does, volunteer and see!", 
			"XXXXXX");
%>
    
    
<!DOCTYPE html>
<html style="height: 100%; width: 100%;"> 

<%-- Include the style script --%>
<style><%@include file="/WEB-INF/styleCC.css"%></style>

<head>

</head>

<body style = "font-family: arial; background-color: white; height: 100%; margin: 0%; padding: 0%;">

<%-- First section: Main title --%>
<div class="title_background" style="background-color:<%= o.getBackgroundColor() %>;">
	<img src="<%= o.getImageURL() %>", alt = "logo", style="float: left; height: 6.5%; width: 10%; padding-left: 5%; padding-top: 1.5%;">
	<p class="ThankYou_title">
		Thanks for subscribing!
	</p><br><br>

	<p class="Thanks_text">
		You will receive your first email from us within the next 24 hours.
	</p>
	<p class="Thanks_text">
		Share with your friends and families via:
	</p><br>
	
	<img src="https://www.stickpng.com/img/download/580b57fcd9996e24bc43c53e/image"style="position:absolute;z-index:1;left:25.1%;top:71.8%;width:8%;height:auto;">
	<img src="https://www.freeiconspng.com/uploads/photos-facebook-logo-png-transparent-background-13.png"style="position:absolute;z-index:1;left:35.4%;top:74.8%;width:8.6%;height:auto;">
	<img src="https://logos-world.net/wp-content/uploads/2020/11/Gmail-Logo.png"style="position:absolute;z-index:1;left:46.3%;top:74.7%;width:8%;height:auto;">
	<img src="https://content.linkedin.com/content/dam/me/business/en-us/amp/brand-site/v2/bg/LI-Bug.svg.original.svg"style="position:absolute;z-index:1;left:58.5%;top:74.8%;width:5.5%;height:auto;">
	<img src="https://facebookbrand.com/wp-content/uploads/2021/03/Instagram_AppIcon_Aug2017.png?w=300&h=300"style="position:absolute;z-index:1;left:68.7%;top:73.7%;width:5.6%;height:auto;">
	<div class="icon_frame" style="left:24%;"></div>
	<div class="icon_frame" style="left:24.5%;"></div>
	<div class="icon_frame" style="left:25%;"></div>
	<div class="icon_frame" style="left:25.5%;"></div>
	<div class="icon_frame" style="left:26%;"></div>
	<p class="Share_text">For other ways to share:</p>
	<a href="" target="_blank"><p class="Link_copy">Copy link</p></a>

</div>






</body>
</html>


