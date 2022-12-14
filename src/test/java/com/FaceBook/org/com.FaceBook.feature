Feature: Checking The Login Functionality Of FaceBook Page

@Test
Scenario Outline: Login_Page

Given user Launch The Url
When user Enter The "<Email>" In The Email Field
And user Enter The "<Password>" In The Password Field
And user Click The Login Button To Login
Then user Take Screenshot

Examples: 
|Email|Password|
|abc|123|
|xyz|554|
|ppp|425|
