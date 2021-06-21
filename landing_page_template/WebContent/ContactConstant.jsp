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
  <!-- Google Tag Manager -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer','<%= o.getTagManagerCode() %>');
</script>
<!-- End Google Tag Manager -->
<%@ include file="header.jsp" %>
</head>


<body style = "font-family: arial; background-color: white; height: 100%; margin: 0%; padding: 0%;">

<!-- Google Tag Manager (noscript) -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=<%= o.getTagManagerCode() %>"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) -->


<%-- First section: Main title --%>
<div class="title_background" style="background-color:<%= o.getBackgroundColor() %>;">
	<img src="<%= o.getImageURL() %>", alt = "logo", style="float: left; height: 6.5%; width: 10%; padding-left: 5%; padding-top: 1.5%;">
	<p class="main_title">
		Work smarter, not harder.
	</p><br>

	<p class="contribution">
		 <%= o.getCauseLong() %>
	</p><br>
	<input type="text" class="email_field" placeholder="Your Email Address">
	<a href="https://go.constantcontact.com/signup.jsp" target="_blank">
	<button type="button" class="subscribe">Subscribe</button></a>
</div>



<%-- Second section: Benefits --%>
<div class="Benefits_section">
	<h2 class="Benefits_title">Benefits of Subscribing:</h2>
	<input type="image" class="Benefits_image">
	<ul class="Benefits_text" style="padding-bottom: 1.5%">
		<li style="padding-bottom: 1.5%">Create branded emails</li>
		<li style="padding-bottom: 1.5%">Sell products</li>
		<li style="padding-bottom: 1.5%">Build a website</li>
	</ul>
	<a href="https://go.constantcontact.com/signup.jsp" target="_blank">
	<button type="button" class="Benefits_button" style="left: 59%; top: 75%;">Subscribe</button></a>

</div>

<%-- Third section: Events --%>
<div class="Events_section">
	<h2 class="Benefits_title">The process of any events</h2>
	<p class="Events_description">A short description of the activity and what we can offer</p>
	
	<div class="Event_column" style="left: 16%">
		<input type="image" class="Column_image">
		<br><br><br><br><br>
		<center><h1>Topic</h1>
		<p>Some description</p></center>
	</div>
	<div class="Event_column" style="left: 42%">
		<input type="image" class="Column_image">
		<br><br><br><br><br>
		<center><h1>Topic</h1>
		<p>Some description</p></center>
	</div>
	<div class="Event_column" style="left: 68%">
		<input type="image" class="Column_image">
		<br><br><br><br><br>
		<center><h1>Topic</h1>
		<p>Some description</p></center>
	</div>
	
	<a href="https://go.constantcontact.com/signup.jsp" target="_blank">
	<button type="button" class="Benefits_button" style="left: 41%; top: 87%;">Subscribe</button></a>

</div>


<%-- Forth section: Video description --%>
<div class="Video_section">
	<h2 class="Benefits_title">Title</h2>
	<p class="Events_description">A short description of the videos and what we can offer</p>
	
	<div class="video_sub_section">
		<div class="video_buffer"><h1 style="text-align: center;">Video</h1></div>
		<p class="video_script" style="top:5%;">A short description of the videos and what we can offer.</p>
		<p class="video_script" style="top:25%;">A short description of the videos and what we can offer.</p>
		<p class="video_script" style="top:45%;">A short description of the videos and what we can offer.</p>
		
	</div>

	<a href="https://go.constantcontact.com/signup.jsp" target="_blank">
	<button type="button" class="Benefits_button" style="left: 41%; top: 92%;">Subscribe</button></a>

</div>




<%-- Last section: Contact Information --%>
<div class="Contact_section">
	<h2 class="Contact_text">We'd like to know you!</h2>
	<button type="button" class="Contact_button">Contact Us</button>
</div>
<div class="Contact_section_sub">

</div>



</body>
</html>


