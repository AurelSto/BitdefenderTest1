1. Cart Price Check
-The price, in the cart, is being displayed correctly



2. Cart Quantity Change
-The rabbat, of 57%, changes after the ammount is changed, from 79.34 to 79.33.
Because the final price differs by 1 Euro Cent, the test case fails.

-The rabbat of 79.34eur only applies for one ammount: 
	-139.99 - 79.34 = 60.65   (50.97 subtotal + 9.68 VAT)
	-279.98 - 79.33 = 200.65  (168.61 subtotal + 32.04 VAT)

-The 1 Euro Cent discrepancy only appears when the ammount is 2 or 3.
When the ammount is 4 or 5 (5 being the maximum allowed ammont) it's fine.


-The test case "Cart quantity change" logs the failed doubled price check (step 10)
then continues with the next step:
=============== ROOT CAUSE =====================
Caused by: com.kms.katalon.core.exception.StepFailedException: Actual text '200.65 €' 
and expected text '200.64 €' of test object 'Object Repository/Double Cart Ammount, 
then delete/Page_Bitdefender - Get protection/span_200.65' are NOT matched.

Miscellaneous:
-The test automation tool used is Katalon Studio
-The cookie pop-up kept appearing with every run, hence the presence of step 3
which clicks on the "OK" button.
-Since I worked on a machine with a german IP, some object names are in german.
-The used browser was Google Chrome.
