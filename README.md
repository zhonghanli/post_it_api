# post_it_api
Spring REST API Backend for PostIt Application

Post Its Model:
Integer Id
String title
String Content

After running the application, several commands become available:

http://localhost:8080/posts
Returns a JSON list of all current posts

http://localhost:8080/createpost
Post request for adding a new post

http://localhost:8080/deletepost
Post request for deleting a post, requires an id
