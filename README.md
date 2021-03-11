#Update 03/11/2021
I am no longer building a fat jar.  This may change again.

# Update 03/10/2021
I forked this product to possibly use it in another project for the company I work for currently.  I have made some changes to clean up the code, and I created a Gradle build system for the project.  The version of Gradle I am currently using is Gradle 6.8.2.

I changed the versioning scheme to be more of a standard versioning.  I am starting out at 2.0, and I am treating anything before as part of 1.0.

Currently, the jar produced is a fat jar containing all the dependencies.  I may change this in the future.

Included in the jar are the following libraries:  
* Apache Commons Codec 1.15 (commons-codec-1.15)<br>
    Website: https://commons.apache.org/proper/commons-codec/  
    License: Apache License; Version 2.0, January 2004; http://www.apache.org/licenses/  
* javaWsDiscovery (this was included in the original repository)  
    Repository: https://github.com/queues-enforth-development/javaWsDiscovery  

# onvif-java-lib (Original README.md contents)
ONVIF (Open Network Video Interface Forum) is a community to standardize communication between IP-based security products (like cameras).

I developed a Java library for the ONVIF spezification. It helps you with the basics (you don't need to learn SOAP e.g.) but you may need to learn a few basics about the ONVIF spezification. As far as I know, this is the first public Java project for the ONVIF spezification.

The project is still in development, so if you need features or know better solutions than mine, let me know.

This project is not officially supported by ONVIF! It has been created in a academic project from Hochschule Trier in Germany. 
