# demo-reactive-city-search

This project is a demo spring boot project, that can be downloaded and run independently from any other projects and tools. It aims to show that how a rest end point with a reactive streams publisher body acts different than a rest API with a traditional rest end point.

Since this project is a demo project, no event driven messaging or a database with R2DBC connectivity is used. Instead a collection of items is created within a Repo object, and a Flux object is created from this collection's iterator and finally a Streaming JSON Response is being produced with a sample rest end point.

You can download and use the content as a sandbox and see how your changes on the reactive publisher effects the lifecycle of gathering data through the given end points.

### How to run
- Download the contents of the project
- Since this is a maven project, run mvn clean install spring-boot:run command to get it working
- There is a built in rest end point with a Get Http method that can be called using the URL: http://localhost:8080/csumut/city/getBetween/{firstString}/{secondString}
- You can directly call the URL above through a web browser to see how rest end point is serving the data.

### Server features

There is an application.properties in src/main/resources folder

server.context-path paremeter can be overridden to change the context path of the project
server.port parameter can be changed to alter running netty's port. Default is: 8080

### Sample end point

Afer running the project, you can call:
 http://localhost:8080/csumut/city/getBetween/{firstString}/{secondString}
URL to list cities of Turkiye along with its car licensing plate number assigned in JSON format 

{firstString } can be replaced with any string pattern (only letters) to narrow city contents by querying a start string prefix (included in search results)
{secondString} can be replaced with any string to denote where city listing will finish alpabetically (excluded)

#### e.g.
An example of a callable URL is:
 http://localhost:8080/csumut/city/getBetween/ab/afz

will only give you 3 results:

Adana
Adiyaman
Afyon

which are actually the cities between "ab - afz". Note that searching is case insensitive.

### More on architecture

...TBD...
