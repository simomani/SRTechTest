# SR Technical Test

## Configuration

### Application

In order to run the application, the source code has to be cloned from GitHub. Then the application can be run by
following these steps from the command line:

    git clone https://github.com/simomani/SRTechTest.git
    cd SRTechTest
    mvn tomcat7:run-war

### Test the Application

In order to test the first part of the application go to:

	http://localhost:8080/SilverRail/encryption/encrypt?text=silver
	http://localhost:8080/SilverRail/encryption/encrypt?text=rail
	
To test the second part of the application go to:
	
	http://localhost:8080/SilverRail/encryption/count?letter=s
	http://localhost:8080/SilverRail/encryption/count?letter=r

### Decisions

I was unsure whether or not to use a simple database or store the letter occurrence using cookies or cache, but at
the end I decided to use a simple Singleton resource to keep track of the occurrences.

