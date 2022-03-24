package hw12XpathSelenium;

public class DynamicXpath {
	// Tag with single attribute.
	// Formula: //htmltag[@attributeName='attributeValue']

	/*
	 * 1. //input[@id='twotabsearchtextbox'], Ref:
	 * https://www.amazon.com/ref=nav_logo 2. //a[@class='skip-link'] 3.
	 * //select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute
	 * nav-progressive-search-dropdown'] 4.
	 * //span[@id='nav-link-accountList-nav-line-1'] 5.
	 * //div[@id='nav-flyout-amazonprime']
	 */

	// 2) Tag with multiple attribute with 'or' logic
	// Formula: //html tag [@attribute name = 'attribute value' or @attribute name =
	// 'attribute value']

	/*
	 * 1. //div[@id='nav-flyout-amazonprime' or @class='nav-coreFlyout nav-flyout']
	 * 2. //span[@class='nav-line-2 nav-progressive-content'
	 * or @id='glow-ingress-line2'] 3. //span[@id='nav-cart-count'
	 * or @class='nav-cart-count nav-cart-10 nav-progressive-attribute
	 * nav-progressive-content'] 4. //input[@id='enterID-input'
	 * or @name='dummy-onlineId'] 5.
	 */

	// 3) Tag with multiple attribute with 'and' logic:-
	//Formula: html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']
	
	/*
	 * 1. //input[@id='nav-search-submit-button' and @class='nav-input
	 * nav-progressive-attribute'] 2. //a[@class='a-button-text a-text-center'
	 * and @id='a-autoid-3-announce'] 3. //button[@class='cms-green-button-reg'
	 * and @id='cms-login-submit'] 4. //button[@class='cms-nav-link border-0 mb-0
	 * custFnt active' and @id='cms-loginLink'] 5. //em[@class='cms-icon
	 * cms-sprite-loggedout ms-3' and @id='cms-homepage-header-logo-unauth']
	 */

	// 4) Tag with inner text [means complete text]
	// Formula: //html tag [text() = 'inner text value' ]
	/*
	 1. //a[text()='Amazon Launchpad'] 
	 2. //span[text()='Better Money Habits®'] 
	 3. //p[text()='Stay connected with our app'] 
	 4. //h2[text()='How can we help?']
	 5. //h3[text()='Our Client Care Commitment']
	 */

	// 5) Tag with inner text [not actual text, means partial text as well as actual
	// text]
	// Formula: //html tag [contains(text(), 'partial or complete inner text value')
	// ]
	/*
	 1. //p[contains(text(), 'Stay connected ')] 
	 2. //p[contains(text(), 'We know you work hard to make life')] 
	 3. //p[contains(text(), 'The Enterprise Portal is a gateway')] 
	 4. //div[contains(text(),'Want to pick up your new debit card curbside?')] 
	 5. //p[contains(text(),'On the network with more 5G bars in moreplaces. Via 24 monthly bill credits ')]
	 */

	// 6) Tag with attributes and use of contains

	// Formula: //html tag [contains(@attribute, 'attribute value') ]
	/*
	 1. //input[contains(@name, 'dummy-onlineId')] 
	 2.//button[contains(@class,'unav-account__toggle')] 
	 3. //span[contains(@class,'btn-bofa-blue-lock')] 
	 4. //a[contains(@id,'user-link-dropdown-item-category-name-1-0-0')] 
	 5. //a[contains(@class,'pagination-old')]
	 */

	// 7) Starts with text
	// Formula: //html tag [starts-with(text(), 'attribute value')]
	/*
	 * 1. //p[starts-with(text(),'The Mount Sinai Health')] 
	 * 2. //p[starts-with(text(),'Mount Sinai Health ')] 
	 * 3. //p[starts-with(text(),'Whether you have')] 
	 * 4. //p[starts-with(text(),'Whether you have an ')] 
	 * 5. //p[starts-with(text(),'Life in New York City is busy. You work. You')]
	 */

	// 8) Starts with attribute (not commonly used, no need to practice it)
	/*
	 * 1. //select[starts-with(@class,'nav-search-dropdown searchSelect ')] 
	 * 2.//a[starts-with(@class,'org-logo')] 
	 * 3. //i[starts-with(@class,'zmdi zmdi-chevron-down')] 
	 * 4. //span[starts-with(@class,'icp-nav-flag icp-nav-flag-us')] 
	 * 5. //input[starts-with(@id,'nav-search-submit-button')]
	 */

	// 9) Normalize space -- eliminates leading and trailing spaces. (high level)
	/*
	 * 1. //a[normalize-space(text())='Find a Doctor'] 
	 * 2. //a[normalize-space(text())='Request an Appointment'] 
	 * 3. //a[normalize-space(text())='Our Locations'] 
	 * 4. //a[normalize-space(text())='Patient Care'] 
	 * 5. //a[normalize-space(text())='About Us']
	 */

}
