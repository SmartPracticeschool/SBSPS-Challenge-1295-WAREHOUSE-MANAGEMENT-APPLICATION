# SBSPS-Challenge-1295-WAREHOUSE-MANAGEMENT-APPLICATION
## Description
This is an overview of the project for the hackathon. The data was fed to the cloud and the best machine learning algorithm that gives the most accurate results on the test data-set was chosen. A machine learning model was trained using the chosen algorithm. This model will be the core technology on which our web and mobile applications will function.
A web application was created which interact with the ML model deployed on the IBM Cloud. The user- interface created will take product code, city code, base price, promotion of an event as inputs, and display different graphs that will show the predicted weights and the predicted earnings for a particular product in a particular week.
The machine-learning algorithm used can make demand forecasts based not just on historical sales data but also on other influencing parameters like internal factors such as advertising campaigns. The ML model was used to display the information on a mobile application as well. Itis based on the same principles that the website is built upon.
## Existing problem
A food delivery service has to deal with a lot of perishable raw materials which makes it all, the existing problem for such a company is to accurately forecast daily and weekly demand. Too much inventory in the warehouse means more risk of wastage, and not enough could lead to out-of-stocks - and push customers to seek solutions from your competitors. The replenishment of the majority of raw materials is done every week and since the raw material is perishable, thus procurement planning is of utmost importance.
## Proposed solution
The proposed solution is a web application/mobile application that will interact with the ml model integrated on the IBM cloud. The web application will take product code, city code, base price of the product, and promotion of the product as inputs and display different graphs that will show the predicted weights and the predicted earnings for a particular product in a particular week. The machine-learning algorithm used can make demand forecasts based not just on historical sales data but also on other influencing parameters like internal factors such as advertising campaigns.
## WEB APPLICATION
This is the user interface created which takes Center Id ,Product Id,the base price of the product and the week number on which the number of orders of that product is to be predicted.
![](Screenshot%(845).png)
After entering the required inputs in the form as shown above we get the required predictions.The visualization is enhanced by creating two graphs.The first graph shows the predictions i.e the expected number of orders for the product in the coming weeks.The second graph shows the expected earnings of the product in the coming weeks.
![](Screenshot%(844).png)
## Hardware/Software designing
* Various IBM software technologies are used in making of the project.
* For back-end implementation IBM Machine Learning service AUTO AI is used to select the best possible algorithm for the prediction.
* DB2 database is used to store the necessary information about the product and center,
* And finally, Node-Red is used for the front-end implementation. 
* For mobile application development, android studio is used.
## Applications
It can have a wide area of applications, particularly in the manufacturing sector where we need accurate inventory management and demand forecasting. Thus it shall be crucial for supply-chain management.
