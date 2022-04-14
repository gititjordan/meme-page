#  Team RunTime Exception Design Document

## Instructions

*Save a copy of this template for your team in the same folder that contains
this template.*

*Replace italicized text (including this text!) with details of the design you
are proposing for your team project. (Your replacement text shouldn't be in
italics)*

*You should take a look at the example design document in the same folder as
this template for more guidance on the types of information to capture, and the
level of detail to aim for.*

## Horrible Meme Horoscope Design

## 1. Problem Statement

*User wants to get meme that foresee their day, save it and share*


## 2. Top Questions to Resolve in Review

*List the most important questions you have about your design, or things that
you are still debating internally that you might like help working through.*

1.   Whether to use meme Api or internal links.
2.    Is it possible to use Cognito with DynamoDB

## 3. Use Cases

*This is where we work backwards from the customer and define what our customers
would like to do (and why). You may also include use cases for yourselves, or
for the organization providing the product to customers.*

U1. *As a [product] customer, I want to `<result>` when I `<action>`*

U1. As a user, I want to get my foreseen meme when I press the ‘see my meme horoscope today’’.

U2. *As a [product] customer, I want to view my grocery list when I log into the
grocery list page*

U2. As a user, I want to be able to save the generated meme into my list of saved memes.

U3. As a user, I want to be able to send the generated meme to others via multiple platforms.


## 4. Project Scope

*Clarify which parts of the problem you intend to solve. It helps reviewers know
what questions to ask to make sure you are solving for what you say and stops
discussions from getting sidetracked by aspects you do not intend to handle in
your design.*

### 4.1. In Scope

*Which parts of the problem defined in Sections 1 and 2 will you solve with this
design?*

* Retrieve a picture from a database and display
* Only display pictures related to the User's interests
* The ability to save pictures to the users account
* send pictures to other users

### 4.2. Out of Scope

* Users will not be able to add their own picture
* Users will not be able to comment on pictures
* Users do not have the ability to send comments with pictures
* Users do not have the ability to create their own tags

# 5. Proposed Architecture Overview

*Describe broadly how you are proposing to solve for the requirements you
described in Section 2.*

*This may include class diagram(s) showing what components you are planning to
build.*

*You should argue why this architecture (organization of components) is
reasonable. That is, why it represents a good data flow and a good separation of
concerns. Where applicable, argue why this architecture satisfies the stated
requirements.*

# 6. API

## 6.1. Public Models

*Define the data models your service will expose in its responses via your
*`-Model`* package. These will be equivalent to the *`PlaylistModel`* and
*`SongModel`* from the Unit 3 project.*

`UserModel` - Contains Cognito Id and list of preferences

`MemeModel` - Contains memeName, possibly unique Asin, Url

## 6.2. *First Endpoint*

*Describe the behavior of the first endpoint you will build into your service
API. This should include what data it requires, what data it returns, and how it
will handle any known failure cases. You should also include a sequence diagram
showing how a user interaction goes from user to website to service to database,
and back. This first endpoint can serve as a template for subsequent endpoints.
(If there is a significant difference on a subsequent endpoint, review that with
your team before building it!)*

*(You should have a separate section for each of the endpoints you are expecting
to build...)*

## 6.3 *Second Endpoint*

*(repeat, but you can use shorthand here, indicating what is different, likely
primarily the data in/out and error conditions. If the sequence diagram is
nearly identical, you can say in a few words how it is the same/different from
the first endpoint)*

# 7. Tables



###User Table
email (partition_key) : String

Password : String






###Meme Table
memeName (sort_key) : String

imageLink (partition_key) : String


###Meme Liked List Table
email (partition_key) : String

imageLinkList : List







# 8. Pages

*Include mock-ups of the web pages you expect to build. These can be as
sophisticated as mockups/wireframes using drawing software, or as simple as
hand-drawn pictures that represent the key customer-facing components of the
pages. It should be clear what the interactions will be on the page, especially
where customers enter and submit data. You may want to accompany the mockups
with some description of behaviors of the page (e.g. “When customer submits the
submit-dog-photo button, the customer is sent to the doggie detail page”)*

###[Website sketch](Frontend-sketch.html)