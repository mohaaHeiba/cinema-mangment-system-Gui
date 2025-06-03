# Cinema Management System

A Java-based GUI application for managing a cinema system, built using Swing framework. This system provides a complete solution for movie management, ticket booking, and administrative tasks.

## Features

### User Authentication
- Secure login system with username/password authentication
- Default credentials: 
  - Username: `heiba`
  - Password: `123456`

### Movie Management
- Add new movies with details (title, genre, duration)
- Delete and modify existing movies
- View trending movies with popularity scores
- Movie catalog display with poster images

### Ticket Booking System
- Purchase tickets for selected movies
- Select seat numbers
- Date booking functionality
- Discount code system with special offers:
  - "abo heiba": 90% discount
  - "ziad shaker": 95% discount
  - "hady": Special discount

### Administrative Features
- Movie management dashboard
- Sales reports and analytics
- Trending movies monitoring
- User management (under construction)

## Technical Details

### Project Structure
```
src/
├── cinema_mangment_system/
│   ├── AddMovie.java         # Movie addition interface
│   ├── Delete.java           # Movie deletion and modification
│   ├── face.java            # Main dashboard interface
│   ├── main.java            # Login interface
│   ├── report.java          # Sales and analytics reports
│   ├── user.java            # Ticket booking interface
│   └── ViewTrendingMovie.java # Trending movies display
└── icon/                    # Application icons and images
```

### Dependencies
- Java Development Kit (JDK)
- Swing Framework (included in JDK)

### UI Components
- Modern and intuitive user interface
- Responsive design with custom styling
- Image-based movie selection
- Interactive tables for data display
- Custom dialog boxes for user interactions

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (recommended: IntelliJ IDEA, Eclipse, or NetBeans)

### Running the Application
1. Launch the application
2. Login using the default credentials:
   - Username: `heiba`
   - Password: `123456`
3. Navigate through the system using the main dashboard

## Features in Development
- User management system
- Additional administrative features
- Enhanced reporting capabilities
- Advanced booking system

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
- Built with Java Swing framework
- Icons and images from various sources