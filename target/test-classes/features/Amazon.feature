Feature: Feature file for the Amazon Application

Scenario Outline: Positive test case validating login of Amazon account
Given Initialize the browser with Chrome
And Navigate to "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1" site
When User enter <EmailIdORmobileNo> and click on continue button
And Enter <password> and click on Login button
Then verify that user is successfully logged in
And close the browsers

Examples:
|EmailIdORmobileNo	|password	|
|8179425135	|#Anil425135	|
|8179410135	|#Anajh425135	|
|0079425135	|#12il425135	|

#@tag1
#Scenario Outline: Test case for validating the cart option of Amazon account
#Given Initialize the browser with Chrome
#And Navigate to "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1" site
#When User enter <EmailIdORmobileNo> and click on continue button
#And Enter <password> and click on Login button
#Then Select the 'book' from the category dropdown
#And enter <BookName> and validate the 'book name' on the top pane then click on search button
#And Click first book link and add to cart
#Then Get the bookname Author and price details and remove the book from the cart
#And Validate if the cart is empty
#Then close the browsers
#
#Examples:
#|EmailIdORmobileNo	|password |BookName	|
#|8179425135	|#Anil425135 |selenium webdriver rajeev gupta |





