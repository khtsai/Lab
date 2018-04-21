<?php

echo "<article><header> php registration page</header><br/>";
echo "<section>Your name is: ". $_GET['FirstName']. " ". $_GET["LastName"]. "<br />";
echo "Your organization is: ". $_GET["Organization"]. "<br />";
echo "Your Email is: ". $_GET["Email"]. "<br />";
echo "Your phone is: ". $_GET["Phone"]. "<br />";
echo "Your Address is: ". $_GET["StreetAddress"]. "<br />";
echo "Your url Home Page is: ". $_GET["urlHomePage"]. "<br />";
echo "Your City is: ". $_GET["city"]. "<br />";
echo "Your State is: ". $_GET["State"]. "<br />";
echo "Your Zip is: ". $_GET["Zip"]. "<br />";
echo "Your payment mode is: ". $_GET["paymentMode"]. "<br />";
echo "Your total to pay is: ". $_GET["totalPay"]. "<br />";
echo "Your start date is: ". $_GET["startDate"]. "<br />";
echo "Your favorite color is: ". $_GET["favoriteColor"]. "</section><br />";
echo "<footer> Thank you for the registration </footer></article>"

?>