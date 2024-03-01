
*MODEL* :

![](C:\Users\younes\IdeaProjects\SpringBoot-JPAOneToMany-crud\screens\1.png)

*APIs* :


- Create new tutorial (`POST /tutorials`): This API allows clients to create a new tutorial. The tutorial data is sent in the request body, and it is saved to the database using JPA.


- Retrieve a tutorial by ID (`POST /tutorials`): Clients can retrieve a specific tutorial by its ID. The ID is provided in the URL path, and the API fetches the corresponding tutorial from the database using JPA.


- Retrieve all tutorials (`GET /tutorials`): This API returns a list of all tutorials available in the database. It fetches all tutorials using JPA and returns them as a response.


- Delete a tutorial (and its comments) by ID (`DELETE /tutorials/:id`): Clients can delete a tutorial by its ID. This API also deletes all comments associated with the tutorial, thanks to the one-to-many relationship defined in your database model.


- Update a tutorial by ID (`PUT /tutorials/:id`): This API allows clients to update an existing tutorial. The updated tutorial data is sent in the request body, and the API updates the corresponding tutorial in the database using JPA.


- Create a new comment for a tutorial (`POST /tutorials`): Clients can add a new comment to a tutorial using this API. The comment data, along with the tutorial ID it belongs to, is sent in the request body. The API saves the comment to the database using JPA.


- Retrieve all comments of a tutorial (`GET /tutorials/:id/comments`): This API returns a list of all comments associated with a specific tutorial. Clients need to provide the tutorial ID in the URL path, and the API fetches the comments using JPA.


- Retrieve a comment by ID (`GET /comments/:id`): Clients can retrieve a specific comment by its ID. The ID is provided in the URL path, and the API fetches the corresponding comment from the database using JPA.


- Update a comment by ID (`PUT /comments/:id`): This API allows clients to update an existing comment. The updated comment data is sent in the request body, and the API updates the corresponding comment in the database using JPA.


- Delete a comment by ID (`DELETE /comments/:id`): Clients can delete a comment by its ID. This API deletes the comment from the database using JPA.


- Delete all comments of a tutorial (`DELETE /tutorials/:id/comments`): This API deletes all comments associated with a specific tutorial. It is useful when you want to remove all comments of a tutorial without deleting the tutorial itself.
