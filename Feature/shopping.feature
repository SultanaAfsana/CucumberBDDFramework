Feature: Users with valid credentials can purchase the men jacket

Description: "Online user can register luma E-commerce web-site to purchase"
	            "return, deliver, exchange, clearance, sale, etc."

@Sanity
Scenario Outline: Users can login to the application with valid credentials and 
							purchase the desired men jacket

	Given User is already logged in to the application and verify the user information on the landing page 
	When User should be able to select "<specific>" jacket from the men module
	And Verify the jacket name on the "<specific>" list 
	And User should be able to select the "<size>" and "<color>" and "<quantity>"then click on the add to cart 
	And User should be able to click on the cart and checkout 
	And User should be able to enter the shipping details and click on the Next 
	And User should be able to verify the shipping address and place the order 
	Then User should be able to verify the order number and get text on the screen "Thank you for your purchase!"
	Examples: 
		|            specific          | size | color | quantity |         
		|Jupiter All-Weather Trainer   |  M   | Blue  |    1     |

