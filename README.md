Introduction
Right here is my Application called “History Age App”. This app is about matching the age of the user with the age of any famous person in history that died at that age. This app targets students but also all ages.

Purpose of the App
The purpose of this app is to make leaning history fun for every user. This app is designed to create a friendly environment, that provides users with knowledge and also fun to use. The best part about this app is that it provides the users with the an educational experience. This app allows users to enter their age and then it provides feedback by telling the users which historical figure in history died at that specific age. This will be beneficial to the leaner because not many people love learning history, therefore it will be a fun way of learning history. This app also provides information about the history figure e.g. What they were famous for.

Features of the App
- Heading
- Background image 
- An input text field
-Buttons
- Text Display/ Text View

Functions of the App features
-	Heading ~ this serves as the name of the app. In my case the heading of my application is called “History Age app”. This enhance the user experience by providing a visual hierarchy. I also made font of  the heading to be bold so that it will be able to recognise. The colour of the heading is inn black because it matches with the background image.

-	Background image ~ the background image serves as visual appeal for the app and it creates a more engaging environment. Here is the background image I chose for the apps background ,
  
         Images taken from google
 (Black and white historical photos, 2024)
(Mullatoez, 2021)

The reason why l chose these two pictures as my background images is because, firstly the colour on the images are in grey and white and that resembles the ancient times. In the picture you can see that this image was taken back then, thus since the app is about history, I figured that would be appropriate to use it as my background images.

-	Text field ~ The function for the text field is to allow users to enter their age. This feature is important for the app because there has to be an age entered for the app to generate and match that age with the age of a historical figure. The text field provides a user -friendly way to get customized information based on their age.  On my text field, l set it to only receive whole numbers as input because can only be an integer.

-	Button ~ The button is the most important part of the app because it generates the age entered and also matches it with the historical figure. In the app there are 2 buttons. The first button is the one that generate the history and the second button clears the input and also clears the information displayed. The clear button clears the age entered and also clears the information displayed about the historical figure. Both of the buttons are set on click listener , which means if the buttons are clicked the will perfume their specific function.

-	Text View ~ This feature present the information about the historical figure according to the age entered. This text view will show the name of the person and what that person was known of and the age they died. This also provides a friendly-user experience because, the get to see their personalized information after they press the button. This will also clear up when the clear button is press.

App Layout / UI design

The layout of the app mainly focuses on the app features. The layout od the app is designed to create a user- friendly experience. The colour are meant to fit in with the description of the app .The app consists of 3 constraints layouts which are the header constraint layout . The header constraint layout consist of the first background image as well as the heading. The second constraint layout is the main part or main section, int the main section there is the text field and 2 buttons and the background colour is black. l chose this colour to match up with the colours of the buttons and lastly it looks pretty interesting. Overall, the structure of the app is supposed to provide users with a friendly, fun experience.

Explanation of the code and the function

First of all in my code , I created my UI design in the activity.xml file . After that l declared all of my components in my main activity file.
In my clear button a putted the age variable and putted the clear function next to it , this will it will clear the age entered. On my text view part , l putted an empty string to it (“”) and the information will be cleared once the button is clicked.
            Generate history button
          -This part there is a lot of information and l wont put all of it but l will put             the important functions .
   Error handling part 
      I had putted the function to handle the age input , to check if it falls in the             range of 20-100 but when l run the app , its not displaying . The code was supposed to check if the age entered is within the range and if not it not  should display an error message and also ask the user to enter number that is within the range. Unfortunately, this feature is not working in the app.
When statements
 The when statement checks if the age entered is within the range and after that it displays the corresponding information. It also checks the age under multiple conditions. In the app, when the user enters the age it must checks all the conditions and if it matches then it displays but if it does not match ant then it tries others conditions. In this app l used the age intervals e. g 20-30, 30-40 etc until 100. When the user enters the number, it should be able to display any information about a historical figure in that specific range else it should display a message telling the user to enter the age between 20 and 100. For example, if the user enters the age 20 then it should display the age entered and the information e. g. “your age is 20, the famous person in history is Jane and she was a famous painter died at the age of 25”. 

Famous historian figures used  (Pettinger, 2006)
-Jane Austen, a well- known English novelist died at the age of 25.
-William Shakespeare, English poet and a playwright who died at the age of 52.
-Famous French painter, Leonardo Da Vinci who died at the age of 67.
- Mother Teresa Roman Catholic nun who devoted her life to serving the poor, died at the age of 87.
-Albert Einstein, one of the most celebrated scientists of the Twentieth century, who died at the age of 76.
-Nelson Mandela was an activist member of the fight against apartheid in South Africa, who died at the age of 95.
-Wolfgang Amadeus Mozart an Austrian composer, who died at the age of 35

Testing and automated testing 








Conclusion
Here is what to expect in the readme file
-video demonstration of the app running 
- the documentation.
I would like to conclude saying this is what I did on my app and its nothing fancy but l really tried my best. Thank you.


 
References
CODE ATTRIBUTION 
//code attribution
//Stack overflow
// formatting - Best way to format if statement with multiple conditions - Stack Overflow
// Eoin Campbell
// User Eoin Campbell - Stack Overflow

 
References
Black and white historical photos. (2024). Retrieved April 1, 2024, from Slide share: https://www.slideshare.net/1Alberto1/black-and-white-historical-photos
Education, I. I. (2024). Introduction to Mobile Application Development. 
Mullatoez. (2021). Kotlin tutorials. Retrieved April 02, 2024, from Youtube: https://www.youtube.com/watch?v=0HIT3uhJ6UY
Pettinger, T. (2006). Famous people in history who died. Retrieved April 02, 2024, from Biography online: https://www.biographyonline.net/people/famous-100.html#google_vignette


