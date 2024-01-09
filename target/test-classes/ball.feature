Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the browser and maximise window
When To launch the url fb application
And To click the create new account button 

#One dimensional map data
And To pass first name in firstname text box 
#key				#value
|firstname1|Krishika|
|firstname2|Samaira|
|firstname3|Sasvika|

And To pass secondname in secondname text box

#Two dimensional mapdata
And To pass mobileno or email in email text box
|password1|password2|password3|
|sammy|sharma|80987|
|cvghh|dfdffdf|23456|
|dfdfd|2345645|rfgrtg|

And To create new password using new password text box 

Then To close the chrome browser

