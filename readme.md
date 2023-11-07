# Make  backend API For User

## Features
- add users
- delete users
- list user
- get user by id 

## Concepts
- N-Tier Layer Design
- Package By Feature

# N-Tier Layer 

Tenants -> split the app into 3 layers
- "presentation" -> there the I/O or the public interface for the app
- "service" / "business" -> business layer has alll the logic 
- "data" -> is here to act as an interface to the datastore

Next Time:
 - Testing, how this pattern helps with testing (intro JUnit)
 - Ability to switch layer implementation; testing the public layer not implementation