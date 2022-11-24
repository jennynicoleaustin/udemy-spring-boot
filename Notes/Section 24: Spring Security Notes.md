# Spring Security 

### JWT-based Authentication
- Token based authentication. 
- API checks if the token is valid and grants access if it is. 

#### The Pathways 
1. Signing up
2. JWT is sent back - consisting of...
   - Header
     - metadata about the token
     - includes the algorithm used and the type of token being sent
   - Payload
     - information about the user. 
   - *Never EVER EVER include sensitive data in the header or payload because it is very easily decoded*
   - Signature
     - produces a digital signature that includes the header, body, and secret key.
       - secret key is the key to securing the information. 
3. JWT Authorization filter
   - Uses the signature to test is signature matches to verify the token is valid
   - Sets the authorization on the security context holder



### Basic Security - Should be avoided. 

#### Authentication 
- Validates the identity of client 

#### Authorization 
- Determines what they have access to. 

#### HTTP Request
- Header
  - colon seperated field value pairs that describe the request. 
  - Authorization field
- Body
  - payload we are sending API 

#### Security Config
- After signing in the httpSecurity automatically creates a session for the user and stores it inside a cookie.