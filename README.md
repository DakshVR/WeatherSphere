# WeatherSphere

This Weather App allows users to check the current weather and the five-day forecast for different cities. It utilizes the OpenWeather API for weather data and incorporates features such as Room persistence library for storing forecast locations, a navigation drawer for easy navigation between screens, and the ability to add new cities seamlessly.

## Technologies Used

- Android SDK: The app is developed using the Android Software Development Kit (SDK) for building Android applications.
- Kotlin: Kotlin programming language is used for developing the app, providing concise and expressive syntax.
- Room Persistence Library: Room is used for abstracting away the SQLite database and providing robust database access while utilizing the full power of SQLite.
- OpenWeather API: The app fetches weather data from the OpenWeather API, allowing users to view current weather and five-day forecasts for different cities.
- NavigationUI: NavigationUI is used for providing a navigation drawer, enabling users to navigate between different screens within the app seamlessly.
Features

## Features
- Room Persistence Library Integration: The app utilizes the Room persistence library to incorporate an SQLite database. Each city forecast is saved in the database along with a timestamp indicating when the user last viewed the forecast.
- Save Cities: When the user changes the forecast city in the application settings, the new city is saved into the database. Duplicate entries are avoided by checking if the city already exists in the database.
- Navigation Drawer: The app provides a navigation drawer using NavigationUI, allowing users to navigate between the current weather screen, the five-day forecast screen, and the settings screen.
- List of Saved Cities: The navigation drawer lists all saved cities ordered from most-recently viewed to least-recently viewed based on timestamps stored in the database. Dynamic content is generated for the NavigationView based on the cities stored in the database.
- Update Forecast: When a user clicks on a city in the navigation drawer, the app closes the drawer, navigates to the current weather screen, fetches and displays the current weather for the selected city, updates the "last viewed" timestamp in the database, and updates the "city" setting to ensure the correct forecast is displayed on subsequent screens.
- Improved City Addition: Added a floating action button that opens a dialog to fetch weather for a new city and adds it to the database, providing a better user experience for adding new cities.
- Location Awareness: For the grad section, the app implements location-awareness by adding a "current location" link to the top of the cities list in the navigation drawer. When selected, it fetches weather data based on the device's current GPS location.
