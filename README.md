Project components:
    XML Parser
    MySQL Database
    Tomcat WebServer
    Java Backend
    HTML/CSS (Bootstrap)/Vanilla JS Frontend

Project Structure:
    Main
        Java
            com.QuABaseBD
                featureCategories - Contains the class representations of the 8 feature categories
                rest - Contains the API logic
                staticClasses - Contains classes that provide static operations
        webapp
            js - Contains JS files written specific to this project
            subpages.heatMap - Contains the heatMap HTML page
            index.html - Radar chart HTML page

Libraries:
    Chart.js
    Jersey
    mysql-connnector
    Gson


XML Parser/MySQL Database
    This project can be found here: https://github.com/andrewdickens/NEU_Reading_QuABaseBD_XMLParser.
    Generally, it parses the database into 3 separate tables, only 1 of which is used.  There are quite
    a few optimization that could be made once the XML is parsed (deleting unused tables is only one
    example).  Additional parsing is required, but that is handled by the "Array Parser," which is
    implemented in the backend.

    The Feature_Category table is all that's needed in this project.


Java Backend
    The backend is about 90% complete (not including tests).  There are a persisting bugs that need to
    be fixed.
        1.  The FeatureRatings class contains the logic that compares the input feature with what's
        stored in the database.  There are a few categories with values that don't match (so these
        charts will always return faulty values (50).  Once a chart is generated, a value of 50 will
        generally indicate this bug case.
        2.  Ian requested the above comparison logic be based off a JSON file, instead of hardcoded into
        the backend.  I implemented this with the Data_Model JSON.  This is currently implemented with
        an absolute file path unique to my file directory, so will need to be updated once this is
        deployed on another system.
        3.  The Heat Map implementation is slow.  I haven't had a chance to dig into this, but I suspect
        it is completing unnecessary operation for each value it has to compute/send to the front end.
        This area is a optimization opportunity.  In general, my focus was the Radar Chart.
        4.  Documentation is incomplete, but the framework for the documentation has been added to all
        files.

Frontend
    The front end is complete.  The API correctly calls the backend and returns the appropriate values.

